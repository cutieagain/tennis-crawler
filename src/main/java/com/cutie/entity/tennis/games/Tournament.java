/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis.games;

/**
 * Auto-generated: 2018-05-07 17:47:19
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Tournament {

    private String name;
    private String slug;
    private int id;//需要获取这个
    private int uniqueId;
    private String uniqueName;
    private boolean hasEventPlayerStatistics;
    private boolean hasEventPlayerHeatMap;
    private boolean hasBoxScore;
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

    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setUniqueId(int uniqueId) {
         this.uniqueId = uniqueId;
     }
     public int getUniqueId() {
         return uniqueId;
     }

    public void setUniqueName(String uniqueName) {
         this.uniqueName = uniqueName;
     }
     public String getUniqueName() {
         return uniqueName;
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

}