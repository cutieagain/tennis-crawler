/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis.singleGame;
import com.cutie.entity.tennis.games.SubTeams;

import java.util.List;

/**
 * Auto-generated: 2018-05-06 21:33:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class AwayTeam {

    private String name;
    private String slug;
    private String gender;
    private int ranking;
    private boolean national;
    private int id;
    private String shortName;
    private List<SubTeams> subTeams;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setSlug(String slug) {
         this.slug = slug;
     }
     public String getSlug() {
         return slug;
     }

    public void setGender(String gender) {
         this.gender = gender;
     }
     public String getGender() {
         return gender;
     }

    public void setRanking(int ranking) {
         this.ranking = ranking;
     }
     public int getRanking() {
         return ranking;
     }

    public void setNational(boolean national) {
         this.national = national;
     }
     public boolean getNational() {
         return national;
     }

    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setShortName(String shortName) {
         this.shortName = shortName;
     }
     public String getShortName() {
         return shortName;
     }

    public boolean isNational() {
        return national;
    }

    public List<SubTeams> getSubTeams() {
        return subTeams;
    }

    public void setSubTeams(List<SubTeams> subTeams) {
        this.subTeams = subTeams;
    }
}