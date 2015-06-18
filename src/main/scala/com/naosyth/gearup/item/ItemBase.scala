package com.naosyth.gearup.item

import com.naosyth.gearup.common.{GearUp, ModInformation}
import net.minecraft.item.Item

abstract class ItemBase extends Item {
  registerRecipes()

  def this(unlocName: String, textureName: String) {
    this()

    setUnlocalizedName(ModInformation.ID + "." + unlocName)
    setTextureName(ModInformation.ID + ":" + textureName)
    setCreativeTab(GearUp.creativeTab)
  }

  def this(unlocName: String) {
    this()

    setUnlocalizedName(ModInformation.ID + "." + unlocName)
    setCreativeTab(GearUp.creativeTab)
  }

  def registerRecipes(): Unit = {

  }
}
