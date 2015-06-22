package com.naosyth.gearup.client.render.item

import com.naosyth.gearup.client.render.block.CauldronHangerRenderer
import com.naosyth.gearup.client.render.model.CauldronHangerModel
import net.minecraft.client.Minecraft
import net.minecraft.item.ItemStack
import net.minecraftforge.client.IItemRenderer
import net.minecraftforge.client.IItemRenderer.{ItemRendererHelper, ItemRenderType}
import org.lwjgl.opengl.GL11

object CauldronHangerItemRenderer extends IItemRenderer {
  val model = CauldronHangerModel
  val shadowSize = 0.5F

  override def handleRenderType(item: ItemStack, renderType: ItemRenderType): Boolean = true

  override def shouldUseRenderHelper(renderType: ItemRenderType, item: ItemStack, helper: ItemRendererHelper): Boolean = true

  override def renderItem(renderType: ItemRenderType, item: ItemStack, objectData: Object*): Unit = {
    GL11.glPushMatrix()
    GL11.glTranslated(0.5, 2.0, 0.5)
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F)
    GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F)
    Minecraft.getMinecraft.getTextureManager.bindTexture(CauldronHangerRenderer.texture)
    model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F)
    GL11.glPopMatrix()
  }
}
