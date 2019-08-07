package com.biz.naver.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.propertyeditors.URLEditor;
import org.springframework.stereotype.Service;

import com.biz.naver.config.NaverSecret;

@Service
public class NaverService {
	
	private final String naver_book_url="https://openapi.naver.com/v1/search/book.json";
	
	public String getSearchJson() {
		
		try {
			String searckText =URLEncoder.encode("자바", "UTF-8");
			String apiURL= naver_book_url;
			apiURL +="?query="+searckText;
			
			//naver에 보낼 request생성
			
				URL url =new URL(apiURL);
		HttpURLConnection httpConn =(HttpURLConnection)url.openConnection();
		httpConn.setRequestMethod("GET");
		httpConn.setRequestProperty("X-Naver-Client-Id",NaverSecret.NaverClientId);
		httpConn.setRequestProperty("X-Naver-Client-Secret",NaverSecret.NaverClientSecret);
		
		httpConn.getResponseCode();
		
			
			//request 
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
