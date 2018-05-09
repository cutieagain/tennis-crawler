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
public class Games {

    private int game;//第几小局
    private List<Points> points;//比分列表
    private Score score;//当前局比分
    public void setGame(int game) {
         this.game = game;
     }
     public int getGame() {
         return game;
     }

    public void setPoints(List<Points> points) {
         this.points = points;
     }
     public List<Points> getPoints() {
         return points;
     }

    public void setScore(Score score) {
         this.score = score;
     }
     public Score getScore() {
         return score;
     }

}