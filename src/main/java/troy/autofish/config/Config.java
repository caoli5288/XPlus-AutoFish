package troy.autofish.config;

import com.google.gson.annotations.Expose;

public class Config {

    @Expose boolean isAutofishEnabled = true;
    @Expose boolean multiRod = false;
    @Expose boolean isOpenWaterDetectEnabled = true;
    @Expose boolean noBreak = false;
    @Expose boolean persistentMode = false;
    @Expose boolean disableInGUI = false;
    @Expose boolean useSoundDetection = false;
    @Expose boolean forceMPDetection = false;
    @Expose boolean autoTurnView = false;
    @Expose boolean enableArmSwing = true;
    @Expose float turnAngle = 30.0f;
    @Expose int turnDuration = 500;
    @Expose long recastDelay = 1500;
    @Expose long randomPercent = 50;
    @Expose long reelInDelay = 1;
    @Expose String clearLagRegex = "\\[ClearLag\\] Removed [0-9]+ Entities!";
    @Expose String chatDepleted = "Depleted";
    @Expose String chatCaught = "You caught";
    @Expose String titleCatch = "Catch";

    public boolean isAutofishEnabled() {
        return isAutofishEnabled;
    }

    public boolean isOpenWaterDetectEnabled() {
        return isOpenWaterDetectEnabled;
    }

    public boolean isMultiRod() {
        return multiRod;
    }

    public boolean isNoBreak() {
        return noBreak;
    }

    public boolean isPersistentMode() { return persistentMode; }

    public boolean isUseSoundDetection() {
        return useSoundDetection;
    }

    public boolean isForceMPDetection() { return forceMPDetection; }

    public boolean isAutoTurnView() {
        return autoTurnView;
    }

    public boolean isEnableArmSwing() {
        return enableArmSwing;
    }

    public void setAutoTurnView(boolean autoTurnView) {
        this.autoTurnView = autoTurnView;
    }

    public void setEnableArmSwing(boolean enableArmSwing) {
        this.enableArmSwing = enableArmSwing;
    }

    public float getTurnAngle() {
        return turnAngle;
    }

    public void setTurnAngle(float turnAngle) {
        this.turnAngle = turnAngle;
    }

    public int getTurnDuration() {
        return turnDuration;
    }

    public void setTurnDuration(int turnDuration) {
        this.turnDuration = turnDuration;
    }

    public long getRecastDelay() {
        return recastDelay;
    }

    public long getRandomDelay(){
        return randomPercent;
    }

    public String getClearLagRegex() {
        return clearLagRegex;
    }

    public void setAutofishEnabled(boolean autofishEnabled) { isAutofishEnabled = autofishEnabled; }

    public void setMultiRod(boolean multiRod) {
        this.multiRod = multiRod;
    }

    public void setNoBreak(boolean noBreak) {
        this.noBreak = noBreak;
    }

    public void setPersistentMode(boolean persistentMode) { this.persistentMode = persistentMode; }

    public void setUseSoundDetection(boolean useSoundDetection) {
        this.useSoundDetection = useSoundDetection;
    }

    public void setForceMPDetection(boolean forceMPDetection) { this.forceMPDetection = forceMPDetection; }

    public void setRecastDelay(long recastDelay) {
        this.recastDelay = recastDelay;
    }
    public void setRandomDelay(long randomPercent){
        this.randomPercent = randomPercent;
    }

    public void setClearLagRegex(String clearLagRegex) {
        this.clearLagRegex = clearLagRegex;
    }

    public void setOpenWaterDetectEnabled(boolean openWaterDetectEnabled) {
        isOpenWaterDetectEnabled = openWaterDetectEnabled;
    }

    public long getRandomPercent() {
        return randomPercent;
    }

    public void setRandomPercent(long randomPercent) {
        this.randomPercent = randomPercent;
    }

    public long getReelInDelay() {
        return reelInDelay;
    }

    public void setReelInDelay(long reelInDelay) {
        this.reelInDelay = reelInDelay;
    }

    public boolean isDisableInGUI() {
        return disableInGUI;
    }

    public void setDisableInGUI(boolean disableInGUI) {
        this.disableInGUI = disableInGUI;
    }

    public String getChatDepleted() {
        return chatDepleted;
    }

    public String getChatCaught() {
        return chatCaught;
    }

    public boolean isEnableChatDepleted() {
        return chatDepleted != null && !chatDepleted.isEmpty();
    }

    public boolean isEnableChatCaught() {
        return chatCaught != null && !chatCaught.isEmpty();
    }

    public void setChatDepleted(String chatDepleted) {
        this.chatDepleted = chatDepleted;
    }

    public void setChatCaught(String chatCaught) {
        this.chatCaught = chatCaught;
    }

    public String getTitleCatch() {
        return titleCatch;
    }

    public boolean isEnableTitleCatch() {
        return titleCatch != null && !titleCatch.isEmpty();
    }

    public void setTitleCatch(String titleCatch) {
        this.titleCatch = titleCatch;
    }

    /**
     * @return true if anything was changed
     */
    public boolean enforceConstraints() {
        boolean changed = false;
        if (recastDelay < 500) {
            recastDelay = 500;
            changed = true;
        }
        if (clearLagRegex == null) {
            clearLagRegex = "";
            changed = true;
        }
        return changed;
    }
}
