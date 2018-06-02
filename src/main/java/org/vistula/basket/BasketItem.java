package org.vistula.basket;

public class BasketItem {


        protected float price;
        boolean ageRestrictedItem;

    public BasketItem() {
        price = 0;
        ageRestrictedItem = false;
    }

    public BasketItem(float price, boolean ageRestrictedItem) {
        this.price = price;
        this.ageRestrictedItem = ageRestrictedItem;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAgeRestrictedItem() {
        return ageRestrictedItem;
    }

    public boolean setAgeRestrictedItem(boolean ageRestrictedItem) {
        this.ageRestrictedItem = ageRestrictedItem;
        return ageRestrictedItem;
    }



}
