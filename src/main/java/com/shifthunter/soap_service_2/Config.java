package com.shifthunter.soap_service_2;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.validation.XmlValidator;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/service/*");
	}

	@Bean(name = "convenienceCardConfiguration")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schemaCollection) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("ConvenienceCardConfigurationPort");
		wsdl11Definition.setLocationUri("/service/ConvenienceCardConfiguration");
		wsdl11Definition.setTargetNamespace(
				"http://configuration.conveniencecard.service.corner.ch/convenienceCardConfiguration");
		// wsdl11Definition.setSchema(schema);
		wsdl11Definition.setSchemaCollection(schemaCollection());
		return wsdl11Definition;
	}

	@Bean(name="OfficialCardConfiguration")
	public XsdSchema defaultSchema() {
		return new SimpleXsdSchema(new ClassPathResource("ConvenienceCardCommons.xsd"));
	}

	
	/*
	 * 
	 * Also, the order of the XSDs registered matter here. If you declare the parent
	 * XSD (orders.xsd) as ClassPathResource before the nested XSD (po.xsd), you
	 * will receive some error about "namespace duplicated"
	 * 
	 */
	@Bean
	public XsdSchemaCollection schemaCollection() {
		CommonsXsdSchemaCollection commonsXsdSchemaCollection = new CommonsXsdSchemaCollection(
				new ClassPathResource("ConvenienceCardCommons.xsd"),
				new ClassPathResource("OfficialCardConfiguration.xsd"),
				new ClassPathResource("ConvenienceCardConfigurationMock.xsd"));
		commonsXsdSchemaCollection.setInline(true);
		return commonsXsdSchemaCollection;

//		 return new XsdSchemaCollection() {
//
//			public XsdSchema[] getXsdSchemas() {
//				return new XsdSchema[] { new SimpleXsdSchema(new ClassPathResource("xsd/ConvenienceCardCommons.xsd")),
//						new SimpleXsdSchema(new ClassPathResource("xsd/OfficialCardConfiguration.xsd")) };
//			}
//
//			public XmlValidator createValidator() {
//				throw new UnsupportedOperationException();
//			}
//		};
	}

}