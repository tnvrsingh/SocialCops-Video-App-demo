package com.socialcops.socialcops_video_app_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import com.danikula.videocache.HttpProxyCacheServer;

public class MainActivity extends AppCompatActivity {

    String proxyUrl, videoURL = "https://socialcops.com/images/old/spec/home/header-img-background_video-1920-480.mp4";
    VideoView videoView;
    MediaController videoControls;
    HttpProxyCacheServer proxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView)findViewById(R.id.videoViewComponent);

        // Proxy for cache management
        proxy = CacheManager.getCacheServer(this);
        proxyUrl = proxy.getProxyUrl(videoURL);
        videoView.setVideoPath(proxyUrl);

        // MEDIA CONTROLS on the VideoView
        videoControls = new MediaController(this);
        videoControls.setAnchorView(videoView);
        videoView.setMediaController(videoControls);

        videoView.start();
    }
}
