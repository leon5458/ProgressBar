package com.hly.projressbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/27~~~~~~
 * ~~~~~~更改时间:2018/8/27~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class JavaActivity extends AppCompatActivity {

    private LinearLayout mainLayout;//界面主容器
    private TextView tv1;            //文本1
    private ProgressBar bar1;        //圆形进度条
    private TextView tv2;            //文本2
    private ProgressBar bar2;        //水平条状进度条，确定进度
    private TextView tv3;            //文本3
    private ProgressBar bar3;        //水平条状进图条，不确定进度


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.java_activity_layout);
        /*mainLayout主容器初始化*/
        mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);    //垂直分布
        /*tv1文本1初始化*/
        tv1=new TextView(this);
        tv1.setText("圆形进度条");
        mainLayout.addView(tv1);//添加文本1

        /*bar1圆形进度条初始化*/
        bar1=new ProgressBar(this,null,android.R.attr.progressBarStyleLarge);//大圆
        //bar1=new ProgressBar(this,null,android.R.attr.progressBarStyleSmall);//小圆
        //bar1=new ProgressBar(this,null,android.R.attr.progressBarStyleSmallTitle);//小圆，标题条的样式
        /*
         * 下面可以通过改变LayoutParams中的width参数来设置圆形进度条的直径
         * height如果小于width，下圆环会被截掉，无法显示全圆
         */
        LinearLayout.LayoutParams lp1=new LinearLayout.LayoutParams(-2,-2);
        bar1.setLayoutParams(lp1);
        mainLayout.addView(bar1);//添加进度条1

        /*tv2文本2初始化*/
        tv2=new TextView(this);
        tv2.setText("水平进度条");
        mainLayout.addView(tv2);//添加文本2

        /*bar2条形进度条初始化*/
        bar2=new ProgressBar(this,null,android.R.attr.progressBarStyleHorizontal);//水平条形
        LinearLayout.LayoutParams lp2=new LinearLayout.LayoutParams(200, -2);//长度200，高度默认
        bar2.setLayoutParams(lp2);
        bar2.setMax(100);
        bar2.setProgress(50);
        bar2.setSecondaryProgress(75);
        mainLayout.addView(bar2);//添加进度条2


        /*tv3文本3初始化*/
        tv3=new TextView(this);
        tv3.setText("不确定进度的水平进度条");
        mainLayout.addView(tv3);//添加文本3

        /*bar3条形进度条初始化*/
        bar3=new ProgressBar(this,null,android.R.attr.progressBarStyleHorizontal);
        LinearLayout.LayoutParams lp3=new LinearLayout.LayoutParams(300,20);//长度为300，高度20
        bar3.setLayoutParams(lp3);
        /*
         * 设定进度条为不确定进度,默认是可确定进度的进度条，进度初值为0
         * 圆形进度条固定为不确定进度的
         */
        bar3.setIndeterminate(true);
        mainLayout.addView(bar3);//添加进度条3

        setContentView(mainLayout);//显示主容器










    }
}
