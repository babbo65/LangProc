//package enigmaMachine;

public class enigma
{
    public reflector reflect;
    public rotor r1;
    public rotor r2;
    public rotor r3;
    public plugboard plug;
    private int count;
    public enigma(reflector reflect, rotor r1, rotor r2, rotor r3, plugboard plug)
    {
        this.reflect=reflect;
        this.plug=plug;
        this.r1=r1;
        this.r2=r2;
        this.r3=r3;
    }
    public char encrypt(char c)
    {
        System.out.print("start "+c+"->");  //prints steps for debugging and understanding
        rotate();                           //rotates rotor one key is pressed then send electrical signal 
        c=plug.forward(c);
        System.out.print(" plug forw "+c+"->");
        c=r1.encode(c);
        System.out.print(" r1 "+c+"->");
        c=r2.encode(c);
        System.out.print(" r2 "+c+"->");
        c=r3.encode(c);
        System.out.print(" r3 "+c+"->");
        c=reflect.back(c);

        return c;
    }
    public void rotate()
    {
        r1.tick();
        count++;
        if(count%6==0)      //rotates second rotor after first makes a full rotation, and on fourth 
        {                   //kind of like gear ratios, 6 rotations = 1 in this case (6:1)
            r2.tick();
        }
        if(count%36==0)
        {
            r3.tick();
        }
    }
}