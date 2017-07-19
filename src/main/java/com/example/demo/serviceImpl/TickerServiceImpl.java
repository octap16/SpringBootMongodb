package com.example.demo.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.DAO.TickerRepository;
import com.example.demo.entity.Ticker;
import com.example.demo.service.TickerService;

@Service
public class TickerServiceImpl implements  TickerService{
	@Autowired
	TickerRepository repository;
	@Override
	public void save(Ticker ticker) {
		repository.save(ticker);
	}
	
}

