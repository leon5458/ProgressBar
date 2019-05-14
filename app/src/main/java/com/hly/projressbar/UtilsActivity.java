package com.hly.projressbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/27~~~~~~
 * ~~~~~~更改时间:2018/8/27~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class UtilsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.utils_activity_layout);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             new ProgressBarUtils().showProgressDlg("请求中",UtilsActivity.this);
            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               new ProgressBarUtils().stopProgressDlg();
            }
        });

    }
}
