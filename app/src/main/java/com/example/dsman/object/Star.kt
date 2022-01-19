package com.example.dsman.`object`

import com.example.dsman.util.UtilRandomGame

class Star(sceneWidth:Int,sceneHeight: Int) :ObjectGame(){


  init {

     this.maxScreenX=sceneWidth
   this.maxScreenY=sceneHeight
    this.minScreenX=0
    this.minScreenY=0
    this.speed=4


          this.x=UtilRandomGame.getCasualNumber(maxScreenX)
          this.y=UtilRandomGame.getCasualNumber(maxScreenY)




  }


   fun update(){

     x+=speed

     if (x>0){
       x=UtilRandomGame.getCasualNumber(maxScreenX)
       y=  UtilRandomGame.getCasualNumber(maxScreenY)
     }

   }






}