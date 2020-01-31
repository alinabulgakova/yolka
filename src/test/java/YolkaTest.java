import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YolkaTest {

    @Test
    public void singleStarPrint() {
        assertEquals("   *   ", atLine(0));
    }

    @Test
    public void tripleStarPrint() {
        assertEquals("  ***  ", atLine(1));
    }

    @Test
    public void fiveStarsPrint () {
        assertEquals(" ***** ", atLine(2));
    }

    private java.lang.String atLine(int line) {
        return new Yolka().print().split("\n")[line];
    }



}
