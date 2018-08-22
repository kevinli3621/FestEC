package com.sdj.festec.example;

import android.app.Application;

import com.sdj.latte.app.Latte;

/**
 * Created by liwenkang on 2018/8/21.
 */

public class ExampleApp extends Application {

    public  void  onCreate(){
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.1")
                .configure();
    }
}
