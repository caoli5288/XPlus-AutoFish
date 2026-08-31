package troy.autofish.monitor;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.SubtitleS2CPacket;
import net.minecraft.network.packet.s2c.play.TitleS2CPacket;
import net.minecraft.text.Text;
import troy.autofish.Autofish;

/**
 * Multiplayer catch detector based on title and subtitle packets.
 */
public class FishMonitorMPCatch implements FishMonitorMP {

    @Override
    public void hookTick(Autofish autofish, MinecraftClient minecraft, FishingBobberEntity hook) {
    }

    @Override
    public void handleHookRemoved() {
    }

    @Override
    public void handlePacket(Autofish autofish, Packet<?> packet, MinecraftClient minecraft) {
        if (packet instanceof TitleS2CPacket titlePacket) {
            onTitle(autofish, minecraft, titlePacket.text());

        } else if (packet instanceof SubtitleS2CPacket subtitlePacket) {
            onTitle(autofish, minecraft, subtitlePacket.text());
        }
    }

    private static void onTitle(Autofish autofish, MinecraftClient minecraft, Text text) {
        String catchText = autofish.getConfig().getTitleCatch();
        if (catchText != null
                && !catchText.isEmpty()
                && minecraft.player != null
                && minecraft.player.fishHook != null
                && text.getString().contains(catchText)) {
            autofish.catchFish();
        }
    }
}
