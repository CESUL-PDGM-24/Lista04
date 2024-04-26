package br.cesul.lista04.ex03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarbecueTest {

    private Barbecue barbecue;

    @BeforeEach
    public void setup() {
        this.barbecue = new Barbecue(4, 3, 2);
    }

    @Test
    public void testBarbecueAttributes() {
        assertEquals(4, barbecue.getWomen());
        assertEquals(3, barbecue.getMen());
        assertEquals(2, barbecue.getChildren());
    }

    @Test
    public void testBarbecueBeerQuantity() {
        double beer = barbecue.getBeerQuantity();
        assertEquals(3.45, beer, 0.01);
    }

    @Test
    public void testBarbecueMeatQuantity() {
        double meat = barbecue.getMeatQuantity();
        assertEquals(3.1, meat, 0.01);
    }

    @AfterEach
    public void tearDown() {
        this.barbecue = null;
    }
}
