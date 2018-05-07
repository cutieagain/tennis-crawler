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
public class SportItem {

    private Sport sport;
    private int rows;
    private List<Tournaments> tournaments;
    public void setSport(Sport sport) {
         this.sport = sport;
     }
     public Sport getSport() {
         return sport;
     }

    public void setRows(int rows) {
         this.rows = rows;
     }
     public int getRows() {
         return rows;
     }

    public void setTournaments(List<Tournaments> tournaments) {
         this.tournaments = tournaments;
     }
     public List<Tournaments> getTournaments() {
         return tournaments;
     }

}