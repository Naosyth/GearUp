package com.naosyth.gearup.common.block

import com.naosyth.gearup.common.{GearUp, ModInformation}
import net.minecraft.block.Block
import net.minecraft.block.Block.SoundType
import net.minecraft.block.material.Material

class BlockBase(material: Material = Material.iron) extends Block(material: Material) {
  var renderType: Int = -1

  def this(unlocName: String, material: Material, textureName: String, soundType: SoundType, hardness: Float) {
    this(material)

    setBlockName(ModInformation.ID + "." + unlocName)
    setBlockTextureName(ModInformation.ID + ":" + textureName)
    setCreativeTab(GearUp.creativeTab)
    setStepSound(soundType)
    setHardness(hardness)
  }

  def this(unlocName: String, material: Material, soundType: SoundType, hardness: Float) {
    this(material)

    setBlockName(ModInformation.ID + "." + unlocName)
    setCreativeTab(GearUp.creativeTab)
    setStepSound(soundType)
    setHardness(hardness)
  }

  override def getRenderType: Int = renderType
}
