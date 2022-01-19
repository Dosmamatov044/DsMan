package com.example.dsman.loop

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import android.view.SurfaceHolder
import android.view.SurfaceView
import com.example.dsman.data.CoreGame
import java.util.*


class LoopGame(private val mCoreGame: CoreGame, private val mFrameBuffer: Bitmap) : SurfaceView(
    mCoreGame),
    Runnable {
    //region Fields
    private val FPS = 60f
    private val SECOND = 1000000000f
    private val UPDATE_TIME = SECOND / FPS
    private var mRunning = false
    private var mGameThread: Thread? = null
    private val mSurfaceHolder: SurfaceHolder
    private var mCanvas: Canvas
    private val mRect: Rect



    //TEMP
    override fun run() {
        var lastTime = System.nanoTime().toFloat()
        var delta = 0f

        while (mRunning) {
            val nowTime = System.nanoTime().toFloat()
            val elapsedTime = nowTime - lastTime
            lastTime = nowTime
            delta += elapsedTime / UPDATE_TIME
            if (delta > 1) {
                updateGame()
                drawingGame()
                delta--
            }


        }
    }

    private fun updateGame() {

        mCoreGame.getCurrentScene().update()
    }

    private fun drawingGame() {

        if (mSurfaceHolder.surface.isValid) {
            mCanvas = mSurfaceHolder.lockCanvas()
            mCanvas.getClipBounds(mRect)
            mCanvas.drawBitmap(mFrameBuffer, null, mRect, null)
            mCoreGame.getCurrentScene().drawing()
            mSurfaceHolder.unlockCanvasAndPost(mCanvas)
        }
    }

    fun startGame() {
        if (mRunning) {
            return
        }
        mRunning = true
        mGameThread = Thread(this)
        mGameThread!!.start()
    }

    fun stopGame() {
        if (!mRunning) {
            return
        }
        mRunning = false
        try {
            mGameThread!!.join()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

    //endregion
    init {
        mSurfaceHolder = holder
        mRect = Rect()
        mCanvas = Canvas()
    }
}
