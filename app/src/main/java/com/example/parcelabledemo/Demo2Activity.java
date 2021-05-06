package com.example.parcelabledemo;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by zhoukaitong on 2021/5/3.
 * Description:
 */
public class Demo2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@androidx.annotation.Nullable android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        android.widget.TextView textView1 = findViewById(R.id.textView1);
        android.widget.TextView textView2 = findViewById(R.id.textView2);
        android.widget.TextView textVie3 = findViewById(R.id.textVie3);

        ShareCallbackListenerParcel data = getIntent().getParcelableExtra("data");

        textView1.setText("data->" + data);
        textView2.setText("CallbackListener()->" + data.getCallbackListener());
        textVie3.setText("ClickCallbackListener()->" + data.getClickCallbackListener());

        //回调
        data.getClickCallbackListener().onClick("");

//        data.getCallbackListener().onComplete("");
    }

}
