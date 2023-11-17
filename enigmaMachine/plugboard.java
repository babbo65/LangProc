//package enigmaMachine;

public class plugboard
{
    private char[] wiring={'B', 'A', 'F', 'E', 'D', 'C'};   //static plugboard, to make things easy
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
        /*switch(c)
        {
            case 'A':
                return 'B';
            case 'B':
                return 'A';
            case 'C':
                return 'F';
            case 'D':
                return 'E';
            case 'E':
                return 'D';
            case 'F':
                return 'C';
            default:
                throw new Exception();
        }*/
        
        int x=(int)c-65; //converts ASCII to index
        return wiring[x];
    }
}