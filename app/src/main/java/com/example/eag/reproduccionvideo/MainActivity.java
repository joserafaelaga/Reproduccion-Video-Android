package com.example.eag.reproduccionvideo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView video;
    MediaController media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video = (VideoView) findViewById(R.id.video);

        //Añadimos controles
        video.setMediaController(new MediaController(this));

        //Buscamos la URL de nuestro vídeo y la parseamos
        Uri uri = Uri.parse("http://techslides.com/demos/sample-videos/small.mp4");

        //Le pasamos el vídeo
        video.setVideoURI(uri);

        //Iniciamos el vídeo
        video.start();


    }
}
