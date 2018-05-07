package com.cutie.entity.tennis.games;

/**
 * Created by cutie on 2018/5/7.
 */
/**
 * Copyright 2018 bejson.com
 */

import java.util.List;

/**
 * Auto-generated: 2018-05-07 18:59:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class SubTeams {

    private String name;
    private String slug;
    private String gender;
    private boolean national;
    private int id;
    private List<String> subTeams;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
    public String getSlug() {
        return slug;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setNational(boolean national) {
        this.national = national;
    }
    public boolean getNational() {
        return national;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setSubTeams(List<String> subTeams) {
        this.subTeams = subTeams;
    }
    public List<String> getSubTeams() {
        return subTeams;
    }

}
