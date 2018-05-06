/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis;
import java.util.List;

/**
 * Auto-generated: 2018-05-06 21:33:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class PointByPoint {

    private int set;
    private List<Games> games;
    private Score score;
    public void setSet(int set) {
         this.set = set;
     }
     public int getSet() {
         return set;
     }

    public void setGames(List<Games> games) {
         this.games = games;
     }
     public List<Games> getGames() {
         return games;
     }

    public void setScore(Score score) {
         this.score = score;
     }
     public Score getScore() {
         return score;
     }

}