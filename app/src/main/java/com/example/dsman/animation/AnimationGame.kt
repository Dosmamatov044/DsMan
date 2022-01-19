package com.example.dsman.animation

import android.graphics.Bitmap
import com.example.dsman.data.GraphicsGame

class AnimationGame(
    speedAnimation: Double,
    sprite1: Bitmap,
    sprite2: Bitmap,
    sprite3: Bitmap,
    sprite4: Bitmap
) {
    //region Fields
    private val mSpeedAnimation: Double
    private var mDelayIndex = 0
    private var mCountFrames = 0
    private val mFrames: Int
    private var mSprite: Bitmap
    private val mSprite1: Bitmap
    private val mSprite2: Bitmap
    private val mSprite3: Bitmap
    private val mSprite4: Bitmap
    fun runAnimation() {
        mDelayIndex++
        if (mDelayIndex > mSpeedAnimation) {
            mDelayIndex = 0
            nextFrame()
        }
    }

    private fun nextFrame() {
        if (mCountFrames == 0) {
            mSprite = mSprite1
        }
        if (mCountFrames == 1) {
            mSprite = mSprite2
        }
        if (mCountFrames == 2) {
            mSprite = mSprite3
        }
        if (mCountFrames == 3) {
            mSprite = mSprite4
        }
        mCountFrames++
        if (mCountFrames > mFrames) {
            mCountFrames = 0
        }
    }

    fun drawingAnimation(graphicsGame: GraphicsGame, x: Int, y: Int) {
        graphicsGame.drawTexture(mSprite, x, y)
    }

    //endregion
    init {
        mSprite = sprite1
        mSprite1 = sprite1
        mSprite2 = sprite2
        mSprite3 = sprite3
        mSprite4 = sprite4
        mSpeedAnimation = speedAnimation
        mFrames = 4
    }
}
