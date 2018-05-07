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
public class Event {

    private int firstToServe;//第一个发球的人
    private String awayTeamSeed;//
    private Sport sport;
    private Category category;
    private Tournament tournament;
    private Season season;
    private String customId;
    private Status status;
    private int winnerCode;
    private Venue venue;
    private HomeTeam homeTeam;
    private AwayTeam awayTeam;
    private HomeScore homeScore;
    private AwayScore awayScore;
    private Time time;
    private Changes changes;
    private boolean hasLineups;
    private boolean hasHighlights;
    private boolean hasHighlightsStream;
    private long id;
    private boolean hasStatistics;
    private boolean hasSubScore;
    private boolean hasFirstToServe;
    private boolean hasDraw;
    private boolean isCouplesMatch;
    private boolean hasTime;
    private Periods periods;
    private String name;
    private String startTime;
    private String formatedStartDate;
    private long startTimestamp;
    private String statusDescription;
    private String slug;
    private boolean hasLineupsList;
    private boolean hasVenue;
    private boolean hasOdds;
    private boolean hasLiveOdds;
    private boolean hasAggregatedScore;
    private boolean votingEnabled;
    private boolean isSyncable;
    private int cupMatchOrder;
    private int cupMatchesInRound;
    private boolean showEventNote;
    private boolean hasHalfTimeScore;
    private boolean confirmedLineups;
    public void setFirstToServe(int firstToServe) {
         this.firstToServe = firstToServe;
     }
     public int getFirstToServe() {
         return firstToServe;
     }

    public void setAwayTeamSeed(String awayTeamSeed) {
         this.awayTeamSeed = awayTeamSeed;
     }
     public String getAwayTeamSeed() {
         return awayTeamSeed;
     }

    public void setSport(Sport sport) {
         this.sport = sport;
     }
     public Sport getSport() {
         return sport;
     }

    public void setCategory(Category category) {
         this.category = category;
     }
     public Category getCategory() {
         return category;
     }

    public void setTournament(Tournament tournament) {
         this.tournament = tournament;
     }
     public Tournament getTournament() {
         return tournament;
     }

    public void setSeason(Season season) {
         this.season = season;
     }
     public Season getSeason() {
         return season;
     }

    public void setCustomId(String customId) {
         this.customId = customId;
     }
     public String getCustomId() {
         return customId;
     }

    public void setStatus(Status status) {
         this.status = status;
     }
     public Status getStatus() {
         return status;
     }

    public void setWinnerCode(int winnerCode) {
         this.winnerCode = winnerCode;
     }
     public int getWinnerCode() {
         return winnerCode;
     }

    public void setVenue(Venue venue) {
         this.venue = venue;
     }
     public Venue getVenue() {
         return venue;
     }

    public void setHomeTeam(HomeTeam homeTeam) {
         this.homeTeam = homeTeam;
     }
     public HomeTeam getHomeTeam() {
         return homeTeam;
     }

    public void setAwayTeam(AwayTeam awayTeam) {
         this.awayTeam = awayTeam;
     }
     public AwayTeam getAwayTeam() {
         return awayTeam;
     }

    public void setHomeScore(HomeScore homeScore) {
         this.homeScore = homeScore;
     }
     public HomeScore getHomeScore() {
         return homeScore;
     }

    public void setAwayScore(AwayScore awayScore) {
         this.awayScore = awayScore;
     }
     public AwayScore getAwayScore() {
         return awayScore;
     }

    public void setTime(Time time) {
         this.time = time;
     }
     public Time getTime() {
         return time;
     }

    public void setChanges(Changes changes) {
         this.changes = changes;
     }
     public Changes getChanges() {
         return changes;
     }

    public void setHasLineups(boolean hasLineups) {
         this.hasLineups = hasLineups;
     }
     public boolean getHasLineups() {
         return hasLineups;
     }

    public void setHasHighlights(boolean hasHighlights) {
         this.hasHighlights = hasHighlights;
     }
     public boolean getHasHighlights() {
         return hasHighlights;
     }

    public void setHasHighlightsStream(boolean hasHighlightsStream) {
         this.hasHighlightsStream = hasHighlightsStream;
     }
     public boolean getHasHighlightsStream() {
         return hasHighlightsStream;
     }

    public void setId(long id) {
         this.id = id;
     }
     public long getId() {
         return id;
     }

    public void setHasStatistics(boolean hasStatistics) {
         this.hasStatistics = hasStatistics;
     }
     public boolean getHasStatistics() {
         return hasStatistics;
     }

    public void setHasSubScore(boolean hasSubScore) {
         this.hasSubScore = hasSubScore;
     }
     public boolean getHasSubScore() {
         return hasSubScore;
     }

    public void setHasFirstToServe(boolean hasFirstToServe) {
         this.hasFirstToServe = hasFirstToServe;
     }
     public boolean getHasFirstToServe() {
         return hasFirstToServe;
     }

    public void setHasDraw(boolean hasDraw) {
         this.hasDraw = hasDraw;
     }
     public boolean getHasDraw() {
         return hasDraw;
     }

    public void setIsCouplesMatch(boolean isCouplesMatch) {
         this.isCouplesMatch = isCouplesMatch;
     }
     public boolean getIsCouplesMatch() {
         return isCouplesMatch;
     }

    public void setHasTime(boolean hasTime) {
         this.hasTime = hasTime;
     }
     public boolean getHasTime() {
         return hasTime;
     }

    public void setPeriods(Periods periods) {
         this.periods = periods;
     }
     public Periods getPeriods() {
         return periods;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setStartTime(String startTime) {
         this.startTime = startTime;
     }
     public String getStartTime() {
         return startTime;
     }

    public boolean isHasLineups() {
        return hasLineups;
    }

    public boolean isHasHighlights() {
        return hasHighlights;
    }

    public boolean isHasHighlightsStream() {
        return hasHighlightsStream;
    }

    public boolean isHasStatistics() {
        return hasStatistics;
    }

    public boolean isHasSubScore() {
        return hasSubScore;
    }

    public boolean isHasFirstToServe() {
        return hasFirstToServe;
    }

    public boolean isHasDraw() {
        return hasDraw;
    }

    public boolean isCouplesMatch() {
        return isCouplesMatch;
    }

    public void setCouplesMatch(boolean couplesMatch) {
        isCouplesMatch = couplesMatch;
    }

    public boolean isHasTime() {
        return hasTime;
    }

    public String getFormatedStartDate() {
        return formatedStartDate;
    }

    public void setFormatedStartDate(String formatedStartDate) {
        this.formatedStartDate = formatedStartDate;
    }

    public boolean isHasLineupsList() {
        return hasLineupsList;
    }

    public boolean isHasVenue() {
        return hasVenue;
    }

    public boolean isHasOdds() {
        return hasOdds;
    }

    public boolean isHasLiveOdds() {
        return hasLiveOdds;
    }

    public boolean isHasAggregatedScore() {
        return hasAggregatedScore;
    }

    public boolean isVotingEnabled() {
        return votingEnabled;
    }

    public boolean isSyncable() {
        return isSyncable;
    }

    public void setSyncable(boolean syncable) {
        isSyncable = syncable;
    }

    public boolean isShowEventNote() {
        return showEventNote;
    }

    public boolean isHasHalfTimeScore() {
        return hasHalfTimeScore;
    }

    public boolean isConfirmedLineups() {
        return confirmedLineups;
    }

    public void setStartTimestamp(long startTimestamp) {
         this.startTimestamp = startTimestamp;
     }
     public long getStartTimestamp() {
         return startTimestamp;
     }

    public void setStatusDescription(String statusDescription) {
         this.statusDescription = statusDescription;
     }
     public String getStatusDescription() {
         return statusDescription;
     }

    public void setSlug(String slug) {
         this.slug = slug;
     }
     public String getSlug() {
         return slug;
     }

    public void setHasLineupsList(boolean hasLineupsList) {
         this.hasLineupsList = hasLineupsList;
     }
     public boolean getHasLineupsList() {
         return hasLineupsList;
     }

    public void setHasVenue(boolean hasVenue) {
         this.hasVenue = hasVenue;
     }
     public boolean getHasVenue() {
         return hasVenue;
     }

    public void setHasOdds(boolean hasOdds) {
         this.hasOdds = hasOdds;
     }
     public boolean getHasOdds() {
         return hasOdds;
     }

    public void setHasLiveOdds(boolean hasLiveOdds) {
         this.hasLiveOdds = hasLiveOdds;
     }
     public boolean getHasLiveOdds() {
         return hasLiveOdds;
     }

    public void setHasAggregatedScore(boolean hasAggregatedScore) {
         this.hasAggregatedScore = hasAggregatedScore;
     }
     public boolean getHasAggregatedScore() {
         return hasAggregatedScore;
     }

    public void setVotingEnabled(boolean votingEnabled) {
         this.votingEnabled = votingEnabled;
     }
     public boolean getVotingEnabled() {
         return votingEnabled;
     }

    public void setIsSyncable(boolean isSyncable) {
         this.isSyncable = isSyncable;
     }
     public boolean getIsSyncable() {
         return isSyncable;
     }

    public void setCupMatchOrder(int cupMatchOrder) {
         this.cupMatchOrder = cupMatchOrder;
     }
     public int getCupMatchOrder() {
         return cupMatchOrder;
     }

    public void setCupMatchesInRound(int cupMatchesInRound) {
         this.cupMatchesInRound = cupMatchesInRound;
     }
     public int getCupMatchesInRound() {
         return cupMatchesInRound;
     }

    public void setShowEventNote(boolean showEventNote) {
         this.showEventNote = showEventNote;
     }
     public boolean getShowEventNote() {
         return showEventNote;
     }

    public void setHasHalfTimeScore(boolean hasHalfTimeScore) {
         this.hasHalfTimeScore = hasHalfTimeScore;
     }
     public boolean getHasHalfTimeScore() {
         return hasHalfTimeScore;
     }

    public void setConfirmedLineups(boolean confirmedLineups) {
         this.confirmedLineups = confirmedLineups;
     }
     public boolean getConfirmedLineups() {
         return confirmedLineups;
     }

}