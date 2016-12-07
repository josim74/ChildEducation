package comjosim74.github.childeducation;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class SplashScreenActivity extends AppCompatActivity {

    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGB_888);
    }

    Thread splashThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        StartAnimations();
    }

//immarsing
    @Override
    public void onWindowFocusChanged(boolean hasFocal){
        super.onWindowFocusChanged(hasFocal);
        View decorView = getWindow().getDecorView();
        if(hasFocal){
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        }
    }


    private void StartAnimations(){
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        RelativeLayout l = (RelativeLayout) findViewById(R.id.activity_splash_screen);
        l.clearAnimation();
        l.startAnimation(anim);


        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.splash_img);
        iv.clearAnimation();
        iv.startAnimation(anim);
        splashThread = new Thread(){
            @Override
            public  void run(){
                try{
                    int waited = 0;
                    //Splash screen pause time
                    while (waited < 3500){
                        sleep(100);
                        waited +=100;
                    }
                    Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    SplashScreenActivity.this.finish();
                }catch (InterruptedException e){
                    //do nothing
                }finally {
                    SplashScreenActivity.this.finish();
                }
            }
        };
        splashThread.start();
    }
}
