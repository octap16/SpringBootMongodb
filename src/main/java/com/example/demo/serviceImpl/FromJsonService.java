package com.example.demo.serviceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class FromJsonService {
	public String getTicker() throws JSONException, MalformedURLException, IOException {

		JSONObject jsonObject = new JSONObject(getUrl());
		JSONObject myResponse = jsonObject.getJSONObject("BTC_ETH");
		String tsmresponse = myResponse.getString("last");
		System.out.println(tsmresponse);
		return tsmresponse;
	}

	public String getUrl() throws MalformedURLException, IOException {
		final InputStream is = new URL("https://poloniex.com/public?command=returnTicker").openStream();
		return getStringFromInputStream(is);
	}

	private String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}
}
