package com.example.dsman.`object`

import com.example.dsman.data.CoreGame

open class Button(sceneWidth:Int, sceneHeight: Int,list: MutableList<Button>):ObjectGame()  {


   init{

       this.maxScreenX = sceneWidth
       this.maxScreenY = sceneHeight
       this.minScreenX = 0
       this.minScreenY = 0
       this.y = 450   //bottom

      this.x=80

       if (list.size>=3) {
           list[0].x = minScreenX + 35   //left
           list[0].y = minScreenY +400
           list[1].x = minScreenX + 100    //top
           list[1].y = minScreenY + 350
           list[2].x = minScreenX + 130    //right
           list[2].y = minScreenY + 400


       }

   }
    fun update( coreGame: CoreGame,mainPlayer: MainPlayer) {
   if (coreGame.touchListenerFW.getTouchDown(minScreenX+35,minScreenY+420,40,40)) {  //left
      mainPlayer.enumBtn= ENUMBUTTON.LEFT

   }
        if (coreGame.touchListenerFW.getTouchUp(minScreenX+55,minScreenY+420,40,40)) {  //left

            mainPlayer.enumBtn= ENUMBUTTON.STOPLEFT

        }

        if (coreGame.touchListenerFW.getTouchDown(minScreenX+60,minScreenY+370,40,40)) {//top

            mainPlayer.enumBtn=  ENUMBUTTON.TOP
        }
        if (coreGame.touchListenerFW.getTouchUp(minScreenX+100,minScreenY+370,40,40)) {//top

            mainPlayer.enumBtn=  ENUMBUTTON.STOPTOP
        }

        if (coreGame.touchListenerFW.getTouchDown(minScreenX+60,minScreenY+470,40,40)) {//bottom
            mainPlayer.enumBtn=   ENUMBUTTON.BOTTOM

        }
        if (coreGame.touchListenerFW.getTouchUp(minScreenX+100,minScreenY+470,40,40)) {//bottom
            mainPlayer.enumBtn=   ENUMBUTTON.STOPBOTTOM

        }

        if (coreGame.touchListenerFW.getTouchDown(minScreenX+130,minScreenY+420,40,40)) {  //right
            mainPlayer.enumBtn=    ENUMBUTTON  .RIGHT

        }
        if (coreGame.touchListenerFW.getTouchUp(minScreenX+130,minScreenY+420,40,40)) {  //right
        mainPlayer.enumBtn=    ENUMBUTTON  .STOPRIGHT

        }







      if (y>maxScreenY){
         y=maxScreenY


      }
      if (y<minScreenY){
         y=minScreenY


      }


    }







}