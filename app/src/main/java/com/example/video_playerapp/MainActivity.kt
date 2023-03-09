package com.example.video_playerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Displaying videos from local storage
        val videoView: VideoView = findViewById(R.id.videoview1)
        videoView.setVideoPath(
            "android.resource://"
                    +packageName+"/"
                    +R.raw.mountains
        )
        val mediaController = MediaController(this)

        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
    }
}