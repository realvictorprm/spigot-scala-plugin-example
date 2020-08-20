package com.test.plugin

import io.github.iltotore.scala.spigot.Implicits._
import io.github.iltotore.scala.spigot.scheduler.SpigotRunnable
import org.bukkit.plugin.java.JavaPlugin

class Main extends JavaPlugin {
  implicit val implicitReference: JavaPlugin = this

  override def onEnable(): Unit = {
    println("Hello World")
  }
}
