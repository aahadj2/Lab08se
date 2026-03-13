package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because  hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Calgary", "NT");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.delCity(city);
        assertFalse(list.hasCity(city));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCity()); // Should be empty initially

        City city = new City("Saskatoon", "SK");
        list.addCity(city);

        assertEquals(1, list.countCity());
    }
}
