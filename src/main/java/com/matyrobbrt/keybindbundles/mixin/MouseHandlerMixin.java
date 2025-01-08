package com.matyrobbrt.keybindbundles.mixin;

import com.matyrobbrt.keybindbundles.ii.MouseHandlerExtension;
import net.minecraft.client.MouseHandler;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MouseHandler.class)
public class MouseHandlerMixin implements MouseHandlerExtension {
}
