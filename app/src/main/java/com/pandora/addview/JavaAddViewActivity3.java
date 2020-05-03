package com.pandora.addview;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class JavaAddViewActivity3 extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_add_view3);

        initView();
    }

    private void initView() {
        mLinearLayout = findViewById(R.id.linear_layout);
        Button mBtnAddView = findViewById(R.id.btn_add_view);
        mBtnAddView.setOnClickListener(this);
    }

    private int childCount = 0;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_view:
                childCount++;

                TextView childView1 = (TextView) LayoutInflater.from(JavaAddViewActivity3.this).inflate(R.layout.layout_item_view, mLinearLayout, false);
                mLinearLayout.addView(childView1);

                TextView textView1 = childView1.findViewById(R.id.text_view);

                switch (childCount) {
                    case 1:
                        textView1.setId(R.id.text_view_1);
                        //textView1.setId(View.generateViewId());
                        textView1.setText(String.valueOf("第 " + childCount + " 个view"));
                        initAnimation(textView1, 1);
                        break;
                    case 2:
                        textView1.setId(R.id.text_view_2);
                        //textView1.setId(View.generateViewId());
                        textView1.setText(String.valueOf("第 " + childCount + " 个view"));
                        initAnimation(textView1, 2);
                        break;
                    case 3:
                        textView1.setId(R.id.text_view_3);
                        //textView1.setId(View.generateViewId());
                        textView1.setText(String.valueOf("第 " + childCount + " 个view"));
                        textView1.setTextColor(Color.RED);
                        break;
                    case 4:
                        //textView1.setId(R.id.text_view_4);
                        textView1.setId(View.generateViewId());
                        textView1.setText(String.valueOf("第 " + childCount + " 个view"));
                        break;
                    case 5:
                        TextView textView = new TextView(JavaAddViewActivity3.this);
                        //textView.setId(R.id.text_view_5);
                        textView1.setId(View.generateViewId());
                        textView.setTextSize(20);
                        textView.setGravity(Gravity.CENTER);
                        textView.setPadding(20, 20, 20, 20);
                        textView.setText(String.valueOf("第 " + childCount + " 个view"));
                        textView.setTextColor(Color.BLUE);
                        mLinearLayout.addView(textView);
                        break;
                }

                break;
        }
    }

    private void initAnimation(TextView textView, int position) {
        switch (position) {
            case 1:
                TranslateAnimation mLeftAnimation1 = new TranslateAnimation(Animation.RELATIVE_TO_SELF, -1.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                        0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                mLeftAnimation1.setDuration(500);
                textView.startAnimation(mLeftAnimation1);
                textView.animate().alpha(1);
                break;
            case 2:
                TranslateAnimation mLeftAnimation2 = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 1.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                        0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                mLeftAnimation2.setDuration(500);
                textView.startAnimation(mLeftAnimation2);
                textView.animate().alpha(1);
                break;
        }

    }

}
