package com.example.demo.entity;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.serviceImpl.FromJsonService;
@Document(collection="ticker")
public class Ticker {
@Id
private String id ;
private String value ;


public Ticker() {
	FromJsonService service = new FromJsonService();
	try {
		value = service.getTicker();
	} catch (JSONException | IOException e) {
		e.printStackTrace();
	}
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
@Override
public String toString() {
	return "Ticker [id=" + id + ", value=" + value + "]";
}

}
