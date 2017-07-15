package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Ticker;
import com.example.demo.service.TickerService;
import com.example.demo.serviceImpl.TickerServiceImpl;

@Controller
public class TickerController {

	
	TickerService tickerService = new TickerServiceImpl();
	Ticker ticker;
	@RequestMapping("/")
	public String greeting(Model model) {
		ticker = new Ticker();
		tickerService.save(ticker);
		model.addAttribute("ticker", ticker.getValue());
		return "index";
	}

}
