package com.enum1.example;

public enum Students {
    KRZYSZTOF_ZAREBSKI(183),
    JOZEF_KUDRYS(180),
    KAMIL_STASICA(176),
    ARKADIUSZ_KUBINSKI(192),
    KATARZYNA_SKRZYP(168);

    final private double height;

    Students(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
