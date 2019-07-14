package com.example.trydraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(0XFFFF6600);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)10,(float)10,(float)280,(float)150,paint);

    }
}
