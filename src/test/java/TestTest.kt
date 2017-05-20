import org.junit.*
import org.siliconeditch.afc.core.*

class TestTest : Assert() {

    @Test
    fun test_sas() {
        Assert.assertEquals(1, sas().toLong())
    }
}
