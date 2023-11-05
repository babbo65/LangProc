import enigmaMachine.*;

class Main
{
    public static void main(String args[])
    {
        plugboard plug=new plugboard();
        rotor r1=new rotor();
        reflector reflect=new reflector(r1, plug);
        enigma machine=new enigma(reflect, r1, plug);

        char c=machine.encrypt('A');
        System.out.println(c);
    }
}