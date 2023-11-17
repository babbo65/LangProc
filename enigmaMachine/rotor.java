public class rotor { 
                        //A    B    C    D    E    F
    private char[] hard={'A', 'B', 'C', 'D', 'E', 'F'};
    private char[] forward;

    public rotor(char[] forward) // rotor will default to same tick position, wiring, and rotor for ease
    {
        this.forward = forward;
    }
    public char encode(char c) {
        int x = c - 65; // converts ASCII to index
        return forward[x];
    }
    public char back(char c) //maps forward character to index of static array "hard"
    {
        int e=0;
        for(int i=0; i<=forward.length-1; i++)
        {
            if(c == forward[i])
                e=i;
        }
        return hard[e];
    }
    public void tick() // makes new array, starts at end of rotor, then rotates down, sets new array to forward
    {
        char[] temp2 = new char[forward.length];
        temp2[0] = forward[forward.length - 1];
        for (int i = 1; i <= forward.length - 1; i++) {
            temp2[i] = forward[i - 1];
        }
        for (int i = 0; i <= forward.length - 1; i++) {
            forward[i] = temp2[i];
        }
    }
}