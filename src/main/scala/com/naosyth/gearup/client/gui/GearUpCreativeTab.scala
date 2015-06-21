package com.naosyth.gearup.client.gui

import com.naosyth.gearup.common.init.ItemRegistry
import net.minecraft.creativetab.CreativeTabs

case class GearUpCreativeTab(modid: String) extends CreativeTabs(CreativeTabs.getNextID, modid) {
  def getTabIconItem = ItemRegistry.reinforcedLeather
}
