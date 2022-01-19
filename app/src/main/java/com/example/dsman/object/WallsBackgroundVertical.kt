package com.example.dsman.`object`

class WallsBackgroundVertical(sceneWidth:Int, sceneHeight: Int, list: ArrayList<WallsBackgroundVertical>):ObjectGame() {

    init {

        this.maxScreenX = sceneWidth
        this.maxScreenY = sceneHeight
        this.minScreenX = 0
        this.minScreenY = 0
        this.y = -1000

        x=-1000
        if (list.size>=2){

            list[0].x=0
            list[0].y=0
            list[1].x=800
            list[1].y=0





        }











    }
    fun update() {

// for (i in 1..600 step 100  ){
//     this.x =UtilRandomGame.getCasualNumber(i)


 }}


