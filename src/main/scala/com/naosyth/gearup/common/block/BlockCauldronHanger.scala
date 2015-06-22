package com.naosyth.gearup.common.block

import com.naosyth.gearup.common.ModInformation
import com.naosyth.gearup.common.lib.LibBlockNames
import cpw.mods.fml.relauncher.{SideOnly, Side}
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.IIcon
import net.minecraft.world.{IBlockAccess, World}

object BlockCauldronHanger extends BlockBase(LibBlockNames.CauldronHanger, Material.anvil, Block.soundTypeAnvil, 2F) {
  setBlockBounds(0F, 0F, 0F, 1F, 0.125F, 1F)

  override def createTileEntity(world: World, metadata: Int): TileEntity = new TileEntityCauldronHanger

  override def isOpaqueCube: Boolean = false

  override def renderAsNormalBlock: Boolean = false

  override def isBlockSolid(par1IBlockAccess: IBlockAccess, par2: Int, par3: Int, par4: Int, par5: Int): Boolean = true

  override def hasTileEntity(metadata: Int): Boolean = true

  @SideOnly(Side.CLIENT)
  override def getIcon(par1: Int, par2: Int): IIcon = {
    blockIcon
  }

  @SideOnly(Side.CLIENT)
  override def registerBlockIcons(iconRegister: IIconRegister) {
    blockIcon = iconRegister.registerIcon(ModInformation.ID + ":cauldron_hanger")
  }
}
