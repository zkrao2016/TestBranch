package com.rzk.test.testbranch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = findViewById(R.id.text);
        mText.setText("主分支");

        onMasterBranch();
    }

    private void onMasterBranch() {
        Log.e("", "This is master branch");
    }
}
