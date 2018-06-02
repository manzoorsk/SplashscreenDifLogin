package com.baasaad.splashscreen;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    private Handler splashHandler = new Handler();

    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;
    long Delay = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = (TextView)findViewById(R.id.text);
        TextView text = (TextView)findViewById(R.id.text_o);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageView.startAnimation(animation);
        textView.startAnimation(animation);
        text.startAnimation(animation);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent myIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        }; splashHandler.postDelayed(r, 4000);
//        Timer RunSplash = new Timer();
//        TimerTask ShowSplash = new TimerTask() {
//            @Override
//            public void run() {
//                // Close SplashScreenActivity.class
//                finish();
//
//                // Start MainActivity.class
//                Intent myIntent = new Intent(SplashActivity.this,
//                        MainActivity.class);
//                startActivity(myIntent);
//
//            }
//        };
//
//        RunSplash.schedule(ShowSplash, Delay);
//        Thread timer = new Thread(){
//            @Override
//            public void run() {
//                try {
//                    sleep(4000);
//                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                    startActivity(intent);
//                    finish();
//                    super.run();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        timer.start();



    }
//    public void clockwise(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.myanimation);
//        image.startAnimation(animation);
//    }
//
//    public void zoom(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.clockwise);
//        image.startAnimation(animation1);
//    }
//
//    public void fade(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 =
//                AnimationUtils.loadAnimation(getApplicationContext(),
//                        R.anim.fade);
//        image.startAnimation(animation1);
//    }
//
//    public void blink(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 =
//                AnimationUtils.loadAnimation(getApplicationContext(),
//                        R.anim.blink);
//        image.startAnimation(animation1);
//    }
//
//    public void move(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 =
//                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
//        image.startAnimation(animation1);
//    }
//
//    public void slide(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 =
//                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
//        image.startAnimation(animation1);
//    }

}
