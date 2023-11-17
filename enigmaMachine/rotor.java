//package enigmaMachine;
//   https://github.com/mikepound/enigma/blob/main/src/com/mikepound/enigma/Rotor.java
public class rotor { // A B C D E F
    private char[] hard={'A', 'B', 'C', 'D', 'E', 'F'};
    private char[] forward; // ={'B', 'F', 'A', 'E', 'D', 'C'};

    // private char[] backward; //={'C', 'A', 'F', 'E', 'D', 'B'};
    // A B C D E F

    public rotor(char[] forward) // rotor will default to same tick position, wiring, and rotor for
                                                  // ease
    {
        this.forward = forward;
        //this.backward = backward;
    }

    public char encode(char c) {
        /*
         * for(int i=0; i<=forward.length-1; i++)
         * {
         * if(c == forward[i])
         * return backward[i];
         * }
         * return 'X';
         */
        int x = c - 65; // converts ASCII to index
        return forward[x];
    }

    public char back(char c) {
        /*
         * for(int i=0; i<=backward.length-1; i++)
         * {
         * if(c == backward[i])
         * c=forward[i];
         * }
         * return c;
         */
        int e=0;
        for(int i=0; i<=forward.length-1; i++)
        {
            if(c == forward[i])
                e=i;
        }
        return hard[e];
    }

    public void tick() // makes new array, starts ad end of rotor, then rotates down, sets new array to
                       // rotor
    {

        char[] temp2 = new char[forward.length];
        temp2[0] = forward[forward.length - 1];
        for (int i = 1; i <= forward.length - 1; i++) {
            temp2[i] = forward[i - 1];
        }
        System.out.println();
        for (int i = 0; i <= forward.length - 1; i++) {
            forward[i] = temp2[i];
            System.out.print(forward[i] + " ");
        }

        /*
         * char[] temp= new char[backward.length];
         * temp[0]=backward[1];
         * for(int i=backward.length-1; i>=0; i--)
         * {
         * temp[i]=backward[i+1];
         * }
         * System.out.println();
         * for(int i=0; i<=backward.length-1; i++)
         * {
         * backward[i]=temp[i];
         * System.out.print(backward[i]+" ");
         * }
         */

    }
}