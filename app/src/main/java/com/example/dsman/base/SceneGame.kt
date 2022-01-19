package com.example.dsman.base

import com.example.dsman.data.CoreGame
import com.example.dsman.data.GraphicsGame

abstract class SceneGame(coreGame: CoreGame) {
  val  coreGame:CoreGame
 var sceneWidth:Int
 var sceneHeight:Int
 var graphicsGame:GraphicsGame?=null


 init {
     this.coreGame=coreGame
     graphicsGame=coreGame.graphicsFW
     sceneWidth=coreGame.graphicsFW.getWidthFrameBuffer()
    sceneHeight=coreGame.graphicsFW.getHeightFrameBuffer()


 }

     abstract fun update()
     abstract fun drawing()
     abstract fun pause()
     abstract fun resume()
     abstract fun dispose()


}