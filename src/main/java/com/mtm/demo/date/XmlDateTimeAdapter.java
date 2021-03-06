package com.mtm.demo.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XmlDateTimeAdapter extends XmlAdapter<String, Date> {
	
	private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	private final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);

	public XmlDateTimeAdapter() {
		dateFormat.setLenient(false);
	}

	@Override
	public Date unmarshal(String xml) throws Exception {
		return dateFormat.parse(xml);
	}

	@Override
	public String marshal(Date object) throws Exception {
		return dateFormat.format(object);
	}
}
