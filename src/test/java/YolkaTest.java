import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YolkaTest {

    @Test
    public void singleStarPrint() {
        assertEquals("  *  ", new Yolka().print().split("\n")[0]);
    }

}
