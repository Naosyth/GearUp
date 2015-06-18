package com.naosyth.gearup.item

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.init.Items
import net.minecraft.item.ItemStack

class ItemReinforcedLeather extends ItemBase ("reinforcedLeather", "placeholder") {
  override def registerRecipes(): Unit = { // Question: Is it weird that I am using override?
    val string = new ItemStack(Items.string)
    val leather = new ItemStack(Items.leather)

    GameRegistry.addShapedRecipe(new ItemStack(this, 1),
    "SSS",
    "LLL",
    "SSS",
    'S'.asInstanceOf[Character], string,
    'L'.asInstanceOf[Character], leather) // Question: Is there a better way to cast the characters to Java Characters?
  }
}
