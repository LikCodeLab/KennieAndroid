package com.kennie.base.project;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.kennie.base.project.core.Constants;
import com.kennie.base.project.utils.SPUtils;

/**
 * APP
 */
public class LoadingActivity extends AppCompatActivity {

    private Handler handler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 后台返回时可能启动这个页面 http://blog.csdn.net/jianiuqi/article/details/54091181
        if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
            finish();
            return;
        }

        if (SPUtils.getInt(Constants.IS_AGREE_PRIVATE, 0) == 0) {
            UserPrivacyPolicyDialog.show(this, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SPUtils.putInt(Constants.IS_AGREE_PRIVATE, 1);
                    //startActivity(new Intent(LoadingActivity.this, MainActivity.class));
                    overridePendingTransition(R.anim.screen_zoom_in, R.anim.screen_zoom_out);
                    finish();
                }
            });
        } else {
            handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(() -> {
                // startActivity(new Intent(LoadingActivity.this, MainActivity.class));
                overridePendingTransition(R.anim.screen_zoom_in, R.anim.screen_zoom_out);
                finish();
            }, 200);
        }
    }
}
