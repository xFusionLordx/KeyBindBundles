package com.matyrobbrt.keybindbundles;

import net.neoforged.neoforge.common.ModConfigSpec;

public class KBClientConfig {
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.BooleanValue IGNORE_INVALID_KEY_CHECKS;
    static {
        var builder = new ModConfigSpec.Builder();
        IGNORE_INVALID_KEY_CHECKS = builder
                .comment("ONLY USE THIS IF YOU KNOW WHAT YOU'RE DOING")
                .comment("Ignore invalid key checks in InputConstants#isKeyDown")
                .define("ignoreInvalidKeyChecks", false);
        SPEC = builder.build();
    }
}
