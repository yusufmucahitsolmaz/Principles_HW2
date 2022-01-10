package com.mycompany.app.Enums;

public enum Cheese {
    CHEDDAR,
    GOUDA,
    TALEGGIO,
    MOZZARELLA;

    @Override
    public String toString() {
        switch (this){
            case CHEDDAR: return "Cheddar";
            case GOUDA: return "Gouda";
            case TALEGGIO:return "Taleggio";
            case MOZZARELLA:return "Mozzarella";
            default: return "Unspecified";
        }
    }
}
