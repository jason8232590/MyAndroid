package com.fk.myapplication.dagger.module;


import com.fk.myapplication.app.MyApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
@Module
public class AppModule {

    public MyApplication app;

    public AppModule(MyApplication app) {
        this.app = app;
    }
    @Provides
    MyApplication provideApp(){return app;}

}
