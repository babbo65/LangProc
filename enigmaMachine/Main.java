//import enigmaMachine.*;

class Main
{
    public static void main(String args[])
    {
        plugboard plug=new plugboard();

                        //A    B    C    D    E    F
        char[] forward1={'B', 'F', 'A', 'E', 'D', 'C'};
        //char[] backward1={'C', 'A', 'F', 'E', 'D', 'B'};
                        //A    B    C    D    E    F

                        //A    B    C    D    E    F
        char[] forward2={'C', 'D', 'B', 'F', 'A', 'E'};
        //char[] backward2={'E', 'C', 'A', 'B', 'F', 'D'};
                        //A    B    C    D    E    F

                        //A    B    C    D    E    F
        char[] forward3={'F', 'D', 'B', 'C', 'A', 'E'};
        //char[] backward3={'E', 'C', 'D', 'B', 'F', 'A'};
                        //A    B    C    D    E    F

        rotor r1=new rotor(forward1);
        rotor r2=new rotor(forward2);
        rotor r3=new rotor(forward3);
        reflector reflect=new reflector(r1, r2, r3, plug);
        enigma machine=new enigma(reflect, r1, r2, r3, plug);

        char c=machine.encrypt('C');    // FACADE -> CDFDAF
        char d=machine.encrypt('D');
        char e=machine.encrypt('F');
        char f=machine.encrypt('D');
        char g=machine.encrypt('A');
        char h=machine.encrypt('F');
        System.out.println(" final "+c+d+e+f+g+h);//prints sequence of steps for debugging
    }
}