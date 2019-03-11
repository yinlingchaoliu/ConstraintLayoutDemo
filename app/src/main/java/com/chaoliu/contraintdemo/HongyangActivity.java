package com.chaoliu.contraintdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HongyangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_hongyang );
        setTitle( "演示demo" );

        findViewById( R.id.click ).setOnClickListener( v->{
            Toast.makeText( this,"一层布局显示所有内容",Toast.LENGTH_SHORT ).show();
            startActivity( new Intent( this,OneStageActivity.class ) );
        } );

    }


}
