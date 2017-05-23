package org.siliconeditch.afc.core

/**
 * Created by Бонч on 23.05.2017.
 */
enum class Resource(val type:ResourceType, val stamina: Int, val hp: Int){
    APPLE(ResourceType.GREEN, 10, 2)
}

enum class ResourceType {
    MEAT, GREEN
}