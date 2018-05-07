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
public class Tournaments {

    private Tournament tournament;
    private Category category;
    private Season season;
    private boolean hasEventPlayerStatistics;
    private boolean hasEventPlayerHeatMap;
    private boolean hasBoxScore;
    private List<Events> events;
    public void setTournament(Tournament tournament) {
         this.tournament = tournament;
     }
     public Tournament getTournament() {
         return tournament;
     }

    public void setCategory(Category category) {
         this.category = category;
     }
     public Category getCategory() {
         return category;
     }

    public void setSeason(Season season) {
         this.season = season;
     }
     public Season getSeason() {
         return season;
     }

    public void setHasEventPlayerStatistics(boolean hasEventPlayerStatistics) {
         this.hasEventPlayerStatistics = hasEventPlayerStatistics;
     }
     public boolean getHasEventPlayerStatistics() {
         return hasEventPlayerStatistics;
     }

    public void setHasEventPlayerHeatMap(boolean hasEventPlayerHeatMap) {
         this.hasEventPlayerHeatMap = hasEventPlayerHeatMap;
     }
     public boolean getHasEventPlayerHeatMap() {
         return hasEventPlayerHeatMap;
     }

    public void setHasBoxScore(boolean hasBoxScore) {
         this.hasBoxScore = hasBoxScore;
     }
     public boolean getHasBoxScore() {
         return hasBoxScore;
     }

    public void setEvents(List<Events> events) {
         this.events = events;
     }
     public List<Events> getEvents() {
         return events;
     }

}