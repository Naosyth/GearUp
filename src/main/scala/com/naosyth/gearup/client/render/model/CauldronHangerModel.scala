package com.naosyth.gearup.client.render.model

import net.minecraft.client.model.ModelBase
import net.minecraft.client.model.ModelRenderer
import net.minecraft.entity.Entity

object CauldronHangerModel extends ModelBase {
  textureWidth = 32
  textureHeight = 32
    
  val Shape1 = new ModelRenderer(this, 0, 0)
  Shape1.addBox(0F, 0F, 0F, 2, 1, 1)
  Shape1.setRotationPoint(-6F, 23F, -8F)
  Shape1.setTextureSize(32, 32)
  Shape1.mirror = true
  setRotation(Shape1, 0F, 0F, 0F)

  val Shape2 = new ModelRenderer(this, 0, 0)
  Shape2.addBox(0F, 0F, 0F, 10, 1, 1)
  Shape2.setRotationPoint(-5F, 22F, 7F)
  Shape2.setTextureSize(32, 32)
  Shape2.mirror = true
  setRotation(Shape2, 0F, 0F, 0F)

  val Shape3 = new ModelRenderer(this, 0, 0)
  Shape3.addBox(0F, 0F, 0F, 2, 1, 1)
  Shape3.setRotationPoint(4F, 23F, 7F)
  Shape3.setTextureSize(32, 32)
  Shape3.mirror = true
  setRotation(Shape3, 0F, 0F, 0F)

  val Shape4 = new ModelRenderer(this, 0, 0)
  Shape4.addBox(0F, 0F, 0F, 2, 1, 14)
  Shape4.setRotationPoint(-1F, 22F, -7F)
  Shape4.setTextureSize(32, 32)
  Shape4.mirror = true
  setRotation(Shape4, 0F, 0F, 0F)

  val Shape5 = new ModelRenderer(this, 0, 0)
  Shape5.addBox(0F, 0F, 0F, 2, 1, 1)
  Shape5.setRotationPoint(-6F, 23F, 7F)
  Shape5.setTextureSize(32, 32)
  Shape5.mirror = true
  setRotation(Shape5, 0F, 0F, 0F)

  val Shape6 = new ModelRenderer(this, 0, 0)
  Shape6.addBox(0F, 0F, 0F, 10, 1, 1)
  Shape6.setRotationPoint(-5F, 22F, -8F)
  Shape6.setTextureSize(32, 32)
  Shape6.mirror = true
  setRotation(Shape6, 0F, 0F, 0F)

  val Shape7 = new ModelRenderer(this, 0, 0)
  Shape7.addBox(0F, 0F, 0F, 2, 1, 1)
  Shape7.setRotationPoint(4F, 23F, -8F)
  Shape7.setTextureSize(32, 32)
  Shape7.mirror = true
  setRotation(Shape7, 0F, 0F, 0F)

  override def render(entity: Entity, f: Float, f1: Float, f2: Float, f3: Float, f4: Float, f5: Float): Unit = {
    super.render(entity, f, f1, f2, f3, f4, f5)
    setRotationAngles(f, f1, f2, f3, f4, f5, entity)
    Shape1.render(f5)
    Shape2.render(f5)
    Shape3.render(f5)
    Shape4.render(f5)
    Shape5.render(f5)
    Shape6.render(f5)
    Shape7.render(f5)
  }
  
  private def setRotation(model: ModelRenderer, x: Float, y: Float, z: Float): Unit = {
    model.rotateAngleX = x
    model.rotateAngleY = y
    model.rotateAngleZ = z
  }
  
  override def setRotationAngles(f: Float, f1: Float, f2: Float, f3: Float, f4: Float, f5: Float, entity: Entity): Unit = {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity)
  }
}
