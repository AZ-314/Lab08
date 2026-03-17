package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    private City mockCity()
    {
        return new City("Lahore", "Punjab") ;
    }
    private CustomList mockCitylist(){
        CustomList citylist = new CustomList() ;
        citylist.addCity(mockCity()) ;
        return citylist ;
    }
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't
        //exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testCountCities()
    {
        CustomList citylist = mockCitylist() ;
        assertEquals(1, citylist.countCities());
        City other = new City("Quetta", "Balochistan") ;
        citylist.addCity(other) ;
        assertEquals(2, citylist.countCities());
    }
    /*
    @Test
    void testDeleteCity()
    {
        CustomList citylist = mockCitylist() ;
        City other = new City("Quetta", "Balochistan") ;
        citylist.addCity(other) ;
        assertEquals(2, citylist.getCities().size());
        citylist.deleteCity(other);
        assertEquals(1, citylist.getCities().size());
        assertThrows(IllegalArgumentException.class, () -> {
            citylist.deleteCity(other);
        }) ;

    }

     */

}
