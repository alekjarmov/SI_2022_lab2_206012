import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void testEveryStatement() {
        IllegalArgumentException ex;
        //1
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        //2
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0#".split(""))));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
        //3
        assertEquals(List.of("1", "1", "#", "#", "2", "#", "1", "0", "1"),SILab2.function(List.of("0","0","#","#","0","#","0","0","0")));
    }

    @Test
    void testEveryBranch() {
        IllegalArgumentException ex;
        //1
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        //2
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0#".split(""))));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
        //3
        assertEquals(List.of("#", "2", "#", "2", "2", "#", "#", "#", "#"),SILab2.function(List.of("#","0","#","0","0","#","#","#","#")));
    }
}
