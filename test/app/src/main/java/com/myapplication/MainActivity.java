package com.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    LinearLayout linearLayoutHorizontal, linearLayoutVertical;
    TextView textView;
    Button buttonMid, buttonBottom;

    int[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.CYAN};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.relativeLayout);
        linearLayoutHorizontal = findViewById(R.id.ll_horizontal);
        linearLayoutVertical = findViewById(R.id.ll_vertical);
        textView = findViewById(R.id.mainText);
        buttonMid = findViewById(R.id.firstButton);
        buttonBottom = findViewById(R.id.secondButton);
    }

    public void midButtonClick(View view) {
        textView.setText("Button Clicked");
        int val = new Random(System.currentTimeMillis()).nextInt(colors.length);
        view.setBackgroundColor(colors[val]);
    }

    public void bottomButtonClick(View view) {
        int val = new Random(System.currentTimeMillis()).nextInt(colors.length);
        relativeLayout.setBackgroundColor(colors[val]);
    }
}
