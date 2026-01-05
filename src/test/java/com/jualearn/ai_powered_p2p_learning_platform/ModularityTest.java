package com.jualearn.ai_powered_p2p_learning_platform;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.test.ApplicationModuleTest;

public class ModularityTest {

    ApplicationModules modules = ApplicationModules.of(AiPoweredP2pLearningPlatformApplication.class);

    @Test
    void verifyModularity(){
        modules.verify();
    }
}
