package com.example.dsman.generator

import android.graphics.Color
import android.graphics.Paint
import com.example.dsman.`object`.WallsBackgroundHoriz
import com.example.dsman.data.GraphicsGame

class GeneratorWallsBackgroundHoriz(sceneWidth: Int, sceneHeight: Int) {

    var list=ArrayList<WallsBackgroundHoriz>()

    init {
        val walls=3



        for (i in 0 until walls)
        {
            val wallsM= WallsBackgroundHoriz(sceneWidth,sceneHeight,list)
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

            graphicsGame.drawCub(list[i].x,list[i].y+10,list[i].x+800,list[i].y-10,
                Color.RED,
                Paint.Style.FILL)


        }



    }

}