package com.naosyth.gearup.common

import com.naosyth.gearup.common.init.ItemRegistry
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import org.apache.logging.log4j.LogManager
import com.naosyth.gearup.client.gui.GearUpCreativeTab

@Mod( modid = ModInformation.ID,
      name = ModInformation.Name,
      version = ModInformation.Version,
      modLanguage = "scala",
      useMetadata = true )
object GearUp {
  val logger = LogManager.getLogger(ModInformation.Name)
  val creativeTab = new GearUpCreativeTab(ModInformation.ID)

  @Mod.EventHandler
  def preInit(e: FMLPreInitializationEvent): Unit = {
    logger.info("GearUp - PreInit")

    val test = ItemRegistry // Question: This is stupid. What's the right way to do this?
  }

  @Mod.EventHandler
  def init(e: FMLInitializationEvent): Unit = {
    logger.info("GearUp - Init")
  }

  @Mod.EventHandler
  def postInit(e: FMLPostInitializationEvent): Unit = {
    logger.info("GearUp - PostInit")
  }
}
