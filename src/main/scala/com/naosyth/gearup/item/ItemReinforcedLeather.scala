package com.naosyth.gearup.item

import com.naosyth.gearup.common.lib.LibItemNames
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.init.Items
import net.minecraft.item.ItemStack

class ItemReinforcedLeather extends ItemBase (LibItemNames.ReinforcedLeather, "reinforced_leather") {
  override def registerRecipes(): Unit = {
    val string = new ItemStack(Items.string)
    val leather = new ItemStack(Items.leather)

    GameRegistry.addShapedRecipe(
      new ItemStack(this, 1),
      "SSS",
      "LLL",
      "SSS",
      'S': Character, string,
      'L': Character, leather)
  }
}
