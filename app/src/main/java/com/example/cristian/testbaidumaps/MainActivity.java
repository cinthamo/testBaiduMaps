package com.example.cristian.testbaidumaps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.baidu.mapapi.map.BaiduMapOptions;
import com.baidu.mapapi.map.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView mMapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMapView = new MapView(getApplicationContext(), new BaiduMapOptions());
    }
}
