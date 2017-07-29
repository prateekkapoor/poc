package com.design.pattern.adaptor;

import java.util.ArrayList;
import java.util.List;

public class OldEncoder {
	public List<String> encode(List<String> encoders) {
		List<String> encodedStrings = new ArrayList<String>();
		for (String encode : encoders) {
			System.out.println("coding String");
			System.out.println(encode);
			System.out.println("string encoding finished");
			encodedStrings.add("####" + encode);
		}
		return encodedStrings;
	}
}
