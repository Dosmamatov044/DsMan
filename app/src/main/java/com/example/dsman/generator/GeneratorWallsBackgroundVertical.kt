package com.example.dsman.generator

import android.graphics.Color
import android.graphics.Paint
import com.example.dsman.`object`.WallsBackgroundHoriz
import com.example.dsman.`object`.WallsBackgroundVertical
import com.example.dsman.data.GraphicsGame

class GeneratorWallsBackgroundVertical(sceneWidth: Int, sceneHeight: Int) {

    var list=ArrayList<WallsBackgroundVertical>()

    init {
        val walls=3



        for (i in 0 until walls)
        {
            val wallsM= WallsBackgroundVertical(sceneWidth,sceneHeight,list)
            list.add(wallsM)
        }


    }

    fun update(){
        for ( i in list.indices){
            list[i].update()
        }

    }
    fun drawing(graphicsGame: GraphicsGame){
        for (i in list.indices){

            graphicsGame.drawCub(list[i].x-10,list[i].y+600,list[i].x+10,list[i].y,
                Color.RED,
                Paint.Style.FILL)


        }



    }

}