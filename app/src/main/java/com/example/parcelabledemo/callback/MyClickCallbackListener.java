package com.example.parcelabledemo.callback;


import com.example.parcelabledemo.proxycallback.ProxyClickCallback;

public class MyClickCallbackListener implements ClickCallbackListener {

    private ProxyClickCallback proxyClickCallback;

    @Override
    public void onClick(String s) {
        proxyClickCallback.onClick(s);
    }

    public MyClickCallbackListener(ProxyClickCallback proxyClickCallback) {
        this.proxyClickCallback = proxyClickCallback;
    }

    /***************************** 以下为模板代码 ******************************************/


  /*  @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.proxyClickCallback, flags);
    }

    public void readFromParcel(Parcel source) {
        this.proxyClickCallback = source.readParcelable(ProxyClickCallback.class.getClassLoader());
    }

    protected MyClickCallbackListener(Parcel in) {
        this.proxyClickCallback = in.readParcelable(ProxyClickCallback.class.getClassLoader());
    }

    public static final Creator<MyClickCallbackListener> CREATOR = new Creator<MyClickCallbackListener>() {
        @Override
        public MyClickCallbackListener createFromParcel(Parcel source) {
            return new MyClickCallbackListener(source);
        }

        @Override
        public MyClickCallbackListener[] newArray(int size) {
            return new MyClickCallbackListener[size];
        }
    };*/
}