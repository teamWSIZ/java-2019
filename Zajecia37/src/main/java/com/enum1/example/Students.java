package com.enum1.example;

public enum Students {
    KRZYSZTOF_ZAREBSKI(183,10),
    JOZEF_KUDRYS(180,10),
    KAMIL_STASICA(176,10),
    ARKADIUSZ_KUBINSKI(192,10),
    KATARZYNA_SKRZYP(168,10);

    final private double height;
    final private int maxPullUp;
    final public static String groupInfo;

    static{
        groupInfo = "Gr.C";
    }

    Students(double height,int maxPullUp){
        this.height = height;
        this.maxPullUp = maxPullUp;
    }

    public double getHeight() {
        return height;
    }

    public String info() {
        return super.toString()+": "+height;
    }

    public void makeExcercise(){
        System.out.println("Wykonuję "+maxPullUp+" podciągnięć.");
    }
}
