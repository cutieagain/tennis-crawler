/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis;
import java.util.Date;

/**
 * Auto-generated: 2018-05-06 21:33:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Season {

    private Date name;
    private Date slug;
    private String year;
    private int id;
    public void setName(Date name) {
         this.name = name;
     }
     public Date getName() {
         return name;
     }

    public void setSlug(Date slug) {
         this.slug = slug;
     }
     public Date getSlug() {
         return slug;
     }

    public void setYear(String year) {
         this.year = year;
     }
     public String getYear() {
         return year;
     }

    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

}