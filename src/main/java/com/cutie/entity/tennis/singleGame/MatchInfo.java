package com.cutie.entity.tennis.singleGame;

import java.util.List;

/**
 * Created by cutie on 2018/5/6.
 */
public class MatchInfo {
    private List<Head2head> head2head;
    private List<General> general;
    public void setHead2head(List<Head2head> head2head) {
        this.head2head = head2head;
    }
    public List<Head2head> getHead2head() {
        return head2head;
    }

    public void setGeneral(List<General> general) {
        this.general = general;
    }
    public List<General> getGeneral() {
        return general;
    }
}

