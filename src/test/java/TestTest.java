import org.junit.*;
import org.siliconeditch.afc.core.*;

public class TestTest extends Assert{

    @Test
    public void test_sas(){
        Main main = new Main();
        assertEquals(1, main.sas());
    }
}
