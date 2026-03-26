package troy.autofish.gui;

import net.minecraft.client.gui.screens.Screen;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import troy.autofish.FabricModAutofish;

public final class AutofishScreenBuilder {

    private AutofishScreenBuilder() {
    }

    public static Screen buildScreen(FabricModAutofish modAutofish, Screen parentScreen) {
        return new ConfigurationScreen(FabricModAutofish.MOD_ID, parentScreen);
    }
}
