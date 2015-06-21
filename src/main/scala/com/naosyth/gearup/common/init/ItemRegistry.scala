package com.naosyth.gearup.common.init

import com.naosyth.gearup.item._
import cpw.mods.fml.common.registry.GameRegistry

object ItemRegistry {
  val reinforcedLeather = new ItemReinforcedLeather
  
  def register() {
    GameRegistry.registerItem(reinforcedLeather, reinforcedLeather.getUnlocalizedName)
  }
}
