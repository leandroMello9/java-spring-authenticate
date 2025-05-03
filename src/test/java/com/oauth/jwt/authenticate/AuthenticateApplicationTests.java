package com.oauth.jwt.authenticate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(classes = AuthenticateApplication.class)
class AuthenticateApplicationTests {

	@Test
	void contextLoads() {
		String teste= "teste";
		Assertions.assertThat(teste).isEqualTo("teste");
	}

}
