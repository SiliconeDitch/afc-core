package org.siliconeditch.afc.core.players

import org.siliconeditch.afc.core.Resource
import org.siliconeditch.afc.core.TerrainType

abstract class Player(id:Int){
    val id:Int
    open val maxHp = 100
    var hp: Int
    open val type = PlayerType.OMNIVORE
    open val walkableTerrain = arrayOf(TerrainType.GROUND, TerrainType.MOUNTAIN, TerrainType.WATER)
    open val baseAttack = 5
    open val maxStamina = 100
    var stamina: Int

    init{
        this.id = id
        this.hp = maxHp
        this.stamina = maxStamina
    }

    fun takeDamage(hp:Int){
        this.hp -= hp
    }

    fun addHp(hp:Int){
        this.hp += hp
        this.hp = Math.min(this.hp, this.maxHp)
    }

    fun addStamina(stamina:Int){
        this.stamina += stamina
        this.stamina = Math.min(this.stamina, this.maxStamina)
    }

    fun consumeResource(resource: Resource){
        addHp(resource.hp)
        addStamina(resource.stamina)
    }

}