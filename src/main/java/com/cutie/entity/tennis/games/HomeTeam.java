/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis.games;
import java.util.List;

/**
 * Auto-generated: 2018-05-07 17:47:19
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class HomeTeam {

    private String name;
    private long id;
    private List<String> subTeams;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setId(long id) {
         this.id = id;
     }
     public long getId() {
         return id;
     }

    public void setSubTeams(List<String> subTeams) {
         this.subTeams = subTeams;
     }
     public List<String> getSubTeams() {
         return subTeams;
     }

}