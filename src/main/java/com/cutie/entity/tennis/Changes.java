/**
  * Copyright 2018 bejson.com 
  */
package com.cutie.entity.tennis;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2018-05-06 21:33:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Changes {

    private String changeDate;
    private List<String> changes;
    private long changeTimestamp;
    private boolean hasExpired;
    private boolean hasHomeChanges;
    private boolean hasAwayChanges;

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public boolean isHasExpired() {
        return hasExpired;
    }

    public boolean isHasHomeChanges() {
        return hasHomeChanges;
    }

    public boolean isHasAwayChanges() {
        return hasAwayChanges;
    }

    public void setChanges(List<String> changes) {
         this.changes = changes;
     }
     public List<String> getChanges() {
         return changes;
     }

    public void setChangeTimestamp(long changeTimestamp) {
         this.changeTimestamp = changeTimestamp;
     }
     public long getChangeTimestamp() {
         return changeTimestamp;
     }

    public void setHasExpired(boolean hasExpired) {
         this.hasExpired = hasExpired;
     }
     public boolean getHasExpired() {
         return hasExpired;
     }

    public void setHasHomeChanges(boolean hasHomeChanges) {
         this.hasHomeChanges = hasHomeChanges;
     }
     public boolean getHasHomeChanges() {
         return hasHomeChanges;
     }

    public void setHasAwayChanges(boolean hasAwayChanges) {
         this.hasAwayChanges = hasAwayChanges;
     }
     public boolean getHasAwayChanges() {
         return hasAwayChanges;
     }

}