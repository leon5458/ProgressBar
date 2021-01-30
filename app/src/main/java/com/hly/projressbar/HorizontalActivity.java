package com.hly.projressbar;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class HorizontalActivity extends AppCompatActivity implements Handler.Callback {

    private ProgressBar progressBar;
    private ProgressBar sysProgressBar;
    private ProgressBar send_progress;
    private Handler handler;
    private int progress = 0;
    private int sendProgress = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horizontal_activity_layout);

        progressBar = findViewById(R.id.hori_progress);
        sysProgressBar = findViewById(R.id.sys_progress);
        send_progress = findViewById(R.id.send_progress);

        handler = new Handler(this);
        // 循环方法1
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 50);
                handler.sendEmptyMessage(1);
            }
        }, 0);

        // 循环方法2
        //        new Thread(new Runnable() {
        //            @Override
        //            public void run() {
        //                try {
        //                    //子线程循环间隔消息
        //                    while (progress < 100) {
        //                        Message msg = new Message();
        //                        msg.what = 1;
        //                        handler.sendMessage(msg);
        //                        Thread.sleep(50);
        //                    }
        //                } catch (InterruptedException e) {
        //                    e.printStackTrace();
        //                }
        //            }
        //        }).start();

    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case 1:
                if (progress == 100) {
                    progress = 0;
                    sendProgress = 0;
                } else {
                    progress++;
                    sendProgress = 5 + sendProgress;
                }

                progressBar.setProgress(progress);
                sysProgressBar.setProgress(progress);
                send_progress.setProgress(progress);
                send_progress.setSecondaryProgress(sendProgress);
                break;

        }

        return false;
    }
}
