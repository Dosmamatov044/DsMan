package com.example.dsman.data

import android.content.res.AssetManager
import android.graphics.*
import java.io.IOException
import java.io.InputStream

class GraphicsGame(assetManager: AssetManager,frameBufferGame:Bitmap) {
var assetManager:AssetManager?=null
  private var frameBufferGame:Bitmap
  var  canvasGame:Canvas
  var paintGame:Paint
   lateinit var textureGame:Bitmap



    init {
     this.assetManager=assetManager
     this.frameBufferGame=frameBufferGame
      this.canvasGame= Canvas(frameBufferGame)
        this.paintGame= Paint()

    }

    fun clearScene(colorRgb:Int){
        canvasGame.drawRGB(colorRgb,colorRgb,colorRgb)
    }
  fun drawPixel(x:Int,y:Int,color:Int){
      paintGame.color = color
      canvasGame.drawPoint((x).toFloat(),y.toFloat(),paintGame)

  }
 fun drawCub(xLeft:Int,yTop:Int,xRight:Int,yBottom:Int,color:Int,style:Paint.Style){
     val rect = Rect(xLeft, yTop, xRight, yBottom)

     paintGame.style=style
  paintGame.color=color
  canvasGame.drawRect(rect,paintGame)


 }



    fun drawPixel(startX:Int,startY:Int,stopX:Int,stopY:Int,color:Int){
        paintGame.color = color
        canvasGame.drawLine(startX.toFloat(),startY.toFloat(),stopX.toFloat(),stopY.toFloat(),paintGame)

    }

   fun drawText(text:String,x:Int,y:Int,color: Int,sizeText:Int,font:Typeface){
       paintGame.color = color
       paintGame.textSize=sizeText.toFloat()
       paintGame.typeface = font

       canvasGame.drawText(text,x.toFloat(),y.toFloat(),paintGame)
   }
   fun drawTexture(textureGame:Bitmap,x:Int,y: Int){
       canvasGame.drawBitmap(textureGame,x.toFloat(),y.toFloat(),null)


   }
    fun drawDots(x:Int,y:Int,color:Int){
     paintGame.color=color

canvasGame.drawPoint(x.toFloat(),y.toFloat(),paintGame)

    }

  fun drawSquare(){
   paintGame.color

  }



   fun getWidthFrameBuffer(): Int {


       return frameBufferGame.width
   }
    fun getHeightFrameBuffer(): Int {


        return frameBufferGame.height
    }




    fun newTexture(fileName: String): Bitmap {
        var inputStream: InputStream? = null
        try {
            inputStream = assetManager?.open(fileName)
           textureGame = BitmapFactory.decodeStream(inputStream)
            if (textureGame == null) {
                throw RuntimeException("Не возможно загрузить файл$fileName")
            }
        } catch (e: IOException) {
            throw RuntimeException("Не возможно загрузить файл$fileName")
        }
        if (inputStream != null) {
            try {
                inputStream.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return textureGame
    }


    fun newSprite(
        textureAtlas: Bitmap?,
        x: Int,
        y: Int,
        widthSprite: Int,
        heightSprite: Int
    ): Bitmap {
        return Bitmap.createBitmap(textureAtlas!!, x, y, widthSprite, heightSprite)
    }
    //endregion

}