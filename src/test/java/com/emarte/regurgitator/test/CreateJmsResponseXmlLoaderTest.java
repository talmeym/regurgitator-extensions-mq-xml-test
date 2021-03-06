/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.mq.CreateJmsResponseXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.*;

public class CreateJmsResponseXmlLoaderTest extends XmlLoaderTest {
    public CreateJmsResponseXmlLoaderTest() {
        super(new CreateJmsResponseXmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse.xml", CreateJmsResponse);
    }

    @Test
    public void testProcessor() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse_processor.xml", CreateJmsResponse_processor);
    }

    @Test
    public void testMultipleProcessor() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse_multipleProcessors.xml", CreateJmsResponse_multipleProcessors);
    }

    @Test
    public void testMultipleProcessorFlat() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse_multipleProcessorsFlat.xml", CreateJmsResponse_multipleProcessorsFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/CreateJmsResponse.xml");
    }
}
