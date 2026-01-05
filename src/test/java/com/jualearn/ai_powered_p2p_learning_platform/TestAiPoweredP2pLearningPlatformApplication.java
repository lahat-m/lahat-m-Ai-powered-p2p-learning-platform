package com.jualearn.ai_powered_p2p_learning_platform;

import org.springframework.boot.SpringApplication;

public class TestAiPoweredP2pLearningPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.from(AiPoweredP2pLearningPlatformApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
