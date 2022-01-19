package com.example.dsman.resourse

import android.graphics.Bitmap
import com.example.dsman.data.CoreGame
import com.example.dsman.data.GraphicsGame
import com.example.dsman.util.ResourceGame
import java.util.*

class LoaderAssets (coreGame: CoreGame,graphicsGame: GraphicsGame){


    init {

        loadTexture(graphicsGame)
loadSpritePlayer(graphicsGame)
}

    private fun loadTexture(graphicsGame: GraphicsGame) {
        //Загрузка текстур
        ResourceGame.sTextureAtlas = graphicsGame.newTexture("texture_atlas.png")
    }

    private fun loadSpritePlayer(graphicsGame: GraphicsGame) {
        //Метод загружает спрайты игрока без щитов


      ResourceGame.sSpritePlayer = ArrayList<Bitmap>()
        ResourceGame.sSpritePlayerBoost = ArrayList<Bitmap>()



        ResourceGame.sSpritePlayer.add(
            graphicsGame.newSprite(
                ResourceGame.sTextureAtlas, 0, 0,
                64, 64
            )
        )
        ResourceGame.sSpritePlayer.add(
            graphicsGame.newSprite(
               ResourceGame.sTextureAtlas, 64, 0,
                64, 64
            )
        )
        ResourceGame.sSpritePlayer.add(
            graphicsGame.newSprite(
                ResourceGame.sTextureAtlas, 128, 0,
                64, 64
            )
        )
        ResourceGame.sSpritePlayer.add(
            graphicsGame.newSprite(
                ResourceGame.sTextureAtlas, 192, 0,
                64, 64
            )
        )
        ResourceGame.sSpritePlayerBoost.add(
            graphicsGame.newSprite(
                ResourceGame.sTextureAtlas, 0, 64,
                64, 64
            )
        )
        ResourceGame.sSpritePlayerBoost.add(
            graphicsGame.newSprite(
                ResourceGame.sTextureAtlas, 64, 64,
                64, 64
            )
        )
        ResourceGame.sSpritePlayerBoost.add(
            graphicsGame.newSprite(
                ResourceGame.sTextureAtlas, 128, 64,
                64, 64
            )
        )
        ResourceGame.sSpritePlayerBoost.add(
            graphicsGame.newSprite(
                ResourceGame.sTextureAtlas, 192, 64,
                64, 64
            )
        )
    }
}