package com.example.dsman.scenec

import android.graphics.Color
import android.graphics.Typeface
import com.example.dsman.base.SceneGame
import com.example.dsman.data.CoreGame
import com.example.dsman.generator.GeneratorBackground
import com.example.dsman.generator.GeneratorWalls
import com.example.dsman.generator.GeneratorWallsBackgroundHoriz
import com.example.dsman.generator.GeneratorWallsBackgroundVertical
import com.example.dsman.manager.GameManager


class GameScene(coreGame: CoreGame):SceneGame(coreGame) {
var generatorBackground:GeneratorBackground
var  generatorWalls:GeneratorWalls
var  generatorWallsBackground:GeneratorWallsBackgroundHoriz
var  generatorWallsVertical:GeneratorWallsBackgroundVertical
  var gameState:GameState
  var gameManager:GameManager
init {

    gameState=GameState.READY
    generatorBackground=GeneratorBackground(sceneWidth, sceneHeight)
    generatorWalls= GeneratorWalls(sceneWidth,sceneHeight)
    generatorWallsBackground= GeneratorWallsBackgroundHoriz(sceneWidth,sceneHeight)
    generatorWallsVertical= GeneratorWallsBackgroundVertical(sceneWidth,sceneHeight)
gameManager= GameManager(coreGame,sceneWidth,sceneHeight)
}

    override fun update() {
if(gameState==GameState.READY){

   updateStateReady()

}
        if(gameState==GameState.RUNNING){

            updateStateRunning()

        }
        if(gameState==GameState.PAUSE){

            updateStatePause()

        }
        if(gameState==GameState.GAME_OVER){

            updateStateGameOver()

        }


    }







    override fun drawing() {
      graphicsGame?.clearScene(Color.BLACK)

        if(gameState==GameState.READY){

            drawingStateReady()

        }
        if(gameState==GameState.RUNNING){

            drawingStateRunning()

        }
        if(gameState==GameState.PAUSE){

            drawingStatePause()

        }
        if(gameState==GameState.GAME_OVER){

            drawingStateGameOver()

        }



    }

    private fun drawingStateGameOver() {

    }
    private fun updateStateGameOver() {

    }

    private fun drawingStatePause() {

    }
    private fun updateStatePause() {

    }
    private fun drawingStateRunning() {
        graphicsGame?.clearScene(Color.BLACK)

        generatorBackground.drawing(graphicsGame!!)
          generatorWalls.drawing(graphicsGame!!)
          generatorWallsBackground.drawing(graphicsGame!!)
           generatorWallsVertical.drawing(graphicsGame!!)
          gameManager.drawing( graphicsGame!!)
    }
    private fun updateStateRunning() {
generatorBackground.update()
generatorWalls.update()
generatorWallsBackground.update()
generatorWallsVertical.update()
        gameManager.update()
    }
    private fun updateStateReady() {
    if(coreGame.touchListenerFW.getTouchUp(100,200,100,50))
        gameState=GameState.RUNNING

    }
    private fun drawingStateReady() {
        graphicsGame?.clearScene(Color.BLACK)
        graphicsGame?.drawText("Вы готовы",100,200,Color.YELLOW,50, Typeface.DEFAULT)

    }

    override fun pause() {

    }

    override fun resume() {

    }

    override fun dispose() {

    }
}

