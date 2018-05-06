/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis;

/**
 * Auto-generated: 2018-05-06 21:33:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Venue {

    private Country country;
    private City city;
    private Stadium stadium;
    private int id;
    public void setCountry(Country country) {
         this.country = country;
     }
     public Country getCountry() {
         return country;
     }

    public void setCity(City city) {
         this.city = city;
     }
     public City getCity() {
         return city;
     }

    public void setStadium(Stadium stadium) {
         this.stadium = stadium;
     }
     public Stadium getStadium() {
         return stadium;
     }

    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

}