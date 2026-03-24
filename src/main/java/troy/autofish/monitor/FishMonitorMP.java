package troy.autofish.monitor;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.network.protocol.Packet;
import troy.autofish.Autofish;

public interface FishMonitorMP {

    void hookTick(Autofish autofish, Minecraft minecraft, FishingHook hook);

    void handleHookRemoved();

    void handlePacket(Autofish autofish, Packet<?> packet, Minecraft minecraft);

}
