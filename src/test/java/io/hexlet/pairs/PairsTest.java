package io.hexlet.pairs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.function.*;

class PairsTest {
    @Test void testCons() {
        var pair = Pairs.cons(1, 4);
        assertEquals(1, Pairs.car(pair));
        assertEquals(4, Pairs.cdr(pair));

        var pair2 = Pairs.cons("one", "four");
        assertEquals("one", Pairs.car(pair2));
        assertEquals("four", Pairs.cdr(pair2));
    }
}
