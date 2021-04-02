package com.example.lessonfirst;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Box implements Cloneable {
    double width;
    double height;

    public Box(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}


