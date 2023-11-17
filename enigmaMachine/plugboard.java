//package enigmaMachine;

public class plugboard
{
    private char[] wiring={'B', 'A', 'F', 'E', 'D', 'C'};//one possible plugboard, to make things easy
    // backwards is         A    B    C    D    E    F
    public plugboard(){}
    public char forward(char c) //plugboard is symmetrical, so forward and back are the same
    {
        int x=(int)c-65; //converts ASCII to index
        return wiring[x];
    }
}