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
public class Groups {

    private String groupName;
    private List<StatisticsItems> statisticsItems;
    public void setGroupName(String groupName) {
         this.groupName = groupName;
     }
     public String getGroupName() {
         return groupName;
     }

    public void setStatisticsItems(List<StatisticsItems> statisticsItems) {
         this.statisticsItems = statisticsItems;
     }
     public List<StatisticsItems> getStatisticsItems() {
         return statisticsItems;
     }

}