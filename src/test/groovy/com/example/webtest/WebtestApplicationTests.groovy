package com.example.webtest

import groovy.util.logging.Slf4j
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.PropertySource
import org.springframework.http.ResponseEntity
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate

@RunWith(SpringRunner)
@SpringBootTest
@Slf4j
class WebtestApplicationTests {

	String randomServerPort = '2202'
	@Test
	void contextLoads() {
	}
	@Test
	void test(){
		println('Hello World')
	}
	@Test
	public void testAddEmployeeWithoutHeader_success() throws URISyntaxException
	{
		RestTemplate restTemplate = new RestTemplate()
		final String baseUrl = "http://localhost:"+randomServerPort+"/"
		URI uri = new URI(baseUrl)
		log.warn '@@@@@@@url:'+uri
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class)
		log.warn ' the result: '+result
		//Verify request succeed
		Assert.assertEquals(200, result.getStatusCodeValue())
	}

}
