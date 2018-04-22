package com.example.administrator.newbieguidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.app.hubert.guide.NewbieGuide;
import com.app.hubert.guide.model.GuidePage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewbieGuide.with(MainActivity.this)
                .setLabel("guide1")
                .alwaysShow(true)                                                                   // 总是显示，调试时可以打开
                .addGuidePage(GuidePage.newInstance()
                                .setLayoutRes(R.layout.view_guide_simple, R.id.yesButton)                // 引导页布局，点击跳转下一页或者消失引导层的控件id
                                .setEverywhereCancelable(false)                                     // 是否点击任意地方跳转下一页或者消失引导层，默认true
                        // .setShowCounts(3)                                                        // 控制次数
                        // .setBackgroundColor(getResources().getColor(R.color.testColor))          // 设置背景色，建议使用有透明度的颜色
                        // .addHighLight(btnSimple)                                                 // 如果想凸顯某個亮點
                ).show();
    }

    public void test(View view) {
        finish();
    }
}
