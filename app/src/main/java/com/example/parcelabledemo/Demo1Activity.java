package com.example.parcelabledemo;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.parcelabledemo.callback.MyCallbackListener;
import com.example.parcelabledemo.callback.MyClickCallbackListener;
import com.example.parcelabledemo.proxycallback.MyProxyCallback;
import com.example.parcelabledemo.proxycallback.MyProxyClickCallback;

/**
 * Created by zhoukaitong on 2021/5/3.
 * Description:
 */
public class Demo1Activity extends AppCompatActivity {

    public static String shareActivityAction = "com.zkt.zkt.ACTION";

    @Override
    protected void onCreate(@androidx.annotation.Nullable android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
    }

    public void onClick(android.view.View view) {

        MyProxyCallback proxyCallback = new MyProxyCallback();
        MyProxyClickCallback proxyClickCallback = new MyProxyClickCallback();

        MyCallbackListener listener1 = new MyCallbackListener(proxyCallback);
        MyClickCallbackListener listener2 = new MyClickCallbackListener(proxyClickCallback);

        ShareCallbackListenerParcel parcel = new ShareCallbackListenerParcel(
                new ShareCallbackListenerBinder(listener1, listener2));

        Intent intent = new Intent(shareActivityAction);
        intent.putExtra("data", parcel);
        startActivity(intent);
    }


}
