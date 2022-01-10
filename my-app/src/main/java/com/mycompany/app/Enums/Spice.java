package com.mycompany.app.Enums;

public enum Spice {
    CHILI_PEPPER,
    BLACK_PEPPER,
    SALT;

    @Override
    public String toString() {
        switch (this){
            case SALT: return "salt";
            case BLACK_PEPPER:return "black pepper";
            case CHILI_PEPPER:return "chili pepper";
            default: return "unspecified";
        }
    }
}
