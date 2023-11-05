package enigmaMachine;

public class reflector
{
    protected int[] forwardWiring={'B', 'A', 'E', 'C', 'F', 'D'};
    public rotor r1; 
    public plugboard plug;

    public reflector(rotor r1, plugboard plug)
    {
        this.r1=r1;
        this.plug=plug;
    }
    public char back(char c)
    {
        int x=(int)c-65;
        c=forwardWiring[x];
        c=r1.back(c);
        c=plug.backwards(c);
        return c;
    }
}