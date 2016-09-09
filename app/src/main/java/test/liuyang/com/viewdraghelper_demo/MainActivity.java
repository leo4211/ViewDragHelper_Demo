package test.liuyang.com.viewdraghelper_demo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private CustomViderView customViderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //透明状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);




        customViderView = (CustomViderView) findViewById(R.id.custom_view);

        customViderView.setVideoURI(Uri.parse("android.resource://"+this.getPackageName()+"/"+R.raw.kr36));


        customViderView.start();
        customViderView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                System.out.println("播放完毕");
                customViderView.start();
            }
        });


        findViewById(R.id.btn_welcome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  it=new Intent(MainActivity.this,Main2Activity.class);


                startActivity(it);

                finish();
//                customViderView


            }
        });

    }
}
