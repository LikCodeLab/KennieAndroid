package com.kennie.base.project;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

public class UserPrivacyPolicyDialog extends AlertDialog {
    protected UserPrivacyPolicyDialog(@NonNull Context context) {
        super(context);
    }

    protected UserPrivacyPolicyDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected UserPrivacyPolicyDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }


    public static class Builder {
        public Builder(@NonNull Context context){

        }
    }
}
