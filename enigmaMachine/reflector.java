//package enigmaMachine;

public class reflector
{                                   //A   B    C    D    E    F
    protected char[] forwardWiring={'E', 'D', 'F', 'B', 'A', 'C'};
    public rotor r1; 
    public rotor r2;
    public rotor r3;
    public plugboard plug;

    public reflector(rotor r1, rotor r2, rotor r3, plugboard plug)  //reflector uses rotors and plugboard objects to make backwards calls
    {
        this.r1=r1;
        this.r2=r2;
        this.r3=r3;
        this.plug=plug;
    }
    public char back(char c)
    {
        int x=(int)c-65;
        c=forwardWiring[x];
        System.out.print(" reflect "+c+"->");   //maps out for debugging and understanding
        c=r3.back(c);
        System.out.print(" r3 reflect "+c+"->");
        c=r2.back(c);
        System.out.print(" r2 reflect "+c+"->");
        c=r1.back(c);
        System.out.print(" r reflect "+c+"->");
        c=plug.forward(c);
        return c;
    }
}