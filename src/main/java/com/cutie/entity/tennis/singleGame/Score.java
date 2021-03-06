/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis.singleGame;

/**
 * Auto-generated: 2018-05-06 21:33:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Score {

    private int homeScore;
    private int awayScore;
    private int serving;
    private int scoring;
    public void setHomeScore(int homeScore) {
         this.homeScore = homeScore;
     }
     public int getHomeScore() {
         return homeScore;
     }

    public void setAwayScore(int awayScore) {
         this.awayScore = awayScore;
     }
     public int getAwayScore() {
         return awayScore;
     }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public int getScoring() {
        return scoring;
    }

    public void setScoring(int scoring) {
        this.scoring = scoring;
    }
}