import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UrinalsTest {
//    private urinals urinal_object= new urinals();

    @Test
    void TestCase1_Check_Input_String() {
        System.out.println("====== Aryan Mehta == TEST ONE EXECUTED =======");
        assertEquals(false, urinals.good_or_bad_string("1101"));
        assertEquals(false, urinals.good_or_bad_string("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
        assertEquals(true, urinals.good_or_bad_string("1001"));

    }

    @Test
    void TestCase2_Check_Keyboard_Output() {
        System.out.println("====== Aryan Mehta == TEST TWO EXECUTED =======");
        assertEquals(0, urinals.number_of_free_urinals("1001"));
        assertEquals(3, urinals.number_of_free_urinals("00000"));
        assertEquals(2, urinals.number_of_free_urinals("0000"));
        assertEquals(1, urinals.number_of_free_urinals("01000"));
        assertEquals(0, urinals.number_of_free_urinals("1"));
        assertEquals(1, urinals.number_of_free_urinals("0"));
    }

}

