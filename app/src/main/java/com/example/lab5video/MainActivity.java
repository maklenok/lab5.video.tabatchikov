package com.example.lab5video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView MyvideoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyvideoPlayer = (VideoView)findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pig);
        MyvideoPlayer.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        MyvideoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(MyvideoPlayer);
    }
    public void onStartClick(View view)
    {
        MyvideoPlayer.start();
    }
    public void onPauseClick(View view)
    {
        MyvideoPlayer.pause();
    }
    public void onStopClick(View view)
    {
        MyvideoPlayer.stopPlayback();
        MyvideoPlayer.resume();
    }
}