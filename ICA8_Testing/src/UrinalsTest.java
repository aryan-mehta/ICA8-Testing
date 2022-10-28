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

}

