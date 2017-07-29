package com.design.pattern.adaptor;

import java.util.ArrayList;
import java.util.List;

public class CustomEncoder implements Encoder {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.pattern.adaptor.Encoder#encode(java.lang.String)
	 */
	@Override
	public String encode(String encode) {
		OldEncoder encoder = new OldEncoder();
		List<String> encodedList = new ArrayList<String>();
		encodedList.add(encode);
		encodedList = encoder.encode(encodedList);
		return encodedList.get(0);
	}

}
