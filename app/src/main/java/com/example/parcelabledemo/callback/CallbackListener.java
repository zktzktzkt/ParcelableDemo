package com.example.parcelabledemo.callback;

public interface CallbackListener /*extends android.os.Parcelable*/ {
    void onComplete(Object var1);

    void onError(String var1);

    void onCancel();
}