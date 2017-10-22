package com.fk.myapplication.dagger.module;

import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
@Module
public class ActivityModule {
    public AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }
    @Provides
    AppCompatActivity provideActivity(){return activity;}
}
