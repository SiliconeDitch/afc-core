package org.siliconeditch.afc.core.players

import org.siliconeditch.afc.core.TerrainType

class BeatlePlayer(id:Int) : Player(id){
    override val maxHp  = 10
    override val maxStamina  = 200
    override val type = PlayerType.OMNIVORE
    override val walkableTerrain = arrayOf(TerrainType.GROUND)
    override val baseAttack = 0

    init{
        this.hp = maxHp
        this.stamina = maxStamina
    }
}
