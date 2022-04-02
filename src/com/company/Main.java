package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.printInfo();
        System.out.println(boss.printInfo());

    Skeleton skeleton = new Skeleton();
    skeleton.setQuantityArrows(65);

    Skeleton skeleton1 = new Skeleton();
    skeleton1.setQuantityArrows(34);

        System.out.println(skeleton.printInfo()+"   " + skeleton1.printInfo());





    }
}
