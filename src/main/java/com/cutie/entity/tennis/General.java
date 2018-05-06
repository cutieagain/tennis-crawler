package com.cutie.entity.tennis;

/**
 * Created by cutie on 2018/5/6.
 */

public class General {

    private String team;
    private int value;
    private String name;
    private boolean continued;
    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam() {
        return team;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setContinued(boolean continued) {
        this.continued = continued;
    }
    public boolean getContinued() {
        return continued;
    }

}
