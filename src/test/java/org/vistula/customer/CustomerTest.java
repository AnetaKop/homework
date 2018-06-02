package org.vistula.customer;

import org.junit.Test;
import org.vistula.basket.BasketItem;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;


public class CustomerTest {




    @Test

    public void shouldCheckIfCustomerIsNotAdult() {
        Customer cust = new Customer();
        cust.setAge(17);
        assertThat(cust.isCustomerAdult()).isFalse();

    }

    @Test

    public void shouldCountCurrentBasketPrice() {
        Customer cust = new Customer();
        BasketItem b = new BasketItem();
        b.setPrice(3.0f);
        cust.addProductToBasket(b);

        b = new BasketItem();
        b.setPrice(5.0f);
        cust.addProductToBasket(b);

        b = new BasketItem();
        b.setPrice(7.0f);
        cust.addProductToBasket(b);

        assertThat(cust.countCurrentBasketPrice()).isEqualTo(15.0f);
    }


    @Test
    public void shouldAddProductWithAgeRestriction(){

        BasketItem b = new BasketItem(0.5f,true);
        Customer cust = new Customer("Johny","Bravo",15);
        boolean isAdded = cust.addProductsWithAgeRestrictions(b);

        assertThat(cust.getBasketCount()).isEqualTo(0);
        assertFalse(isAdded);

    }



    @Test

    public void shouldNotAddProductWithAgeRestriction(){
        BasketItem b = new BasketItem();
        Customer cust = new Customer();
        cust.addProductsWithAgeRestrictions(b);
        cust.setAge(17);

        assertThat(cust.getBasketCount()).isEqualTo(0);

    }


    @Test

    public void shouldAddProductToBasket() {
        Customer cust = new Customer();

        BasketItem b = new BasketItem();
        cust.addProductToBasket(b);

        b = new BasketItem();
        cust.addProductToBasket(b);

        b = new BasketItem();
        cust.addProductToBasket(b);

        assertThat(cust.getBasketCount()).isEqualTo(3);

    }
    @Test

    public void shouldRemoveProductFromBasket(){
        Customer cust = new Customer();

        BasketItem b = new BasketItem(50.5f,false);
        cust.addProductToBasket(b);

        b = new BasketItem(32.4f,true);
        cust.addProductToBasket(b);

        assertThat(cust.getBasketCount()).isEqualTo(2);


        cust.removeProductFromBasket(b);

        assertThat(cust.getBasketCount()).isEqualTo(1);
    }

    @Test

    public void shouldPrintOutBasketProducts(){
        Customer cust = new Customer();
        BasketItem b;

        b = new BasketItem(32.4f,true);
        cust.addProductToBasket(b);

        b = new BasketItem(50.5f,false);
        cust.addProductToBasket(b);

        cust.printOutBasketProducts();

    }



}





