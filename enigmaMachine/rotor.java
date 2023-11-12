//package enigmaMachine;

public class rotor
{
    private char[] forward={'B', 'F', 'A', 'E', 'D', 'C'};
    private char[] backward={'F', 'E', 'B', 'A', 'C', 'D'};
    protected int position;

    public rotor() //rotor will default to same tick position, wiring, and rotor for ease
    {

    }
    public char encode(char c)
    {
        for(int i=0; i<=forward.length-1; i++)
        {
            if(c == forward[i])
                return backward[i];
        }
        return 'X';
    }
    public char back(char c)
    {
        for(int i=0; i<=backward.length-1; i++)
        {
            if(c == backward[i])
                c=forward[i];
        }
        return c;
    }
    public void tick()
    {
        char[] temp= new char[backward.length];
        temp[0]=backward[backward.length-1];
        for(int i=1; i<=backward.length-1; i++)
        {
            temp[i]=backward[i-1];
        }
        for(int i=0; i<=backward.length-1; i++)
        {
            backward[i]=temp[i];
        }
    }
}