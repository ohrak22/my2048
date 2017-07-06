package com.john.a2048;

import android.content.Context;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {
    public GameView(Context context) {
        super(context);

        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        // TODO Auto-generated method stub

    }

    public void surfaceCreated(SurfaceHolder holder) {
        // TODO Auto-generated method stub
        android.graphics.Canvas canvas = null;

        try {
            canvas = getHolder().lockCanvas(null);

            synchronized (getHolder())
            {
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setColor(Color.RED);
                canvas.drawRect(0,0,100,100,paint);
            }
        }
        finally {
            if(canvas != null)
                getHolder().unlockCanvasAndPost(canvas);
        }

    }

    public void surfaceDestroyed(SurfaceHolder holder) {
        // TODO Auto-generated method stub

    }


}
