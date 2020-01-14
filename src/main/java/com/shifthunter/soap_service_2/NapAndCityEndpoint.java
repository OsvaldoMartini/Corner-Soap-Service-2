package com.shifthunter.soap_service_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.shifthunter.conveniencecardconfigurationmock.GetNapAndCityListRequest;
import com.shifthunter.conveniencecardconfigurationmock.GetNapAndCityListResponse;
import com.shifthunter.conveniencecardconfigurationmock.GetNapAndCityRequest;
import com.shifthunter.conveniencecardconfigurationmock.GetNapAndCityResponse;


@Endpoint
public class NapAndCityEndpoint {
	private static final String NAMESPACE_URI = "http://www.shifthunter.com/convenienceCardConfigurationMock";

	private NapAndCityRepository napAndCityRepository;

	@Autowired
	public NapAndCityEndpoint(NapAndCityRepository napAndCityRepository) {
		this.napAndCityRepository = napAndCityRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetNapAndCityRequest")
	@ResponsePayload
	public GetNapAndCityResponse getNapAndCity(@RequestPayload GetNapAndCityRequest request) {
		GetNapAndCityResponse response = new GetNapAndCityResponse();
		response.setTNapAndCity(napAndCityRepository.findNapAndCity(request.getCity()));

		return response;
	}
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetNapAndCityListRequest")
	@ResponsePayload
	public GetNapAndCityListResponse getNapAndCityList(@RequestPayload GetNapAndCityListRequest request) {
		GetNapAndCityListResponse response = new GetNapAndCityListResponse();
		
		response.setListNapAndCity(napAndCityRepository.findAllNapAndCity());
		
		return response;
	}
	
}