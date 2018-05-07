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
public class TennisGames {

    private SportItem sportItem;
    private Params params;
    private boolean isShortDate;
    public void setSportItem(SportItem sportItem) {
         this.sportItem = sportItem;
     }
     public SportItem getSportItem() {
         return sportItem;
     }

    public void setParams(Params params) {
         this.params = params;
     }
     public Params getParams() {
         return params;
     }

    public void setIsShortDate(boolean isShortDate) {
         this.isShortDate = isShortDate;
     }
     public boolean getIsShortDate() {
         return isShortDate;
     }

}