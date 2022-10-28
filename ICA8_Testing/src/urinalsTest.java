import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {
    private urinals urinal_object= new urinals();

    @Test
    void Testcase1() {
        System.out.println("====== Aryan Mehta == TEST ONE EXECUTED =======");
        assertEquals(-1,urinal_object.number_of_free_urinals("1101"));
    }

}

