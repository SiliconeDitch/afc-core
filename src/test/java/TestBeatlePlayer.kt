import org.junit.*
import org.siliconeditch.afc.core.*
import org.siliconeditch.afc.core.players.BeatlePlayer

class TestBeatlePlayer : Assert() {

    var player = BeatlePlayer(0)

    @Before fun init(){
        player = BeatlePlayer(0)
    }

    @Test
    fun test_getId() {
        Assert.assertEquals(0, player.id)
    }

    @Test
    fun test_takeDamage(){
        Assert.assertEquals(player.maxHp, player.hp)
        player.takeDamage(5)
        Assert.assertEquals(player.maxHp-5, player.hp)
    }
}
