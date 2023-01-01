package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imview;
    String url = "https://myskillsconnect.com/uploads/posts/2019-11/1574937873_new-year-77.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imview = (ImageView) findViewById(R.id.imageview);
        loading(url);
    }

    private void loading(String url) {

        Picasso.get().load(url).placeholder(R.mipmap.ic_launcher)
        .error(R.mipmap.ic_launcher)
        .into(imview, new com.squareup.picasso.Callback() {
            @Override
            public void onSuccess() {
            }

            @Override
            public void onError(Exception e) {
            }

        });

    }

}