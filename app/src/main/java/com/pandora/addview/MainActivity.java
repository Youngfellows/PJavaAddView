package com.pandora.addview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onAddview1(View view) {
        Intent intent = new Intent(this, JavaAddViewActivity1.class);
        startActivity(intent);
    }

    public void onAddview2(View view) {
        Intent intent = new Intent(this, JavaAddViewActivity2.class);
        startActivity(intent);
    }

    public void onAddview3(View view) {
        Intent intent = new Intent(this, JavaAddViewActivity3.class);
        startActivity(intent);
    }

    public void onAddview4(View view) {
        Intent intent = new Intent(this, JavaAddViewActivity4.class);
        startActivity(intent);
    }


    public void onAddview5(View view) {
        Intent intent = new Intent(this, JavaAddViewActivity5.class);
        startActivity(intent);
    }

    public void onAddview6(View view) {
        Intent intent = new Intent(this, JavaAddViewActivity6.class);
        startActivity(intent);
    }


}
