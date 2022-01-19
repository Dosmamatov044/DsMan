package com.example.dsman.generator

import android.graphics.Color
import com.example.dsman.`object`.Star
import com.example.dsman.data.GraphicsGame
import java.util.*
import kotlin.random.Random

class GeneratorBackground(sceneWidth: Int, sceneHeight: Int) {
    private val mStarArrayList = ArrayList<Star>()

    init {
        val starsSpeak = 150 //Максимальное количество звезд
        for (i in 0 until starsSpeak) {
            //Цикл создает звезды и помещет их в массив
            val star = Star(sceneWidth, sceneHeight)
            mStarArrayList.add(star)
        }
    }


    //region Fields
    //Обьявление массива для звезд

    fun update() {
        for (i in mStarArrayList.indices) {
            //Производим обновление каждой звезды в массиве
            mStarArrayList[i].update()
        }
    }

    fun drawing(graphicsGame: GraphicsGame) {
        for (i in mStarArrayList.indices) {
            //Прорисовка каждой звезды в массиве
           val rnd=Random
            graphicsGame.drawPixel(
                mStarArrayList[i].x,
                mStarArrayList[i].y, Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256))
            )
        }
    } //endregion

    //endregion
    //region Main methods

}
