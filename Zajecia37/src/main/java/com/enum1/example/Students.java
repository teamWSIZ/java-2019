package com.enum1.example;

public enum Students {
    KRZYSZTOF_ZAREBSKI(183),
    JOZEF_KUDRYS(180),
    KAMIL_STASICA(176),
    ARKADIUSZ_KUBINSKI(192),
    KATARZYNA_SKRZYP(168);

    final private double height;
    final public static String groupInfo;

    static{
        groupInfo = "Gr.C";
    }

    Students(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public String info() {
        return super.toString()+": "+height;
    }
}
