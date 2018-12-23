package com.rzk.test.testbranch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.rzk.test.testbranch.utils.CommonUtils;

public class MainActivity extends AppCompatActivity {

    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = findViewById(R.id.text);
        mText.setText("主分支");

        onMasterBranch();
        
        onBranch1();
    }

    private void onBranch1() {
        mText.setText("分支1");
        Log.e(CommonUtils.TAG, "现在在分支1上开发");
        Log.e(CommonUtils.TAG, "分支1开发完成");
    }

    private void onMasterBranch() {
        Log.e("rzk", "This is master branch");
        Log.e("rzk", "Begin branch2");
    }
}
