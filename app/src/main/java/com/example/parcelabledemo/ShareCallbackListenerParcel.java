package com.example.parcelabledemo;

import android.os.Parcel;

import com.example.parcelabledemo.callback.CallbackListener;
import com.example.parcelabledemo.callback.ClickCallbackListener;

public class ShareCallbackListenerParcel implements android.os.Parcelable {

    public ShareCallbackListenerBinder callbackListenerBinder;

    public CallbackListener getCallbackListener() {
        return this.callbackListenerBinder != null ? this.callbackListenerBinder.getCallbackListener() : null;
    }

    public ClickCallbackListener getClickCallbackListener() {
        return this.callbackListenerBinder != null ? this.callbackListenerBinder.getClickCallbackListener() : null;
    }

    public ShareCallbackListenerParcel(ShareCallbackListenerBinder binder) {
        this.callbackListenerBinder = binder;
    }

    /******************************* 以下为模板代码 ************************************************/

    public ShareCallbackListenerParcel(Parcel parcelIn) {
        Object object = parcelIn.readValue(ShareCallbackListenerBinder.class.getClassLoader());
        if (object instanceof ShareCallbackListenerBinder) {
            callbackListenerBinder = (ShareCallbackListenerBinder) object;
        }
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(callbackListenerBinder);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final static Creator<ShareCallbackListenerParcel> CREATOR =
            new Creator<ShareCallbackListenerParcel>() {

                @Override
                public ShareCallbackListenerParcel createFromParcel(Parcel parcelIn) {
                    return new ShareCallbackListenerParcel(parcelIn);
                }

                @Override
                public ShareCallbackListenerParcel[] newArray(int size) {
                    return new ShareCallbackListenerParcel[size];
                }
            };
}
