package com.nylanomel.frontiers.mixin;

import com.nylanomel.frontiers.Frontiers;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@org.spongepowered.asm.mixin.Mixin(TitleScreen.class)
public class FMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		System.out.println(Frontiers.MOD_ID + " has successfully loaded!");
	}
}
