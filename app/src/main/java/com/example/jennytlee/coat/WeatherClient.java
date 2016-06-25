package com.example.jennytlee.coat;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import java.util.ArrayList;

/**
 * Created by jennytlee on 6/24/16.
 */
public class WeatherClient {

    private static final String BASE_URL = "http://api.openweathermap.org/dta/2.5/weather";
    private AsyncHttpClient client;

    public WeatherClient() {
        this.client = new AsyncHttpClient();
    }

    public void getWeather(ArrayList params, JsonHttpResponseHandler handler) {

    }

}
