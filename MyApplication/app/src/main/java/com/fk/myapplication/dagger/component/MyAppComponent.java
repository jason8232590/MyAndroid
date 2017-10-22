package com.fk.myapplication.dagger.component;


import com.fk.myapplication.app.MyApplication;
import com.fk.myapplication.dagger.module.AppModule;

import dagger.Component;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
@Component(modules = {AppModule.class})
public interface MyAppComponent {

    void inject(MyApplication app);


}
