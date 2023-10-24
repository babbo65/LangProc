import java.io.*;

class enigma
{
    public static int count=0;                  //variable is refrenced in main methed, must be static
    public static String rotor="bdeac";                //default rotor
    public static void main(String args[]) 
    {
        String input = "input.txt";                              // txt file with message, alphabet = "abcde" 
        File output = new File("output.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            int character;
            while ((character = reader.read()) != -1) {  //ACCOUNT FOR SPACES!!!
                char charValue = (char) character;

                try{
                    charValue=plugBoard(charValue);
                }
                catch(Exception e)
                {

                }

                if

                System.out.println(charValue);

                charValue=rotorScramble(charValue);
                System.out.println(charValue);


                if(count%5 == 0)                      //formats and outputs characters into file
                    writer.write(" ");
                if(count%20 == 0)
                    writer.write("\n");

                System.out.println(charValue);
                writer.write(charValue);
        
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
    public static char plugBoard(char c) throws Exception
    {
        String s = "adcbe";
        switch(c)
        {
            case 'a':
                return 'a';
            case 'b':
                return 'd';
            case 'c':
                return 'c';
            case 'd':
                return 'b';
            case 'e':
                return 'e';
            default:
                throw new Exception();
        }
    }
    public static char rotorScramble(char c)
    {
        count++;
        if(count%5 == 0)
        {
           ringSelect();
        }
        int x=0;
        switch(c)
        {
            case 'a':
                x=0;
            case 'b':
                x=1;;
            case 'c':
                x=2;
            case 'd':
                x=3;
            case 'e':
                x=4;
        }
        return rotor.charAt(x);
    }
    public static void ringSelect()
    {
        String s="";
        s=s+rotor.charAt(1)+rotor.charAt(2)+rotor.charAt(3)+rotor.charAt(4)+rotor.charAt(0);
        rotor=s;
    }
}
