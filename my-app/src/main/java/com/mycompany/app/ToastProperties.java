package com.mycompany.app;

import com.mycompany.app.Enums.Cheese;
import com.mycompany.app.Enums.Spice;
import com.mycompany.app.Enums.ToastType;

public abstract class ToastProperties   {
    String size ;
    ToastType toastType;
    Boolean sousege;
    Spice spice;
    Cheese cheese;
    int time;

    public ToastProperties(String size, ToastType toastType, Boolean sousege, Spice spice, Cheese cheese, int time) {
        this.size = size;
        this.toastType = toastType;
        this.sousege = sousege;
        this.spice = spice;
        this.cheese = cheese;
        this.time = time;
    }
}
