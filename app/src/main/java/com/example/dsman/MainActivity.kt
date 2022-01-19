package com.example.dsman

import com.example.dsman.base.SceneGame
import com.example.dsman.data.CoreGame
import com.example.dsman.resourse.LoaderAssets
import com.example.dsman.scenec.MainMenuScene

class MainActivity : CoreGame() {
override fun  getStartScene(): SceneGame {
  var loaderAssets= LoaderAssets(this,graphicsFW)
     return MainMenuScene(this)

 }


}