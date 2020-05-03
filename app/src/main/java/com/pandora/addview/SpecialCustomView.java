package com.pandora.addview;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class SpecialCustomView {


    public Button addView(Context context, int countId) {
        Button button = new Button(context);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // 设置位置
        if (countId == 100)
            params.addRule(RelativeLayout.BELOW, R.id.topic);
        else
            params.addRule(RelativeLayout.BELOW, countId - 1);
        button.setLayoutParams(params);
        button.setBackgroundColor(Color.RED);
        button.setText("第" + countId + "个button");
        button.setId(countId++);
        return button;
    }
}
