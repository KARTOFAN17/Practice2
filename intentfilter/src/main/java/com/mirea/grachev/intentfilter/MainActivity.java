package com.mirea.grachev.intentfilter;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "https://www.mirea.ru/");
        startActivity(Intent.createChooser(shareIntent, "HTTP"));
        Uri address = Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        if(openLinkIntent.resolveActivity(getPackageManager()) != null){
            startActivity(openLinkIntent);
        }
        else{
            Log.d("Intent", "Can't process your request!");
        }

    }
}
