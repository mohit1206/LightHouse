package com.sapient.it.Lighthouse;

import java.io.IOException;

import org.testng.annotations.Test;

public class LightHouse {

	@Test
	public void lightHouseAccessibilityTest() throws IOException {
		String url = "http://qa-jeep.sapient.com/";
		String batData = "lighthouse " + url + " --output csv --output html --output-path ./Reports/test.csv ./Reports/test.html";
		Runtime.getRuntime().exec(
				"cmd /c start " + batData , null);
	}

}
