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
}

