/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis.singleGame;
import java.util.List;

/**
 * Auto-generated: 2018-05-06 21:33:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Periods {

    private String period;
    private List<Groups> groups;
    public void setPeriod(String period) {
         this.period = period;
     }
     public String getPeriod() {
         return period;
     }

    public void setGroups(List<Groups> groups) {
         this.groups = groups;
     }
     public List<Groups> getGroups() {
         return groups;
     }

}