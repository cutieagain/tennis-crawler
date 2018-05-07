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
public class FullTimeOdds {

    private Regular regular;
    private int type;
    private String sourceId;
    private Live live;
    public void setRegular(Regular regular) {
         this.regular = regular;
     }
     public Regular getRegular() {
         return regular;
     }

    public void setType(int type) {
         this.type = type;
     }
     public int getType() {
         return type;
     }

    public void setSourceId(String sourceId) {
         this.sourceId = sourceId;
     }
     public String getSourceId() {
         return sourceId;
     }

    public void setLive(Live live) {
         this.live = live;
     }
     public Live getLive() {
         return live;
     }

}