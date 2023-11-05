package enigmaMachine;

public class plugboard
{
    private char[] wiring={'B', 'D', 'F', 'A', 'C', 'E'};   //static plugboard, to make things easy
    // backwards is         A    B    C    D    E    F
    public plugboard()
    {

    }
    public char forward(char c)
    {
        int x=(int)c-65; //converts ASCII to index
        return wiring[x];
    }
    public char backwards(char c)throws Exception
    {
        switch(c)
        {
            case 'B':
                return 'A';
            case 'D':
                return 'B';
            case 'F':
                return 'C';
            case 'A':
                return 'D';
            case 'C':
                return 'E';
            case 'E':
                return 'F';
            default:
                throw new Exception();
        }
    }
}