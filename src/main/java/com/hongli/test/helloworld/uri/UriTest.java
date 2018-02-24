package com.hongli.test.helloworld.uri;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

public class UriTest {
	public void testUri(String host) throws URISyntaxException {
		URI uri =new URIBuilder().setScheme("http").setHost("www.baidu.com").build();
		HttpGet get = new HttpGet(uri);
		System.out.println();
	}
}
