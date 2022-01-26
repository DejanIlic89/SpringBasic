package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBasicApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Value("testing")
	private String environment;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Test
	void performLogin() {
//		mainPage.navigate();
		mainPage.performLogin();
	}

}
