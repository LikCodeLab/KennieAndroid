package com.kennie.example.project.base;

import com.kennie.base.project.core.BaseActivity;
import com.kennie.example.project.R;

public abstract class AppActivity extends BaseActivity {

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.activity_left_in, R.anim.activity_left_out);
    }
}
