package com.thdpairs.pair;

import com.thdpairs.core.BaseEntity;
import com.thdpairs.pairGroup.PairGroup;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Pair extends BaseEntity {

    private String anchor;
    private String developer;
    private String thirdDeveloper;
    private String date;
    private boolean isResilience;
    @ManyToOne
    private PairGroup pairGroup;

    protected Pair() {
        super();
    }

    public Pair(String anchor, String developer, String thirdDeveloper, boolean isResilience, String date) {
        this.anchor = anchor;
        this.developer = developer;
        this.thirdDeveloper = thirdDeveloper;
        this.isResilience = isResilience;
        this.date = date;
    }

    public void setPairGroup(PairGroup pairGroup) {
        this.pairGroup = pairGroup;
    }

    public PairGroup getPairGroup() {
        return pairGroup;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getThirdDeveloper() {
        return this.thirdDeveloper;
    }

    public void setThirdDeveloper(String thirdDeveloper) {
        this.thirdDeveloper = thirdDeveloper;
    }

    public boolean getIsResilience() {
        return isResilience;
    }

    public void setResilience(boolean resilience) {
        isResilience = resilience;
    }
}
