package com.hly.projressbar;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/27~~~~~~
 * ~~~~~~更改时间:2018/8/27~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class ProgressBarUtils {

     ProgressDialog progressDlg = null;
    /**
     * 启动进度条
     * @param strMessage 进度条显示的信息
     *  当前的activity
     */
    public void showProgressDlg(String strMessage, Context ctx) {
        if (null == progressDlg) {
            progressDlg = new ProgressDialog(ctx);
            //设置进度条样式
            progressDlg.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            //设置进度条标题
//            progressDlg.setTitle(Tool.getApplicationContext().getString(R.string.app_name));
            //提示的消息
            progressDlg.setMax(100);
            progressDlg.setMessage(strMessage);
            progressDlg.setIndeterminate(false);//设置false 说明进度一样,true 是进度不明确
            progressDlg.setCancelable(true); //点击外部取消
//            progressDlg.setIcon(R.drawable.ic_launcher_background);
            progressDlg.show();
        }
    }

    /**
     * 结束进度条
     */
    public  void stopProgressDlg() {
        if (null != progressDlg) {
            progressDlg.dismiss();
            progressDlg = null;
        }
    }

}
