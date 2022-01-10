package com.mycompany.app;

import com.mycompany.app.Enums.Cheese;
import com.mycompany.app.Enums.Spice;
import com.mycompany.app.Enums.ToastType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ToastMachine toastMachine = new ToastMachine("medium", ToastType.AYVALIK_TOAST,false, Spice.CHILI_PEPPER, Cheese.MOZZARELLA,13);
        RemoteControl remoteControl = new RemoteControl(toastMachine);

        remoteControl.selectProp(toastMachine);

    }
}
