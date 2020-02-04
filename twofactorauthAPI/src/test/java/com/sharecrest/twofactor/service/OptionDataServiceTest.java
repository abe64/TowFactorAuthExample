package com.sharecrest.twofactor.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sharecrest.twofactor.service.OptionDataService.KeyCode;

@SpringBootTest
public class OptionDataServiceTest {

	@Autowired
	OptionDataService optionDataService;
	
	@Test
	public void Test01() {
		for(KeyCode keyCode : KeyCode.values()) {
			String str = optionDataService.getValue(keyCode);
			assertThat(str).isNotBlank();
		}
	}
	
}
