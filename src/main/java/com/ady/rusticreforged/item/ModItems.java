package com.ady.rusticreforged.item;

import com.ady.rusticreforged.RusticReforged;
import com.ady.rusticreforged.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RusticReforged.MOD_ID);

    /*public static final RegistryObject<Item> APPLE_SEEDS = ITEMS.register("apple_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLOCK_GRAPE_STEM.get(),
                    new Item.Properties().tab(ModCreativeModeTab.FARMING_TAB)));


     */

    public static final RegistryObject<Item> GRAPE_SEEDS = ITEMS.register("grape_stem",
            () -> new ItemNameBlockItem(ModBlocks.BLOCK_GRAPE_STEM.get(),
                    new Item.Properties().tab(ModCreativeModeTab.FARMING_TAB)));

    public static final RegistryObject<Item> IRONBERRY = ITEMS.register("ironberries",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARMING_TAB).
                    food(ModFoods.IRONBERRY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
