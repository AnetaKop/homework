package org.vistula.basket;

public class PromoItem extends BasketItem {

    private float discount;

    public PromoItem(){}

    public PromoItem(float discount) {
        super();
        this.discount = discount;
    }

    public PromoItem(float price, boolean ageRestrictedItem, float discount) {
        super(price, ageRestrictedItem);
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }



    public float calculateDiscount() {
    price = price *(1-discount/100);
    return price;

    }
}
