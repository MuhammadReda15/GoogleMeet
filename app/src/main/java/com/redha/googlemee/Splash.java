package com.redha.googlemee;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splas);

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(1500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    {
                        startActivity(new Intent(Splash.this, login.class));
                        finish();
                    }
                }
            }
        };
        thread.start();
    }
}