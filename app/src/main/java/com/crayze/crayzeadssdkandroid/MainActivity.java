package com.crayze.crayzeadssdkandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crayze.crayzeadssdk.Crayze;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Crayze.getInstance().setAppToken("578a7d1470ea9");
        //        Crayze.getInstance().setTestMode(true);

        Crayze.getInstance().startApp(this);
    }
}
