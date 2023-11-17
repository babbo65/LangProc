//import enigmaMachine.*;

class Main
{
    public static void main(String args[])
    {
        plugboard plug=new plugboard();
        
        //rotor settings entered here
                        //A    B    C    D    E    F
        char[] forward1={'B', 'F', 'A', 'E', 'D', 'C'};

                        //A    B    C    D    E    F
        char[] forward2={'C', 'D', 'B', 'F', 'A', 'E'};

                        //A    B    C    D    E    F
        char[] forward3={'F', 'D', 'B', 'C', 'A', 'E'};

        rotor r1=new rotor(forward1);
        rotor r2=new rotor(forward2);
        rotor r3=new rotor(forward3);
        reflector reflect=new reflector(r1, r2, r3, plug);
        enigma machine=new enigma(reflect, r1, r2, r3, plug);


        //make encryptions here \/ \/ \/
        char c=machine.encrypt('C');    // FACADE -> CDFDAF
        System.out.println();
        char d=machine.encrypt('D');
        System.out.println();
        char e=machine.encrypt('F');
        System.out.println();
        char f=machine.encrypt('D');
        System.out.println();
        char g=machine.encrypt('A');
        System.out.println();
        char h=machine.encrypt('F');
        System.out.println();
        System.out.println(" final "+c+d+e+f+g+h);//prints sequence of steps for debugging
    }
}