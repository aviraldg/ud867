package com.aviraldg.displayerofjokes;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    public static final String JOKE = "joke";

    public static Intent getIntent(Context context, String joke) {
        Intent intent = new Intent(context, JokeDisplayActivity.class);
        intent.putExtra(JOKE, joke);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        String joke = getIntent().getStringExtra(JOKE);
        if(joke == null) {
            throw new IllegalStateException("joke == null");
        }

        ((TextView) findViewById(R.id.joke)).setText(joke);
    }
}
