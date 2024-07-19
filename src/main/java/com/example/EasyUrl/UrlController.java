package com.example.EasyUrl;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/shortenUrl")
	public Url url(@RequestParam() String urlString) {
        
		return new Url(urlString.toString());
	}
}
