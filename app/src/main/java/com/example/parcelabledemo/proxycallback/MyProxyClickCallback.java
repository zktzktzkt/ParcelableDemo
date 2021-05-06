package com.example.parcelabledemo.proxycallback;

import android.widget.Toast;

import com.example.parcelabledemo.MyApp;

/**
 * Created by zhoukaitong on 2021/5/4.
 * Description:
 */
public class MyProxyClickCallback implements ProxyClickCallback {

    @Override
    public void onClick(String var1) {
        Toast.makeText(MyApp.getCtx(), "触发点击事件", Toast.LENGTH_SHORT).show();
    }

    /**************************** 模板代码 ***********************/

   /* @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public void readFromParcel(Parcel source) {
    }

    public MyProxyClickCallback() {
    }

    protected MyProxyClickCallback(Parcel in) {
    }

    public static final Creator<MyProxyClickCallback> CREATOR = new Creator<MyProxyClickCallback>() {
        @Override
        public MyProxyClickCallback createFromParcel(Parcel source) {
            return new MyProxyClickCallback(source);
        }

        @Override
        public MyProxyClickCallback[] newArray(int size) {
            return new MyProxyClickCallback[size];
        }
    };*/
}
