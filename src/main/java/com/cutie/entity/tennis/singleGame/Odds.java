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
public class Odds {

    private List<Regular> regular;
    private int type;
    private String sourceId;
    private String name;
    public void setRegular(List<Regular> regular) {
         this.regular = regular;
     }
     public List<Regular> getRegular() {
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

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

}