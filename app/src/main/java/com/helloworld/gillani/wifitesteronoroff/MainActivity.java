package com.helloworld.gillani.wifitesteronoroff;

import android.content.Context;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //allow to Manifest  "<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"></uses-permission>"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectivityManager connectivityManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        TextView textView=(TextView)findViewById(R.id.wifi);

        boolean wifi=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();

        if(wifi){

            textView.setText("This Wifi is ON!");
        }
        else{

            textView.setText("This Wifi is OFF!");
        }


    }
}
