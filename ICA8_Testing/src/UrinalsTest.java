import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UrinalsTest {
//    private urinals urinal_object= new urinals();

    @Test
    void Testcase1() {
        System.out.println("====== Aryan Mehta == TEST ONE EXECUTED =======");
        assertEquals(-1, urinals.number_of_free_urinals("1101"));
    }

}

