package com.pandora.addview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class JavaAddViewActivity4 extends AppCompatActivity {

    private ViewGroup viewGroup;

    private int countId = 100;

    private SpecialCustomView specialCustomView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_add_view4);


        viewGroup = (ViewGroup) findViewById(R.id.container);

        specialCustomView = new SpecialCustomView();

        Button button = specialCustomView.addView(this, countId);
        countId++;

        viewGroup.addView(button);
        setContentView(viewGroup);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 添加视图 组件
                Button button = specialCustomView.addView(JavaAddViewActivity4.this, countId);
                countId++;

                viewGroup.addView(button);
                setContentView(viewGroup);
            }
        });

    }
}
