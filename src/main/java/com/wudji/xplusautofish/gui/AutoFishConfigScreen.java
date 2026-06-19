package com.wudji.xplusautofish.gui;

import net.minecraft.client.gui.screens.Screen;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;

public class AutoFishConfigScreen {
    public static Screen create(ModContainer modContainer, Screen parentScreen) {
        return new ConfigurationScreen(modContainer, parentScreen);
    }
}
