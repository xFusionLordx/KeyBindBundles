package com.matyrobbrt.keybindbundles.mixin;

import com.matyrobbrt.keybindbundles.ModKeyBindBundles;
import com.mojang.blaze3d.platform.InputConstants;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(InputConstants.class)
public class InputConstantsMixin {
    @Inject(at = @At("HEAD"), method = "isKeyDown", cancellable = true)
    private static void isCustomKeyDown(long window, int key, CallbackInfoReturnable<Boolean> cir) {
        // Our special key is always pressed as if a key mapping has it assigned it means it's currently selected
        if (key == ModKeyBindBundles.SPECIAL_KEY_CODE) {
            cir.setReturnValue(true);
        }
    }
}
