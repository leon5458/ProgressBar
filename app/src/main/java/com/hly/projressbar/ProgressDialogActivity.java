package com.hly.projressbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/27~~~~~~
 * ~~~~~~更改时间:2018/8/27~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class ProgressDialogActivity extends AppCompatActivity {
    /**
     * 在API level 26 中，ProgressDialog被声明不赞成使用，应使用的替代方法是ProgressBar
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressdialog_activity_layout);
        ProgressDialog progressDialog = new ProgressDialog(ProgressDialogActivity.this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);//圆
//        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);//水平
        progressDialog.setTitle("我是标题");
        progressDialog.setMessage("我是内容..........");
        progressDialog.setCancelable(true);
        progressDialog.show();
    }
}
