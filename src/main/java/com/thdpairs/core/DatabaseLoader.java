//package com.thdpairs.core;
//
//import com.thdpairs.pair.Pair;
//import com.thdpairs.pair.PairRepository;
//import com.thdpairs.pairGroup.PairGroup;
//import com.thdpairs.pairGroup.PairGroupRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//
//
//@Component
//public class DatabaseLoader implements ApplicationRunner {
//    private final PairGroupRepository pairGroups;
//
//    @Autowired
//    public DatabaseLoader(PairGroupRepository pairGroups) {
//        this.pairGroups = pairGroups;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
////        PairGroup pairGroup = new PairGroup();
////        pairGroup.addPair(new Pair("Benjamin", "Casey", true));
////        pairGroups.save(pairGroup);
//    }
//}
