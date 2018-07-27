package com.example.xyzreader.remote;

import android.util.Log;

import com.example.xyzreader.data.ConfigException;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json" );
        } catch (MalformedURLException ignored) {
            // Error thrown
            throw new ConfigException("Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
