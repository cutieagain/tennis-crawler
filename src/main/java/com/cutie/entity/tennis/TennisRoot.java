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
public class TennisRoot {

    private Event event;
    private String teamsForm;
    private WinningOdds winningOdds;
    private List<String> incidents;
    private List<String> groupedIncidents;
    private String innings;
    private Vote vote;
    private List<Odds> odds;
    private List<String> highlights;
    private Statistics statistics;
    private String liveForm;
    private String scoreGraph;
    private boolean standingsAvailable;
    /*每局比分*/
    private List<PointByPoint> pointByPoint;
    private String managerDuel;
    private H2hDuel h2hDuel;


    private MatchInfo matchInfo;
    public void setMatchInfo(MatchInfo matchInfo) {
        this.matchInfo = matchInfo;
    }
    public MatchInfo getMatchInfo() {
        return matchInfo;
    }


    public void setEvent(Event event) {
         this.event = event;
     }
     public Event getEvent() {
         return event;
     }

    public void setTeamsForm(String teamsForm) {
         this.teamsForm = teamsForm;
     }
     public String getTeamsForm() {
         return teamsForm;
     }

    public void setWinningOdds(WinningOdds winningOdds) {
         this.winningOdds = winningOdds;
     }
     public WinningOdds getWinningOdds() {
         return winningOdds;
     }

    public void setIncidents(List<String> incidents) {
         this.incidents = incidents;
     }
     public List<String> getIncidents() {
         return incidents;
     }

    public void setGroupedIncidents(List<String> groupedIncidents) {
         this.groupedIncidents = groupedIncidents;
     }
     public List<String> getGroupedIncidents() {
         return groupedIncidents;
     }

    public void setInnings(String innings) {
         this.innings = innings;
     }
     public String getInnings() {
         return innings;
     }

    public void setVote(Vote vote) {
         this.vote = vote;
     }
     public Vote getVote() {
         return vote;
     }

    public void setOdds(List<Odds> odds) {
         this.odds = odds;
     }
     public List<Odds> getOdds() {
         return odds;
     }

    public void setHighlights(List<String> highlights) {
         this.highlights = highlights;
     }
     public List<String> getHighlights() {
         return highlights;
     }

    public void setStatistics(Statistics statistics) {
         this.statistics = statistics;
     }
     public Statistics getStatistics() {
         return statistics;
     }

    public void setLiveForm(String liveForm) {
         this.liveForm = liveForm;
     }
     public String getLiveForm() {
         return liveForm;
     }

    public void setScoreGraph(String scoreGraph) {
         this.scoreGraph = scoreGraph;
     }
     public String getScoreGraph() {
         return scoreGraph;
     }

    public void setStandingsAvailable(boolean standingsAvailable) {
         this.standingsAvailable = standingsAvailable;
     }
     public boolean getStandingsAvailable() {
         return standingsAvailable;
     }

    public void setPointByPoint(List<PointByPoint> pointByPoint) {
         this.pointByPoint = pointByPoint;
     }
     public List<PointByPoint> getPointByPoint() {
         return pointByPoint;
     }

    public void setManagerDuel(String managerDuel) {
         this.managerDuel = managerDuel;
     }
     public String getManagerDuel() {
         return managerDuel;
     }

    public void setH2hDuel(H2hDuel h2hDuel) {
         this.h2hDuel = h2hDuel;
     }
     public H2hDuel getH2hDuel() {
         return h2hDuel;
     }

}