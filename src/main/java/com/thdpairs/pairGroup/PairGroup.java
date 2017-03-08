package com.thdpairs.pairGroup;

import com.thdpairs.core.BaseEntity;
import com.thdpairs.pair.Pair;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Created by ben on 1/14/17.
 */
@Entity
public class PairGroup extends BaseEntity{

    private String date;
    @OneToMany(mappedBy = "pairGroup", cascade = CascadeType.ALL)
    private List<Pair> pairs;

    protected PairGroup() {
        super();
        pairs = new ArrayList<>();
        LocalDate currentTime = LocalDate.now();
        this.date = currentTime.toString();
    }

    public List<Pair> getPairs() {
        return pairs;
    }

    public void addPair(Pair pair){
        pair.setPairGroup(this);
        pairs.add(pair);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
