package troy.autofish;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;

public class GuiChecker {
    private FabricModAutofish modAutofish;

    public GuiChecker(FabricModAutofish modAutofish) {
        this.modAutofish = modAutofish;
    }

    public void toggleAutoFish(MinecraftClient client) {
        if(modAutofish.getConfig().isDisableInGUI())
            this.modAutofish.getConfig().setAutofishEnabled(!(client.currentScreen instanceof GenericContainerScreen));
    }
}
