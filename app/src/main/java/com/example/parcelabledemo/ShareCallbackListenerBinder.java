package com.example.parcelabledemo;

import android.os.Binder;

import com.example.parcelabledemo.callback.CallbackListener;
import com.example.parcelabledemo.callback.ClickCallbackListener;

public class ShareCallbackListenerBinder extends Binder {

    public CallbackListener callbackListener;
    public ClickCallbackListener clickCallbackListener;

    public ShareCallbackListenerBinder(CallbackListener callbackListener,
                                       ClickCallbackListener clickCallbackListener) {
        this.callbackListener = callbackListener;
        this.clickCallbackListener = clickCallbackListener;
    }

    public CallbackListener getCallbackListener() {
        return callbackListener;
    }

    public ClickCallbackListener getClickCallbackListener() {
        return clickCallbackListener;
    }
}