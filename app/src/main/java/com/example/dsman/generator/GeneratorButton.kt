package com.example.dsman.generator

import android.graphics.Color
import android.graphics.Paint
import com.example.dsman.`object`.Button
import com.example.dsman.`object`.MainPlayer
import com.example.dsman.`object`.Walls
import com.example.dsman.data.CoreGame
import com.example.dsman.data.GraphicsGame

class GeneratorButton(sceneWidth:Int,sceneHeight:Int) {

    var list=ArrayList<Button>()

    init {
        val walls=4



        for (i in 0 until walls)
        {
            val buttons= Button(sceneWidth =sceneWidth,sceneHeight,list )
            list.add(buttons)
        }


    }

    fun update(coreGame: CoreGame,mainPlayer: MainPlayer){
        for ( i in list.indices){
            list[i].update(coreGame,mainPlayer)
        }

    }
    fun drawing(graphicsGame: GraphicsGame){
        for (i in list.indices){

            graphicsGame.drawCub(list[i].x+20,list[i].y+20,list[i].x-20,list[i].y-20,Color.GREEN,Paint.Style.FILL)


        }



    }


}