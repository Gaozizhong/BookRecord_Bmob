package cn.a1949science.www.bookrecord_bomb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.bmob.v3.Bmob;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        //默认初始化
        Bmob.initialize(this, "8b2890f3afdee1e695d1024a61bedc38");
    }
}
