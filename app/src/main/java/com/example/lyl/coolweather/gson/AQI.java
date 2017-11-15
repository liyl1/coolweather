package com.example.lyl.coolweather.gson;

/**
 * Created by Administrator on 2017/11/14.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
