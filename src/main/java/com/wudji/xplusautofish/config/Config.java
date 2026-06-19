package com.wudji.xplusautofish.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    // --- General ---
    public static ModConfigSpec.BooleanValue autofishEnabled;
    public static ModConfigSpec.BooleanValue multiRod;
    public static ModConfigSpec.BooleanValue openWaterDetectEnabled;
    public static ModConfigSpec.BooleanValue noBreak;
    public static ModConfigSpec.BooleanValue persistentMode;
    public static ModConfigSpec.BooleanValue autoTurnView;
    public static ModConfigSpec.DoubleValue turnAngle;
    public static ModConfigSpec.IntValue turnDuration;

    // --- Advanced ---
    public static ModConfigSpec.BooleanValue useSoundDetection;
    public static ModConfigSpec.BooleanValue forceMPDetection;
    public static ModConfigSpec.LongValue recastDelay;
    public static ModConfigSpec.LongValue randomPercent;
    public static ModConfigSpec.LongValue reelInDelay;
    public static ModConfigSpec.ConfigValue<String> clearLagRegex;

    public static final ModConfigSpec SPEC;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.push("general");
        autofishEnabled = builder
                .comment("Toggles the entire mod on or off.")
                .define("autofishEnabled", true);
        multiRod = builder
                .comment("Cycles through all available rods in the hotbar, moving to the next as they break.")
                .define("multiRod", false);
        openWaterDetectEnabled = builder
                .comment("Detect whether you are fishing in open water (required for treasure loot in 1.16+).")
                .define("openWaterDetectEnabled", true);
        noBreak = builder
                .comment("Stop using rods with low durability before they break.")
                .define("noBreak", false);
        persistentMode = builder
                .comment("Always keep the fish hook cast whenever a rod is in hand. Checks every 10 seconds and recasts if needed.")
                .define("persistentMode", false);
        autoTurnView = builder
                .comment("Automatically turn the camera view when a fish is caught.")
                .define("autoTurnView", false);
        turnAngle = builder
                .comment("The angle in degrees to turn the camera when a fish is caught.")
                .defineInRange("turnAngle", 30.0, -180.0, 180.0);
        turnDuration = builder
                .comment("How long to hold the turned view before restoring to original position (ms).")
                .defineInRange("turnDuration", 500, 100, 5000);
        builder.pop();

        builder.push("advanced");
        useSoundDetection = builder
                .comment("Use sound-based detection instead of motion-based detection. More accurate but requires proximity to the hook.")
                .define("useSoundDetection", false);
        forceMPDetection = builder
                .comment("Force multiplayer detection even in singleplayer. Provides compatibility with third-party mods.")
                .define("forceMPDetection", false);
        recastDelay = builder
                .comment("Delay between catching a fish and recasting the rod (ms).")
                .defineInRange("recastDelay", 1500L, 500L, 5000L);
        randomPercent = builder
                .comment("Add +/-% randomness to the Recast Delay. Set to 0 to disable.")
                .defineInRange("randomPercent", 50L, 0L, 75L);
        reelInDelay = builder
                .comment("Delay before reeling in when a fish bites (ms). Set to 1 to disable this function.")
                .defineInRange("reelInDelay", 1L, 1L, 2000L);
        clearLagRegex = builder
                .comment("Regular expression pattern. Recast the rod when this pattern is matched in chat.")
                .define("clearLagRegex", "\\[ClearLag\\] Removed [0-9]+ Entities!");
        builder.pop();

        SPEC = builder.build();
    }

    public boolean isAutofishEnabled() { return autofishEnabled.get(); }
    public boolean isMultiRod() { return multiRod.get(); }
    public boolean isOpenWaterDetectEnabled() { return openWaterDetectEnabled.get(); }
    public boolean isNoBreak() { return noBreak.get(); }
    public boolean isPersistentMode() { return persistentMode.get(); }
    public boolean isUseSoundDetection() { return useSoundDetection.get(); }
    public boolean isForceMPDetection() { return forceMPDetection.get(); }
    public boolean isAutoTurnView() { return autoTurnView.get(); }
    public double getTurnAngle() { return turnAngle.get(); }
    public int getTurnDuration() { return turnDuration.get(); }
    public long getRecastDelay() { return recastDelay.get(); }
    public long getRandomDelay() { return randomPercent.get(); }
    public long getRandomPercent() { return randomPercent.get(); }
    public long getReelInDelay() { return reelInDelay.get(); }
    public String getClearLagRegex() { return clearLagRegex.get(); }

    public void setAutofishEnabled(boolean v) { autofishEnabled.set(v); }
    public void setMultiRod(boolean v) { multiRod.set(v); }
    public void setNoBreak(boolean v) { noBreak.set(v); }
    public void setPersistentMode(boolean v) { persistentMode.set(v); }
    public void setUseSoundDetection(boolean v) { useSoundDetection.set(v); }
    public void setForceMPDetection(boolean v) { forceMPDetection.set(v); }
    public void setAutoTurnView(boolean v) { autoTurnView.set(v); }
    public void setTurnAngle(double v) { turnAngle.set(v); }
    public void setTurnDuration(int v) { turnDuration.set(v); }
    public void setRecastDelay(long v) { recastDelay.set(v); }
    public void setRandomDelay(long v) { randomPercent.set(v); }
    public void setReelInDelay(long v) { reelInDelay.set(v); }
    public void setClearLagRegex(String v) { clearLagRegex.set(v); }
    public void setOpenWaterDetectEnabled(boolean v) { openWaterDetectEnabled.set(v); }

    /**
     * Constraints are now enforced via defineInRange in the builder.
     * Kept as a no-op for backward compatibility.
     * @return always false (no changes to flush)
     */
    public boolean enforceConstraints() {
        return false;
    }
}
