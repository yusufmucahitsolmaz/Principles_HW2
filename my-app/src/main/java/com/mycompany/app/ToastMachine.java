package com.mycompany.app;

import com.mycompany.app.Enums.Cheese;
import com.mycompany.app.Enums.Spice;
import com.mycompany.app.Enums.ToastType;

public class ToastMachine extends  ToastProperties{



    public ToastMachine(String size, ToastType toastType, Boolean sousege, Spice spice, Cheese cheese, int time) {
        super(size, toastType, sousege, spice, cheese, time);
    }


    public void prepare(){
            System.out.println("Toast is prepared.");
        }

        public void warn(){
            System.out.println("Enter a time within 24 hours.");
        }
        public void shutDown(){
            System.out.println("Machine turned off.");
        }






}
