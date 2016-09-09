package test.liuyang.com.viewdraghelper_demo;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.VideoView;

/**
 * Created by Administrator on 2016/9/8.
 */
public class CustomViderView extends VideoView {
    public CustomViderView(Context context) {
        super(context);
    }

    public CustomViderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = getDefaultSize(0, widthMeasureSpec);
        int height = getDefaultSize(0, heightMeasureSpec);
//        super.onMeasure(width, height);/


        setMeasuredDimension(width,height);

    }

    @Override
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener l) {
        super.setOnPreparedListener(l);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }
}
