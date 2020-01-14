package com.shifthunter.soap_service_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.shifthunter.conveniencecardconfigurationmock.GetNapAndCityListRequest;

import ch.corner.service.conveniencecard.common.conveniencecardconfiguration.BasicRequest;
import ch.corner.service.conveniencecard.common.conveniencecardconfiguration.BasicResponse;
import ch.corner.service.conveniencecard.common.conveniencecardconfiguration.ObjectFactory;
import ch.corner.service.conveniencecard.configuration.conveniencecardconfiguration.GetNapAndCityListResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementRef.DEFAULT;

@Endpoint
public class OfficialNapAndCityEndPoint {
	private static final String NAMESPACE_URI = "http://configuration.conveniencecard.service.corner.ch/convenienceCardConfiguration";

	private OfficialNapAndCityRepository officialNapAndCityRepository;

	@Autowired
	public OfficialNapAndCityEndPoint(OfficialNapAndCityRepository officialNapAndCityRepository) {
		this.officialNapAndCityRepository = officialNapAndCityRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getNapAndCityListRequest")
	@ResponsePayload
	public BasicResponse getNapAndCityListRequest(@RequestPayload String  request) {
		
//		ObjectFactory factory = new ObjectFactory ( );
//		BasicResponse response = new BasicResponse();
//		Request req = request.getValue ( );
//
//		response  = this.service.call( req);

//		response.getCallInfo().setCalledOperation("HALLO");
//		JAXBElement<String> fat = factory.createBasicResponseReason("reason");
//		JAXBElement<BasicResponse> rep = new JAXBElement<GetNapAndCityListResponse>("reason",DEFAULT.class, fat, response );
//			
//		return ;
		
		BasicResponse response = new BasicResponse();
		//response.setListNapAndCity(officialNapAndCityRepository.findAllNapAndCity());

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getNationListRequest")
	@ResponsePayload
	public GetNapAndCityListResponse getNationList(@RequestPayload BasicRequest request) {
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