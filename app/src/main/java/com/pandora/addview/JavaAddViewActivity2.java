package com.pandora.addview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class JavaAddViewActivity2 extends AppCompatActivity implements View.OnClickListener {

    private String TAG = this.getClass().getSimpleName();

    private ImageView image;
    private Button btn_43, btn_169;
    private Button btn_marginleft, btn_marginright;

    //为了更改imageview，获取LayoutParmas对象
    // ImageView父Group是Linearlayout所以这里使用LinearLayout.LayoutParams
    // 你也可以使用通用的ViewGroup.LayoutParams 不过支持的属性较少
    LinearLayout.LayoutParams params;

    //ImageView距左边距
    private int left;
    //ImageView距右边距
    private int right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_add_view2);
        initView();
    }


    public void initView() {
        image = (ImageView) findViewById(R.id.image);
        params = (LinearLayout.LayoutParams) image.getLayoutParams();
        btn_43 = (Button) findViewById(R.id.btn_43);
        btn_169 = (Button) findViewById(R.id.btn_169);
        btn_marginleft = (Button) findViewById(R.id.btn_marginleft);
        btn_marginright = (Button) findViewById(R.id.btn_marginright);
        btn_43.setOnClickListener(this);
        btn_169.setOnClickListener(this);
        btn_marginleft.setOnClickListener(this);
        btn_marginright.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_43:
                params.height = getScreenWidth() * 3 / 4;
                image.setLayoutParams(params);
                break;
            case R.id.btn_169:
                params.height = getScreenWidth() * 9 / 16;
                image.setLayoutParams(params);
                break;
            case R.id.btn_marginleft:
                //左边距增加 可以直接使用PX 或者 转换使用DP单位
                params.leftMargin = dp2px(this, left += 8);
                image.setLayoutParams(params);
                break;
            case R.id.btn_marginright:
                params.rightMargin = dp2px(this, right += 8);
                image.setLayoutParams(params);
                break;
        }
    }


    //获取运行屏幕宽度
    public int getScreenWidth() {
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        //宽度 dm.widthPixels
        //高度 dm.heightPixels
        return dm.widthPixels;
    }

    //DP转PX
    public static int dp2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    //PX转DP
    public static int px2dp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
