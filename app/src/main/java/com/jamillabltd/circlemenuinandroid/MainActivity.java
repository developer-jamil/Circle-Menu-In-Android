package com.jamillabltd.circlemenuinandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ramotion.circlemenu.CircleMenuView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout layoutBG;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bg
        layoutBG = findViewById(R.id.layoutBGId);

        final CircleMenuView menu = findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener(){
            // ...
            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                Log.d("D","onButtonClickAnimationEnd|index: "+index);
                switch (index) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        layoutBG.setBackgroundColor(Color.WHITE);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        layoutBG.setBackgroundColor(Color.BLACK);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();
                        layoutBG.setBackgroundColor(Color.YELLOW);
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                        layoutBG.setBackgroundColor(Color.BLUE);
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "Place", Toast.LENGTH_SHORT).show();
                        layoutBG.setBackgroundColor(Color.RED);
                        break;
                }
            }
        });
    }
}