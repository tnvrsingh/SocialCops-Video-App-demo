package com.socialcops.socialcops_video_app_demo;

import android.app.Application;
import android.content.Context;

/**
 * Created by kalol on 31/10/17.
 */
import com.danikula.videocache.HttpProxyCacheServer;

public class CacheManager extends Application {

    private HttpProxyCacheServer cacheServer;
    static CacheManager application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static HttpProxyCacheServer getCacheServer(Context context) {
        if(application.cacheServer == null) application.cacheServer = application.buildHttpCacheServer();
        return application.cacheServer;
    }

    private HttpProxyCacheServer buildHttpCacheServer() {
        return new HttpProxyCacheServer.Builder(this)
                .cacheDirectory(getCacheDir())
                .build();
    }
}

