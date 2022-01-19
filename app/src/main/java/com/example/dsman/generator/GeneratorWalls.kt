package com.example.dsman.generator

import android.graphics.Color
import android.graphics.Paint
import android.util.Log
import com.example.dsman.`object`.Walls
import com.example.dsman.data.GraphicsGame

class GeneratorWalls(sceneWidth: Int, sceneHeight: Int) {

    var list=ArrayList<Walls>()

    init {
        val walls=121



      for (i in 0 until walls)
      {
       val wallsM=Walls(sceneWidth,sceneHeight,list)
          list.add(wallsM)
      }


    }

    fun update(){
        for ( i in list.indices){
        list[i].update()
        }

    }
    fun drawing(graphicsGame:GraphicsGame){
     for (i in list.indices){

        graphicsGame.drawCub(list[i].x-13,list[i].y+18,list[i].x+13,list[i].y-18,Color.GRAY,Paint.Style.FILL)


     }



    }

}