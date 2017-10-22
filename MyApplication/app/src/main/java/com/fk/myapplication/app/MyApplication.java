package com.fk.myapplication.app;

import android.app.Application;

import com.fk.myapplication.dagger.component.MyAppComponent;


/**
 * Created by Administrator on 2017/10/22 0022.
 */
public class MyApplication extends Application {
    public static MyApplication instance;
    public MyAppComponent component;
    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        getComponent();
    }

    public void getComponent(){
//        if(component == null){
//            component = DaggerMyAppComponent
//                    .builder()
//                    .appModule(new AppModule(this))
//                    .build();
//        }
    }
}
