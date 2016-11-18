package com.jeya.product;

import javax.xml.ws.Endpoint;

public class TestSOAPWebServicesPublisher {
	public static void main(String[] args) {
		// limitation: single threaded; glass fish : multiple request served once
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalogImpl());
	}
}