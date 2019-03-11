package com.chaoliu.contraintdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OneStageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_one_stage );
        setTitle( "constraintLayout 一层写法" );
        findViewById( R.id.click ).setOnClickListener( v->{
            finish();
        } );
    }
}
