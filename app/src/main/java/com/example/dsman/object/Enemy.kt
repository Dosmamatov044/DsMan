package com.example.dsman.`object`

import android.graphics.Color
import com.example.dsman.data.GraphicsGame
import com.example.dsman.util.UtilRandomGame

class Enemy(maxScreenX:Int,maxScreenY:Int,minScreenY:Int):ObjectGame() {


 init {
     this.maxScreenX=maxScreenX
     this.maxScreenY=maxScreenY-64
     this.minScreenY=minScreenY
     this.minScreenX=0
     x=maxScreenX
     y=UtilRandomGame.getGap(minScreenY,maxScreenY)

     this.speed=UtilRandomGame.getGap(2,5)

 }

    fun update(speedPlayer:Int){
        x-=speed
        x-speedPlayer
        if (x<minScreenX){
            x=minScreenX
            y=UtilRandomGame.getGap(minScreenY,maxScreenY)

        }


    }

    fun drawing(graphicsGame: GraphicsGame){
        graphicsGame.drawDots(x,y,Color.YELLOW)


    }



}