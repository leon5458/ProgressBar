package com.hly.projressbar;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ProgressViewActivity extends AppCompatActivity implements Handler.Callback {

    private ProgressBarView progressBarView;
    private Handler mHandler;
    private int progress = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_view_activity_layout);
        progressBarView = findViewById(R.id.progress_view);
        mHandler = new Handler(this);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(50);
                        progress++;
                        mHandler.sendEmptyMessage(1);
                        if (progress >= 100) {
                            progress = 0;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case 1:
                progressBarView.setProgress(progress);
                progressBarView.invalidate();
                break;
            default:
                break;
        }
        return false;
    }
}
