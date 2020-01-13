package com.shifthunter.soap_service_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import ch.corner.service.conveniencecard.configuration.conveniencecardconfiguration.NapAndCity;
import ch.corner.service.conveniencecard.configuration.conveniencecardconfiguration.TListNapAndCity;


@Component
public class OfficialNapAndCityRepository  {
	private static final Map<String, NapAndCity> napAndCities  = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		NapAndCity napAndCity = new NapAndCity();
		napAndCity.setCanton("ZH");
		napAndCity.setZipSequence("00");
		napAndCity.setZipCode("8093");
		napAndCity.setCity("ZÜRICH");
		napAndCity.setLocationCode("261");
		napAndCities.put(napAndCity.getCity(), napAndCity);
		
		napAndCity = new NapAndCity();
		napAndCity.setCanton("ZH");
		napAndCity.setZipSequence("00");
		napAndCity.setZipCode("8096");
		napAndCity.setCity("ZÜRICH IBRS LOCAL");
		napAndCity.setLocationCode("261");
		napAndCities.put(napAndCity.getCity(), napAndCity);
		
		napAndCity = new NapAndCity();
		napAndCity.setCanton("ZH");
		napAndCity.setZipSequence("00");
		napAndCity.setZipCode("8086");
		napAndCity.setCity("ZÜRICH R DIGEST");
		napAndCity.setLocationCode("261");
		napAndCities.put(napAndCity.getCity(), napAndCity);
		
	}

	public NapAndCity findNapAndCity(String city) {
		Assert.notNull(city, "The City must not be null");
		return napAndCities.get(city);
	}
	
	public TListNapAndCity findAllNapAndCity() {
		
		TListNapAndCity tLisNapAndCity = new TListNapAndCity();
		 for (Map.Entry<String, NapAndCity> entry: napAndCities.entrySet()) {
			 //NapAndCity = Arrays.copyOf(NapAndCity, NapAndCity.length +1);
			 //NapAndCity[NapAndCity.length-1] = entry.getValue(); 
			 //System.arraycopy(NapAndCity, 0, allCoord, xCont, strCoord.length);
			 tLisNapAndCity.getNapAndCity().add(entry.getValue());
		 }
		 
		return tLisNapAndCity;
	}

	
}