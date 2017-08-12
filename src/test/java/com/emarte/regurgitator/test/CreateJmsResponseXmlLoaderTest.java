package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.mq.CreateJmsResponseXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class CreateJmsResponseXmlLoaderTest extends XmlLoaderTest {
	public CreateJmsResponseXmlLoaderTest() {
		super(new CreateJmsResponseXmlLoader());
	}

	@Test
	public void testThis() throws Exception {
		assertExpectation("classpath:/CreateJmsResponse.xml", "com.emarte.regurgitator.extensions.mq.CreateJmsResponse:[com.emarte.regurgitator.core.CreateResponse:['create-jms-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],null],'message-id','type','destination','correlation-id','4','expiration','priority','true','reply-to','123456789']");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/CreateJmsResponse.xml");
	}
}
