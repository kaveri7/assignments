/import java.io.*;
        import java.util.Scanner;


public class main
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name of file: ");
        String filename= scan.nextLine();
        int count =0;

        try
        {
            FileReader file = new FileReader(filename);
            BufferedReader reader = new BufferedReader(file);
            String a = "";
            int linecount = 0;
            String line;
            System.out.println("What word are you looking for: ");
            String a1 = scan.nextLine();

            while((line = reader.readLine()) != null)
            {
                linecount++;
                if(line.equalsIgnoreCase("that"));
                count++;
            }
            reader.close();
        }
        catch(IOException e)
        {
            System.out.println("File Not found");
        }
        System.out.println("the word that appears " + count + " many times");
    }
}