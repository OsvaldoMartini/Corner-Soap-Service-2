package com.shifthunter.soap_service_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ch.corner.service.conveniencecard.common.BasicRequest;
import ch.corner.service.conveniencecard.configuration.conveniencecardconfiguration.GetNapAndCityListResponse;


@Endpoint
public class OfficialNapAndCityEndPoint {
	private static final String NAMESPACE_URI = "http://configuration.conveniencecard.service.corner.ch/convenienceCardConfiguration";

	private OfficialNapAndCityRepository officialNapAndCityRepository;

	@Autowired
	public OfficialNapAndCityEndPoint(OfficialNapAndCityRepository officialNapAndCityRepository) {
		this.officialNapAndCityRepository = officialNapAndCityRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getNapAndCityList")
	@ResponsePayload
	public GetNapAndCityListResponse getNapAndCity(@RequestPayload BasicRequest request) {
		GetNapAndCityListResponse response = new GetNapAndCityListResponse();
		response.setListNapAndCity(officialNapAndCityRepository.findAllNapAndCity());

		return response;
	}
	
	
//	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetNapAndCityListRequest")
//	@ResponsePayload
//	public GetNapAndCityListResponse getNapAndCityList(@RequestPayload GetNapAndCityListRequest request) {
//		GetNapAndCityListResponse response = new GetNapAndCityListResponse();
//		
//		response.setListNapAndCity(napAndCityRepository.findAllNapAndCity());
//		
//		return response;
//	}
	
}