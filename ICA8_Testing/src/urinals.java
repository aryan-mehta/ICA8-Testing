//Author - Aryan Mehta <1225456817>
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class urinals {
    public static int number_of_free_urinals(String urinals) {
        // Returns the number of free available urinals as per the rule.
        //Base Cases
        if (!good_or_bad_string(urinals)) return -1;
        if (urinals.equals("0")) return 1;
        if (urinals.equals("1")) return 0;

        char[] urinals_array = urinals.toCharArray();
        int counter = 0;

        for (int i = 0; i < urinals_array.length - 1; i++) {
            if (i == 0) {
                if (urinals_array[i] == '0' && urinals_array[i + 1] == '0') {
                    urinals_array[i] = '1';
                    counter++;
                }
            }
            if (i > 0) {
                if (urinals_array[i] == '0' && urinals_array[i - 1] == '0' && urinals_array[i + 1] == '0') {
                    urinals_array[i] = '1';
                    counter++;
                }
            }
        }
        if (urinals_array[urinals_array.length - 1] == '0' && urinals_array[urinals_array.length - 2] == '0') {
            counter++;
        }
        return counter;

    }
    public static void get_keyboard_input_string(){
        // Function to take the input from the keyboard.
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Hint: Enter -1 to exit\nEnter your input: ");
            String input_string=sc.next();
            if(input_string.equals("-1")){
                break;
            }
            int ans=number_of_free_urinals(input_string);
            System.out.print("Number of people that can use the urinals: ");
            System.out.println(ans);
        }
    }
    public static void read_file() throws FileNotFoundException {
        // Function to read te input .dat file
        File file=new File("src/input.dat");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }

    }
    public static Boolean good_or_bad_string(String input_string){
        // checks to see if valid string is given as input
        if (input_string.length()<1) return false;
        if (input_string.length()>20) return false;
        if (input_string.contains("11")) return false;
        char[] urinals_array = input_string.toCharArray();
        for (int i = 0; i < urinals_array.length - 1; i++){
            if(urinals_array[i]!='0' && urinals_array[i]!='1'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
//        get_keyboard_input_string();
        read_file();
    }
}
