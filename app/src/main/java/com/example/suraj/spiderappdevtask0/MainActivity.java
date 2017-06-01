package com.example.suraj.spiderappdevtask0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int value=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inc (View v)
    {
       value++;

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(""+value);

    }
}
