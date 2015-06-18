package com.naosyth.gearup.common.init

import com.naosyth.gearup.item._
import cpw.mods.fml.common.registry.GameRegistry

object ItemRegistry {
  val reinforcedLeather = new ItemReinforcedLeather
  GameRegistry.registerItem(reinforcedLeather, reinforcedLeather.getUnlocalizedName)
}
