package com.thdpairs.pair;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

public interface PairRepository extends CrudRepository<Pair, Long> {
}
