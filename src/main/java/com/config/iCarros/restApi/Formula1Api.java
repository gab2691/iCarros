package com.config.iCarros.restApi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Formula1Api {

	@Autowired 
	RestTemplate restTemplate;
	
	@RequestMapping(value="/template/f1results", method=RequestMethod.GET)
	public String getProductsByTemplate() {
		try {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return restTemplate.exchange("https://ergast.com/api/f1/2017/last/results.json", HttpMethod.GET, entity, String.class).getBody();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return null;
	}
}
