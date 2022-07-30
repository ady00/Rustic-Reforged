package com.ady.rusticreforged.item;

import com.ady.rusticreforged.RusticReforged;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RusticReforged.MOD_ID);

    public static final RegistryObject<Item> APPLE_SEEDS = ITEMS.register("apple_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARMING_TAB)));

    public static final RegistryObject<Item> IRONBERRIES = ITEMS.register("ironberries",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARMING_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
