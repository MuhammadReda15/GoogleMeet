package com.redha.googlemee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.navigation.NavigationView;

public class meet_utama extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meet_utama);

        Button join = findViewById(R.id.join_a_meeting);
        Button newmeet = findViewById(R.id.new_meeting);
        Button menu = findViewById(R.id.menu);
        DrawerLayout drawerLayout = findViewById(R.id.drawerlayout);



        newmeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(meet_utama.this,R.style.BotttomSheetDialogTheme);
                View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.newmeetlayout,(LinearLayout)findViewById(R.id.newmeetlayout));

                bottomSheetView.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }
        });


       menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
       NavigationView navigation = findViewById(R.id.navigationView);


        join.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent join = new Intent(meet_utama.this,joinmeet.class);
                startActivity(join);
            }
        });



    }
}