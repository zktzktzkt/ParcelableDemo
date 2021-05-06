package com.example.parcelabledemo.proxycallback;

public interface ProxyCallback /*extends Parcelable*/ {
    void onComplete(Object var1);

    void onError(String var1);

    void onCancel();
}