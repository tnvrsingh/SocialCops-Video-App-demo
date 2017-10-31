package com.socialcops.socialcops_video_app_demo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    String videoURL = "https://socialcops.com/images/old/spec/home/header-img-background_video-1920-480.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView)findViewById(R.id.videoViewComponent);
        Uri videoURI = Uri.parse(videoURL);

        videoView.setVideoURI(videoURI);
        videoView.start();
    }
}
