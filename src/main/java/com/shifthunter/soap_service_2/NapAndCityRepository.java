package com.shifthunter.soap_service_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.shifthunter.conveniencecardconfigurationmock.TListNapAndCity;
import com.shifthunter.conveniencecardconfigurationmock.TNapAndCity;

@Component
public class NapAndCityRepository  {
	private static final Map<String, TNapAndCity> napAndCities  = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		TNapAndCity napAndCity = new TNapAndCity();
		napAndCity.setZipCode(1000);
		napAndCity.setZipSequence(00);
		napAndCity.setCity("LAUSANNE");
		napAndCity.setCanton("VD");
		napAndCity.setLocationCode(230);
		napAndCities.put(napAndCity.getCity(), napAndCity);
		
		napAndCity = new TNapAndCity();
		napAndCity.setZipCode(1000);
		napAndCity.setZipSequence(02);
		napAndCity.setCity("LAUSANNE 2");
		napAndCity.setCanton("VD");
		napAndCity.setLocationCode(230);
		napAndCities.put(napAndCity.getCity(), napAndCity);
		
		napAndCity = new TNapAndCity();
		napAndCity.setZipCode(9999);
		napAndCity.setZipSequence(99);
		napAndCity.setCity("[string]");
		napAndCity.setCanton("XX");
		napAndCity.setLocationCode(999);
		napAndCities.put(napAndCity.getCity(), napAndCity);
		
		
	}

	public TNapAndCity findNapAndCity(String city) {
		Assert.notNull(city, "The City must not be null");
		return napAndCities.get(city);
	}
	
	public TListNapAndCity findAllNapAndCity() {
		
		TListNapAndCity tListNapAndCity = new TListNapAndCity();
		 for (Map.Entry<String, TNapAndCity> entry: napAndCities.entrySet()) {
			 //tNapAndCity = Arrays.copyOf(tNapAndCity, tNapAndCity.length +1);
			 //tNapAndCity[tNapAndCity.length-1] = entry.getValue(); 
			 //System.arraycopy(tNapAndCity, 0, allCoord, xCont, strCoord.length);
			 tListNapAndCity.getNapAndCity().add(entry.getValue());
		 }
		 
		return tListNapAndCity;
	}

	
}