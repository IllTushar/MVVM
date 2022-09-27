package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
TextView text;
ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        ModelClass modelClass = new ModelClass("Samsung A13");
        mainBinding.setModelClass(modelClass);
        mainBinding.getModelClass();
    }
}