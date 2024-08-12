import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;




    public class FileFrquency {

        public static void main(String[] args) throws IOException {

            HashMap<Character,Integer> frequency = new HashMap<>();
            Scanner input = new Scanner(System.in);
            FileReader fr = new FileReader("C:\\Users\\mohammad.azam\\IdeaProjects\\Java Day 5\\src\\Demo.txt");
            int ch;
            String text = "";
            while((ch=fr.read())!=-1)
            {
                text += (char)ch;
            }
            fr.close();

            System.out.println(text);
//            String str = input.nextLine();
            for(char c :text.toCharArray() )
            {
                if(frequency.containsKey(c))
                {
                    frequency.put(c, frequency.get(c)+1);
                }
                else
                    frequency.put(c,1);
            }
            System.out.println(frequency);

        }
    }

