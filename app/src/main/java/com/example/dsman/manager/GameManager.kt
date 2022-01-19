package com.example.dsman.manager

import com.example.dsman.`object`.Button
import com.example.dsman.`object`.MainPlayer
import com.example.dsman.data.CoreGame
import com.example.dsman.data.GraphicsGame
import com.example.dsman.generator.GeneratorButton
import com.example.dsman.generator.GeneratorEnemy

class GameManager(var coreGame: CoreGame,sceneWidth:Int,sceneHeight:Int) {
    var maxScreenY:Int
    var maxScreenX:Int
    var minScreenY:Int
    var minScreenX:Int
    var mainPlayer:MainPlayer
    var generatorEnemy:GeneratorEnemy
    var generatorButton:GeneratorButton

    init {
     this.maxScreenX=sceneWidth
     this.maxScreenY=sceneHeight
     minScreenY=0
     minScreenX=0
     mainPlayer= MainPlayer(coreGame,maxScreenX,maxScreenY,minScreenY)
generatorEnemy= GeneratorEnemy(sceneWidth, sceneHeight, minScreenY)
generatorButton= GeneratorButton(sceneWidth,sceneHeight)
    }
    fun update(){
        mainPlayer.update()
  generatorEnemy.update(mainPlayer.speed)
    generatorButton.update(coreGame,mainPlayer)

    }
    fun drawing(graphicsGame: GraphicsGame){
        mainPlayer.drawing(graphicsGame)
       generatorEnemy.drawing(graphicsGame)
        generatorButton.drawing(graphicsGame)
    }


}