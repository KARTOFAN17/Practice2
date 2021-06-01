package com.mirea.grachev.dialog_window;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStartDialog(View view) {
        Dialog dialogFragment = new Dialog();
        dialogFragment.show(getSupportFragmentManager(), "Hello");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "You choose the button  \"Yes\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "You choose the buttonу \"No\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "You choose the button \"Not Sure\"!",
                Toast.LENGTH_LONG).show();
    }
}