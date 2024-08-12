import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCounter {

    public static void main(String[] args) {

        HashMap<Character,Integer> frequency = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String for counting the character frequency");
        String str = input.nextLine();
        for(char c :str.toCharArray() )
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