package com.mycompany.app;

import com.mycompany.app.Enums.Cheese;
import com.mycompany.app.Enums.Spice;
import com.mycompany.app.Enums.ToastType;

public class RemoteControl {

    ToastMachine machine;

    public RemoteControl(ToastMachine machine) {
        this.machine = machine;
    }

    public void selectProp(ToastMachine toastMachine){
    if (toastMachine.time>24){
        machine.warn();
        return;
    }
    if (toastMachine.sousege==true){
        machine.prepare();
        System.out.println(toastMachine.cheese +" "+ toastMachine.toastType +" "+ toastMachine.size +" "+ "with sousage,"+" "+  " with "+ toastMachine.spice +" in "+ toastMachine.time + " hour.");
    }
    else {
        machine.prepare();
        System.out.println(toastMachine.cheese +" "+ toastMachine.toastType +" "+ toastMachine.size +" "+ "with not sousage,"+" "+ " with "+toastMachine.spice +" in "+ toastMachine.time +" hour.");
    }
    }
}
