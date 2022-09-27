package com.example.mvvm;

import android.graphics.ColorSpace;

public class ModelClass
{
  String pname;
  public ModelClass(){}
    public ModelClass(String pname) {
        this.pname = pname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
