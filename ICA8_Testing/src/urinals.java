//Author - Aryan Mehta <1225456817>
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class urinals {
    static BufferedReader file_input;
    static ArrayList<Integer> output_list;
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
    public static int openFile() {
        try {
            file_input=new BufferedReader(new FileReader("src/urinal.dat"));
        } catch (FileNotFoundException e) {
            return -1;
        }
        return 0;
    }
    public static int readFile() {
        String line;
        output_list = new ArrayList<>();
        try {
            if((line = file_input.readLine()) == null){
                return -1;
            }
            while((line) != null) {
                output_list.add(number_of_free_urinals(line));
                line = file_input.readLine();
            }
        } catch (IOException e) {
            return -2;
        }
        return 0;
    }
    public static int writeToFile() {
        int counter = 1;
        File f = new File("rule.txt");
        while(f.exists()) {
            f = new File("rule" + counter + ".txt");
            counter++;
        }
        FileWriter out;
        try {
            out = new FileWriter(f);
        } catch (IOException e) {
            return -1;
        }
        for (Integer integer : output_list) {
            try {
                out.write(integer + "\n");
            } catch (IOException e) {
                return -1;
            }
        }
        try {
            out.close();
        } catch (IOException e) {
            return -1;
        }
        return 0;
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("###### MENU #######");
        System.out.println("Enter 0 for Keyboard Input");
        System.out.println("Enter 1 for File Input");
        System.out.print("Enter your choice of option: ");
        int option=sc.nextInt();
        if(option==0){
        get_keyboard_input_string();
        }
        else if (option==1) {
            openFile();
            readFile();
            writeToFile();
        }
        else{
            System.out.print("Invalid Input! Please enter a valid input (0 or 1)");
        }
    }
}
