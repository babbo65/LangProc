package enigmaMachine;

public class enigma
{
    public reflector reflect;
    public rotor r1;
    public plugboard plug;

    // A B C D E F
    // 0 1 2 3 4 5
    public enigma(reflector reflect, rotor r1, plugboard plug)
    {
        this.reflect=reflect;
        this.plug=plug;
        this.r1=r1;
    }

    public char encrypt(char c)
    {
        rotate();
        c=plug.forward(c);
        c=r1.encode(c);
        c=reflect.back(c);

        return c;
    }
    public void rotate()
    {
        r1.tick();
    }
}