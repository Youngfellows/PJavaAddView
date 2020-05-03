package com.pandora.addview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class JavaAddViewActivity1 extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_java_add_view1);

        //使用java代码动态添加子view
        oneWay();
    }

    private void oneWay() {
        Button button = new Button(this);
        button.setText("One");
        Button button2 = new Button(this);
        button2.setText("Two");

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        //此处相当于布局文件中的Android:layout_gravity属性
        lp.gravity = Gravity.RIGHT;
        button.setLayoutParams(lp);
        //此处相当于布局文件中的Android：gravity属性
        button.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp2.gravity = Gravity.LEFT;
        button2.setLayoutParams(lp2);
        button2.setGravity(Gravity.CENTER);

        LinearLayout linear = new LinearLayout(this);
        //注意，对于LinearLayout布局来说，设置横向还是纵向是必须的！否则就看不到效果了。
        linear.setOrientation(LinearLayout.VERTICAL);
        linear.addView(button);
        linear.addView(button2);
        linear.setBackgroundColor(0x30ffffff);
        setContentView(linear);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: button");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: button2");
            }
        });
    }

    private void anotherWay() {
        Button button = new Button(this);
        button.setText("One");
        //此处相当于布局文件中的Android：gravity属性
        button.setGravity(Gravity.CENTER);

        LinearLayout linear = new LinearLayout(this);
        //注意，对于LinearLayout布局来说，设置横向还是纵向是必须的！否则就看不到效果了。
        linear.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        //此处相当于布局文件中的Android:layout_gravity属性
        lp.gravity = Gravity.RIGHT;

        linear.addView(button, lp);
        setContentView(linear);
    }
}
