package jp.ac.dendai.c.jtp.myapplication1;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.HashMap;
import java.util.Map;

import jp.ac.dendai.c.jtp.myapplication1.mono.Anata;

public class Debug {
    private static boolean mode = false;
    private static Map<String, String> pr;
    private static int i;
    private static Paint paint = new Paint();
    private Debug() {
        init();
    }
    public static void draw(Canvas canvas) {
        if (mode) return;
        if (pr == null || canvas == null) return;
        paint.setColor(Color.RED);
        paint.setTextSize(30);
        i= Anata.getz();
        canvas.drawText(String.valueOf(i), 0, 100, paint);
    }
    public static void init() {
        pr = new HashMap<>();
    }

    public static void append(String key, String value) {
        if (pr == null) init();
        pr.put(key, value);
    }
}