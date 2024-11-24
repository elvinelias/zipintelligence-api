package com.zipintelligence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zipintelligence.model.NewsItem;
import com.zipintelligence.repository.NewsItemRepository;

@RestController
@RequestMapping("api/v1/news")
public class NewsController {
	
	int i = 0 ;
	
	@Autowired
	private NewsItemRepository newsItemRepository ;
	
	@GetMapping("{newsItemId}")
	public NewsItem getNewsItem(@PathVariable int newsItemId) {
		System.out.println("========== GetNewsItem called =========="+ i++);
		return newsItemRepository.findById(newsItemId).get();
	}
	
	@GetMapping("newsItems/{newsItemId}")
	public List<NewsItem> getNewsItems(@PathVariable int newsItemId){
		System.out.println("List of news items called");
		return newsItemRepository.findAll() ;
	}

}
