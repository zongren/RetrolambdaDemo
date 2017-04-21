package me.zongren.retrolambdademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setOnClickListener(view -> clickTextView(view));
        textView.setOnClickListener(this::clickTextView);
    }

    private void clickTextView(View view) {

    }
}
