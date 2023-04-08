package me.ultrablacklinux.nohurtcam;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;

public class NoHurtCam implements ModInitializer {
	public static boolean toggledOn = true;
	MinecraftClient client = MinecraftClient.getInstance();
	@Override
	public void onInitialize() {
	}
}