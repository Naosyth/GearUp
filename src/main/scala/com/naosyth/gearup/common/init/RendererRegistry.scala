package com.naosyth.gearup.common.init

import com.naosyth.gearup.client.render.block.CauldronHangerRenderer
import com.naosyth.gearup.client.render.item.CauldronHangerItemRenderer
import com.naosyth.gearup.common.block.{BlockCauldronHanger, TileEntityCauldronHanger}
import com.naosyth.gearup.common.lib.LibBlockNames
import cpw.mods.fml.client.registry.{RenderingRegistry, ClientRegistry}
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.item.Item
import net.minecraftforge.client.MinecraftForgeClient

object RendererRegistry {
  val cauldronHangerRenderer = CauldronHangerRenderer
  val cauldronHangerItemRenderer = CauldronHangerItemRenderer
  val blockCauldronHangerRenderID = RenderingRegistry.getNextAvailableRenderId

  def register(): Unit = {
    GameRegistry.registerTileEntity(classOf[TileEntityCauldronHanger], LibBlockNames.CauldronHanger)
    BlockCauldronHanger.renderType = blockCauldronHangerRenderID
    ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileEntityCauldronHanger], cauldronHangerRenderer)
    MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockCauldronHanger), cauldronHangerItemRenderer)
  }
}
