/* Author: Kaushal Topinkatti B 
   Date: 30/05/2017
   Image downloader app from internet */

package com.example.trans__elcapitan.downloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    ImageView downloadedImg;


    public void download(View view) {

        EditText etrURL = (EditText) findViewById(R.id.etUrl);

        imgDownloader task = new imgDownloader();

        Bitmap myImage;

        try {

            myImage = task.execute(String.valueOf(etrURL.getText())).get();

            downloadedImg.setImageBitmap(myImage);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


    public class imgDownloader extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... urls) {
            try {

                URL url = new URL(urls[0]);

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.connect();

                InputStream inputStream = connection.getInputStream();

                Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);

                return myBitmap;

            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            }
            return null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        downloadedImg = (ImageView) findViewById(R.id.imageView);
    }

}
