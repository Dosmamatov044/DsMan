package com.example.dsman.scenec

import android.graphics.Color
import android.graphics.Typeface
import com.example.dsman.base.SceneGame
import com.example.dsman.data.CoreGame

class MainMenuScene(coreGame: CoreGame):SceneGame(coreGame) {
    override fun update() {




        if (coreGame.touchListenerFW.getTouchUp(20, 300, 100, 50))
        {

            coreGame.setScene(GameScene(coreGame))
        }

    }

    override fun drawing() {

        graphicsGame?.clearScene(Color.BLACK)
        graphicsGame?.drawText("Начать игру",20,300,Color.RED,40, Typeface.DEFAULT)


    }

    override fun pause() {

    }

    override fun resume() {

    }

    override fun dispose() {

    }


}