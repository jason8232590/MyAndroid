package com.fk.myapplication.dagger.component;

import android.support.v7.app.AppCompatActivity;

import com.fk.myapplication.dagger.ActivityScope;
import com.fk.myapplication.dagger.module.ActivityModule;

import dagger.Component;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
@ActivityScope
@Component(modules = ActivityModule.class ,dependencies = MyAppComponent.class)
public interface ActivityComponent {
//    expose to let other place use
    AppCompatActivity activity();
}
