package org.vistula.customer;
import org.vistula.basket.BasketItem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private List<BasketItem> basket;






    public Customer() {
        basket = new ArrayList<BasketItem>();
    }

    public Customer(String firstName, String lastName, int age) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<BasketItem> getBasket() {
        return basket;
    }

    public void setBasket(List<BasketItem> basket) {
        this.basket = basket;
    }



    public boolean isCustomerAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }




    public void addProductToBasket(BasketItem currentBasket) {
        basket.add(currentBasket);
    }

    public boolean removeProductFromBasket(BasketItem currentBasket) {

             boolean b = basket.remove(currentBasket);

             return b;
    }


    public boolean addProductsWithAgeRestrictions(BasketItem newBasket) {

        if (!isCustomerAdult()&& newBasket.isAgeRestrictedItem()){
            return false;
        } else{
            basket.add(newBasket);
        }
        return true;
    }


    public float countCurrentBasketPrice(){
        float total = 0;
        for(BasketItem item: basket) {
            total = total + item.getPrice();
        }
        return total;
    }

    public int getBasketCount() {
        return basket.size();
    }


    public void printOutBasketProducts(){


        for(BasketItem item: basket) {
        String s = String.format("price: %f ageRestriction: %b", item.getPrice(),item.isAgeRestrictedItem());
            System.out.println(s);
        }







    }












     }





