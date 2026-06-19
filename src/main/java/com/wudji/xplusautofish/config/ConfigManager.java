package com.wudji.xplusautofish.config;

import com.wudji.xplusautofish.NeoForgedModXPlusAutofish;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;

public class ConfigManager {
    private final Config config;

    public ConfigManager(NeoForgedModXPlusAutofish modAutofish) {
        this.config = new Config();
    }

    public void register(ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.CLIENT, Config.SPEC);
    }

    public Config getConfig() {
        return config;
    }

}
