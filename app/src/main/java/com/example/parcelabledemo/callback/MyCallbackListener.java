package com.example.parcelabledemo.callback;

import com.example.parcelabledemo.proxycallback.ProxyCallback;

public class MyCallbackListener implements CallbackListener {

    private ProxyCallback proxyCallback;

    public MyCallbackListener(ProxyCallback proxyCallback) {
        this.proxyCallback = proxyCallback;
    }

    @Override
    public void onComplete(Object var1) {
        proxyCallback.onComplete(var1);
    }

    @Override
    public void onError(String var1) {
        proxyCallback.onError(var1);
    }

    @Override
    public void onCancel() {
        proxyCallback.onCancel();
    }

    /***************************** 以下为模板代码 ******************************************/


    /*@Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.proxyCallback, flags);
    }

    public void readFromParcel(Parcel source) {
        this.proxyCallback = source.readParcelable(ProxyCallback.class.getClassLoader());
    }

    protected MyCallbackListener(Parcel in) {
        this.proxyCallback = in.readParcelable(ProxyCallback.class.getClassLoader());
    }

    public static final Creator<MyCallbackListener> CREATOR = new Creator<MyCallbackListener>() {
        @Override
        public MyCallbackListener createFromParcel(Parcel source) {
            return new MyCallbackListener(source);
        }

        @Override
        public MyCallbackListener[] newArray(int size) {
            return new MyCallbackListener[size];
        }
    };*/
}