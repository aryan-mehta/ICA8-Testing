//Author - Aryan Mehta <1225456817>
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class urinals {
    public static int number_of_free_urinals(String urinals) {
        // Returns the number of free available urinals as per the rule.
        //Base Cases
        if (good_or_bad_string(urinals)==false) return -1;
        if (urinals.equals("0")) return 1;
        if (urinals.equals("1")) return 0;

        return 0;
    }
    public static String get_input_string(){
        // Function to take the input from the keyboard.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input_urinals=sc.next();
        return input_urinals;
    }
    public static void open_file(){
        // Function to read te input file
    }
    public static Boolean good_or_bad_string(String input_string){
        // checks to see if valid string is given as input
        if (input_string.length()>20) return false;
        if (input_string.contains("11")) return false;
        char[] urinals_array = input_string.toCharArray();
        for (int i = 0; i < urinals_array.length - 1; i++){
            if(urinals_array[i]!='0' || urinals_array[i]!='1'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String input_urinal_string=get_input_string();
        int ans=number_of_free_urinals(input_urinal_string);
        System.out.print("Number of people that can use the urinals: ");
        System.out.println(ans);
    }
}
