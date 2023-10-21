import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterReader 
{
    int count=0;
    String rotor="bdeac";
    public static void main(String[] args) 
    {
        String fileName = "your_text_file.txt"; // txt file wil message, alphabet = "abcde" 
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int character;

            while ((character = reader.read()) != -1) {
                char charValue = (char) character;

                //scramble method

                System.out.print(charValue); // instead of print, add to new txt file
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
    public char plugBorad(char c)
    {
        String s = "adcbe";
        switch
    }
    public char rotor(char c)
    {
    
    }
    public void ringSelect()
    {
        if(count%5 == 0)
        {
            //reconfig rotor by one
        }
    }
}
