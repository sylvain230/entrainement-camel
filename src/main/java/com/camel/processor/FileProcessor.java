package com.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String originalFileContent = (String) exchange.getIn().getBody(String.class);
		String uppercaseFileContent = originalFileContent.toUpperCase();
		exchange.getIn().setBody(uppercaseFileContent);
	}

}
