package com.naosyth.gearup.common.init

import com.naosyth.gearup.common.block.BlockCauldronHanger
import com.naosyth.gearup.common.lib.LibBlockNames
import cpw.mods.fml.common.registry.GameRegistry

object BlockRegistry {

  def register(): Unit = {
    GameRegistry.registerBlock(BlockCauldronHanger, LibBlockNames.CauldronHanger)
  }
}
