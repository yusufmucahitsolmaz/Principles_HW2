package com.mycompany.app.Enums;

public enum ToastType {
    AYVALIK_TOAST,
    BAGEL_TOAST,
    CLASSIC_TOAST,
    LAVASH_TOAST,
    HALF_TOAST,
    FULL_TOAST,
    RED_TOAST,
    GRILLED_TOAST;

    @Override
    public String toString() {
        switch (this) {
            case AYVALIK_TOAST:
                return "ayvalık toast";
            case BAGEL_TOAST:
                return "bagel toast";
            case CLASSIC_TOAST:
                return "classic toast";
            case LAVASH_TOAST:
                return "lavash toast";
            case HALF_TOAST:
                return "half toast";
            case FULL_TOAST:
                return "full toast";
            case RED_TOAST:
                return "red toast";
            case GRILLED_TOAST:
                return "grilled toast";
            default:
                return "unspecified";
        }

    }
}
