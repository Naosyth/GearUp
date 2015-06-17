package com.naosyth.gearup.common

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import org.apache.logging.log4j.LogManager

@Mod(modid = GearUp.ID, name = GearUp.Name,
     version = GearUp.Version,
     modLanguage = "scala", useMetadata = true)
object GearUp {
  final val ID = "gearup"
  final val Name = "Gear Up"
  final val Version = "@VERSION@"

  var logger = LogManager.getLogger(Name)

  @Mod.EventHandler
  def preInit(e: FMLPreInitializationEvent): Unit = {
    logger.info("GearUp - PreInit")
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
