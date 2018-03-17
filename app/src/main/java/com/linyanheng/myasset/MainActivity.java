package com.linyanheng.myasset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        try {
            InputStream in = getAssets().open("poem.txt");
            InputStreamReader isr =  new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text ;
            while((text = reader.readLine())!=null)
            {
                sb.append(text);
            }
            tv.setText(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
