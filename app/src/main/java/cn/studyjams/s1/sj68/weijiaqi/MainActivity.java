package cn.studyjams.s1.sj68.weijiaqi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolBar;
    private Button mHistoryBtn;
    private Button mStylteBtn;
    private Button mClassBtn;
    private Button mGroundBtn;
    private Button mBeniftBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        mToolBar.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(mToolBar);



        mHistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, History.class));
            }
        });

        mClassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Classify.class));
            }
        });

        mStylteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Style.class));
            }
        });

        mGroundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EquipAndGround.class));
            }
        });

        mBeniftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Benifts.class));
            }
        });


    }

    private void initViews(){
        mToolBar = (Toolbar) findViewById(R.id.toolbar);

        mHistoryBtn = (Button) findViewById(R.id.history_btn);
        mStylteBtn = (Button) findViewById(R.id.style_btn);
        mClassBtn = (Button) findViewById(R.id.class_btn);
        mGroundBtn = (Button) findViewById(R.id.ground_btn);
        mBeniftBtn = (Button) findViewById(R.id.benifts_btn);
    }

}
