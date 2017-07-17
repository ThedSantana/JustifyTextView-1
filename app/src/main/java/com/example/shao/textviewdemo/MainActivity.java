package com.example.shao.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * 实现两端对齐排版的自定义TextView
 * 参靠博客：http://blog.csdn.net/wangle12138/article/details/52044480
 */
public class MainActivity extends AppCompatActivity {

    private TextView tvHonor;
    private TextView tvXw;
    private JustifyTextView tvXw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHonor = (TextView) findViewById(R.id.tv_honor);
        tvXw  = (TextView) findViewById(R.id.tv_xw);
        tvXw  = (TextView) findViewById(R.id.tv_xw);
        tvXw2  = (JustifyTextView) findViewById(R.id.tv_xw2);

        tvXw2.setTitleWidth(tvXw);

    }
}
