import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UrinalsTest {
//    private urinals urinal_object= new urinals();

    @Test
    void TestCase1_Check_Input_String() {
        System.out.println("====== Aryan Mehta == TEST ONE EXECUTED =======");
        assertEquals(false, urinals.good_or_bad_string("1101"));
        assertEquals(true, urinals.good_or_bad_string("1001"));
    }

    @Test
    void TestCase2_Check_Keyboard_Output() {
        System.out.println("====== Aryan Mehta == TEST TWO EXECUTED =======");
        assertEquals(0, urinals.number_of_free_urinals("1001"));
        assertEquals(3, urinals.number_of_free_urinals("00000"));
        assertEquals(2, urinals.number_of_free_urinals("0000"));
        assertEquals(1, urinals.number_of_free_urinals("01000"));
    }

    @Test
    void TestCase3_Check_CornerCases() {
        System.out.println("====== Aryan Mehta == TEST THREE EXECUTED =======");
        //String length greater than 20
        assertEquals(-1, urinals.number_of_free_urinals("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
        //String length less than 1 - Empty String
        assertEquals(-1, urinals.number_of_free_urinals(""));
        //String Length=1 and urinal is occupied
        assertEquals(0, urinals.number_of_free_urinals("1"));
        //String Length=1 and urinal is free
        assertEquals(1, urinals.number_of_free_urinals("0"));
    }
    @Test
    void TestCase4_String_With_Bad_Characters() {
        System.out.println("====== Aryan Mehta == TEST FOUR EXECUTED =======");
        assertEquals(false, urinals.good_or_bad_string("12031"));
        assertEquals(false, urinals.good_or_bad_string("1001910"));
        assertEquals(false, urinals.good_or_bad_string("Aryan"));
        assertEquals(false, urinals.good_or_bad_string("0011@#"));
        //Final Output
        assertEquals(-1, urinals.number_of_free_urinals("12031"));
        assertEquals(-1, urinals.number_of_free_urinals("1001910"));
        assertEquals(-1, urinals.number_of_free_urinals("Aryan"));
        assertEquals(-1, urinals.number_of_free_urinals("0011@#"));
        assertEquals(-1, urinals.number_of_free_urinals("001100011"));
    }
    @Test
    public void TestCase5_test_open_file(){
        //Check if it reads the file
        System.out.println(" ====== Aryan Mehta ==== TEST FIVE EXECUTED =======");
        //String output based on the example
        assertEquals(0, urinals.openFile());
    }
    @Test
    public void TestCase6_test_read_file(){
        //Check if it reads the file
        System.out.println(" ====== Aryan Mehta ==== TEST SIX EXECUTED =======");
        //String output based on the example
        TestCase5_test_open_file();
        assertEquals(0, urinals.readFile());
    }
}




