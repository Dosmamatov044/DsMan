package com.example.dsman.data;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;

import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dsman.base.SceneGame;
import com.example.dsman.loop.LoopGame;
import com.example.dsman.touch.TouchListenerGame;

public class CoreGame extends AppCompatActivity {
    private final float FRAME_BUFFER_WIDTH = 800;
    private final float FRAME_BUFFER_HEIGHT = 600;
    private LoopGame mLoopGame;
    private GraphicsGame mGraphicsGame;
    private TouchListenerGame mTouchListenerGame;
    private Display mDisplay;
    private Point mSizeDisplay;
    private Bitmap mFrameBuffer;
    private SceneGame mSceneGame;
    private float mSceneWidth;
    private float mSceneHeight;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        init();
        setContentView(mLoopGame);
    }

    private void init() {

        mSizeDisplay = new Point();
        mDisplay = getWindowManager().getDefaultDisplay();
        mDisplay.getSize(mSizeDisplay);
        mFrameBuffer = Bitmap.createBitmap((int) FRAME_BUFFER_WIDTH, (int) FRAME_BUFFER_HEIGHT, Bitmap.Config.ARGB_8888);
        mSceneWidth = FRAME_BUFFER_WIDTH / mSizeDisplay.x;
        mSceneHeight = FRAME_BUFFER_HEIGHT / mSizeDisplay.y;

        mLoopGame = new LoopGame(this, mFrameBuffer);
        mGraphicsGame = new GraphicsGame(getAssets(), mFrameBuffer);
        mTouchListenerGame = new TouchListenerGame(mLoopGame, mSceneWidth, mSceneHeight);
        mSceneGame = getStartScene();

    }

@Override
    public void onResume() {
        super.onResume();
        mSceneGame.resume();
        mLoopGame.startGame();
    }
    @Override
    public void onPause() {
        super.onPause();
        mSceneGame.pause();
        mLoopGame.stopGame();
        if (isFinishing()) {
            mSceneGame.dispose();
        }
    }




    public GraphicsGame getGraphicsFW() {
        return mGraphicsGame;
    }

    public TouchListenerGame getTouchListenerFW() {
        return mTouchListenerGame;
    }

    public void setScene(SceneGame sceneGame) {
        if (sceneGame == null) {
            throw new IllegalArgumentException("Не возможно загрзуить сцену");
        }
        this.mSceneGame.pause();
        this.mSceneGame.dispose();
        sceneGame.resume();
        sceneGame.update();
        this.mSceneGame = sceneGame;
    }

    public SceneGame getCurrentScene() {
        return mSceneGame;
    }

    public SceneGame getStartScene() {
        return mSceneGame;
    }







}
