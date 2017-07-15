package com.example.demo.DAO;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ticker;


@Repository
public interface TickerRepository extends MongoRepository<Ticker, String>{
}
