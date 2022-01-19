package com.example.dsman.`object`

import com.example.dsman.animation.AnimationGame
import com.example.dsman.data.CoreGame
import com.example.dsman.data.GraphicsGame
import com.example.dsman.util.ResourceGame

//var GRAVITY = -3
var MAX_SPEED = 15
var MIN_SPEED = 1

class MainPlayer(coreGame: CoreGame, maxScreenX: Int, maxScreenY: Int, minScreenY: Int) :


    ObjectGame() {

   lateinit var enumBtn:ENUMBUTTON
    var animSpriteMainPlayer: AnimationGame
    var coreGame: CoreGame
    var boosing = false

    init {
        val resourceGame = ResourceGame()
   enumBtn=ENUMBUTTON.WAIT
        x = 200
        y = 200
        speed = 1
        this.maxScreenX = maxScreenX
        this.maxScreenY = maxScreenY - ResourceGame.sSpritePlayer[0].height

        animSpriteMainPlayer = AnimationGame(
            speed.toDouble(), ResourceGame.sSpritePlayer[0], ResourceGame.sSpritePlayer[1],

            ResourceGame.sSpritePlayer[2], ResourceGame.sSpritePlayer[3]
        )
        this.coreGame = coreGame


    }

    fun update() {




if (enumBtn==ENUMBUTTON.LEFT){

    x-=1
}
        if (enumBtn==ENUMBUTTON.RIGHT){
  x+=1

        }
        if (enumBtn==ENUMBUTTON.TOP){
y-=1

        }
        if (enumBtn==ENUMBUTTON.BOTTOM){
y+=1

        }
        if (enumBtn==ENUMBUTTON.STOPLEFT){
            x-=10



        }
        if (enumBtn==ENUMBUTTON.STOPBOTTOM){
            y+=10



        }
        if (enumBtn==ENUMBUTTON.STOPTOP){
            y-=10



        }



       // y -= speed //+ GRAVITY
       if (y < minScreenY) {
          y = minScreenY

       }
      if (y > maxScreenY) {
          y = maxScreenY

     }
        animSpriteMainPlayer.runAnimation()

    }


    fun drawing(graphicsGame: GraphicsGame) {
        animSpriteMainPlayer.drawingAnimation(graphicsGame, x, y)

    }

}
