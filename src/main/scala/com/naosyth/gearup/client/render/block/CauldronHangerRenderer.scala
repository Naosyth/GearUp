package com.naosyth.gearup.client.render.block

import com.naosyth.gearup.client.render.model.CauldronHangerModel
import com.naosyth.gearup.common.ModInformation
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.ResourceLocation
import org.lwjgl.opengl.GL11

object CauldronHangerRenderer extends TileEntitySpecialRenderer {
  val cauldronHangerModel = CauldronHangerModel
  val texture = new ResourceLocation(ModInformation.ID, "textures/blocks/cauldron_hanger.png")

  override def renderTileEntityAt(tileEntity: TileEntity, x: Double, y: Double, z: Double, scale: Float): Unit = {
    GL11.glPushMatrix()
    GL11.glTranslated(x + 0.5, y + 1.5, z + 0.5)
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F)
    GL11.glPushMatrix()
    bindTexture(texture)
    cauldronHangerModel.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F)
    GL11.glPopMatrix()
    GL11.glPopMatrix()
  }
}
