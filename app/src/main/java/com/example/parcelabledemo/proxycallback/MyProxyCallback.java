package com.example.parcelabledemo.proxycallback;

import android.util.Log;

/**
 * Created by zhoukaitong on 2021/5/4.
 * Description:
 */
public class MyProxyCallback implements ProxyCallback {
    @Override
    public void onComplete(Object var1) {
        Log.e("zktzktzkt", "MyProxyCallback -> onComplete");
    }

    @Override
    public void onError(String var1) {
        Log.e("zktzktzkt", "MyProxyCallback -> onError");
    }

    @Override
    public void onCancel() {
        Log.e("zktzktzkt", "MyProxyCallback -> onCancel");
    }


    /************************* 模板代码 ****************************/

    /*@Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public void readFromParcel(Parcel source) {
    }

    public MyProxyCallback() {
    }

    protected MyProxyCallback(Parcel in) {
    }

    public static final Creator<MyProxyCallback> CREATOR = new Creator<MyProxyCallback>() {
        @Override
        public MyProxyCallback createFromParcel(Parcel source) {
            return new MyProxyCallback(source);
        }

        @Override
        public MyProxyCallback[] newArray(int size) {
            return new MyProxyCallback[size];
        }
    };*/
}
