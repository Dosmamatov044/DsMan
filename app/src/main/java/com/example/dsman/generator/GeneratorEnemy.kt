package com.example.dsman.generator

import com.example.dsman.`object`.Enemy
import com.example.dsman.data.GraphicsGame

class GeneratorEnemy(sceneWidth:Int,sceneHeight:Int,minScreenY:Int) {
    var maxScreenY:Int
    var maxScreenX:Int
    var minScreenY:Int
    var minScreenX:Int
    var enemyList:ArrayList<Enemy>

    init {
       this. maxScreenX=sceneWidth
       this. maxScreenY=sceneHeight
       this. minScreenY=minScreenY
        minScreenX=0
       enemyList= arrayListOf()




    }
    fun update(speedPlayer:Int){
       if (enemyList.size<3){
         addEnemy(speedPlayer,3)

       }

        for ( i in 0 until  3){
            enemyList[i].update(speedPlayer)
        }


    }

    private fun addEnemy(speedPlayer: Int, amountEnemy: Int) {


        for ( i in 0 until  amountEnemy){
            enemyList.add(Enemy(maxScreenX,maxScreenY,minScreenY))
        }





    }


    fun drawing(graphicsGame: GraphicsGame){
        for ( i in 0 until  3){
            enemyList[i].drawing(graphicsGame)
        }


    }

}