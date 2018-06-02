package org.vistula.basket;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PromoItemTest {


    @Test

    public void shouldCorrectlyCalculateDiscount(){
        PromoItem p = new PromoItem();
        p.setDiscount(20.0f);
        p.setPrice(80.0f);
        p.calculateDiscount();
        assertThat(p.getPrice()).isEqualTo(64.0f);
    }

}
