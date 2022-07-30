package com.ady.rusticreforged.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FARMING_TAB = new CreativeModeTab("farmingtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.APPLE_SEEDS.get());
        }
    };
}
