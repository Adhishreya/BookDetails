package com.utility.managers;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class StatusAttributeConverter implements AttributeConverter<String, Integer> {

	@Override
	public Integer convertToDatabaseColumn(String arg0) {
		if (arg0 == null) {
			return null;
		}
		switch (arg0) {
		case "COD":
			return 0;
		case "PAID":
			return 1;
		case "FAIL":
			return 2;

		default:
			throw new IllegalArgumentException("Unexpected value: " + arg0);
		}
	}

	@Override
	public String convertToEntityAttribute(Integer arg0) {
		if (arg0 == null)
			return null;
		switch (arg0) {
		case 0:
			return "COD";
		case 1:
			return "PAID";
		case 2:
			return "FAIL";
		default:
			throw new IllegalArgumentException("Unexpected value: " + arg0);
		}
	}

}
