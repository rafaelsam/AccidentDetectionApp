package com.example.sounddet.ui.home;

import android.content.Context;
import android.media.MediaPlayer;

import android.widget.Toast;

import com.example.sounddet.R;


public class AlarmSound {
    MediaPlayer mediaPlayer;
    Context context;

    AlarmSound(Context context){
        this.context = context;
    }

    public void Play(){
        if(mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(context, R.raw.alramsound);
            mediaPlayer.setLooping(true);
        }

        mediaPlayer.start();
    }

    public void Stop(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
            Toast.makeText(context, "Alram canceld", Toast.LENGTH_SHORT).show();
        }
    }
}
