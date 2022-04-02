package com.company;

public class Skeleton extends Boss{
    private int quantityArrows;


    public int getQuantityArrows() {
        return quantityArrows;
    }

    public void setQuantityArrows(int quantityArrows) {
        this.quantityArrows = quantityArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " QuantityArrows: " + getQuantityArrows();
    }
}
