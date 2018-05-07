/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis.games;
import java.util.Date;

/**
 * Auto-generated: 2018-05-07 17:47:19
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Season {

    private String name;
    private String slug;
    private String year;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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