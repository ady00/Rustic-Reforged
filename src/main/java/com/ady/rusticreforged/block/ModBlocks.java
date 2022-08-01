package com.ady.rusticreforged.block;

import com.ady.rusticreforged.RusticReforged;
import com.ady.rusticreforged.block.custom.BlockGrapeStem;
import com.ady.rusticreforged.block.custom.FertileSoilBlock;
import com.ady.rusticreforged.block.custom.RopeBlock;
import com.ady.rusticreforged.item.ModCreativeModeTab;
import com.ady.rusticreforged.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RusticReforged.MOD_ID);



    public static final RegistryObject<Block> SLATE = registerBlock("slate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).
                    noOcclusion().strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FERTILE_SOIL = registerBlock("fertile_soil",
            () -> new FertileSoilBlock(BlockBehaviour.Properties.of(Material.DIRT)
                    .sound(SoundType.ROOTED_DIRT).strength(0.5F)), ModCreativeModeTab.FARMING_TAB);



    public static final RegistryObject<Block> BLOCK_GRAPE_STEM = registerBlockWithoutBlockItem("grape_stem",
            () -> new BlockGrapeStem(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }




    // rope voxel shape
    public static final RegistryObject<Block> ROPE = registerBlock("rope",
            () -> new RopeBlock(BlockBehaviour.Properties.of(Material.WOOL).
                    instabreak().sound(SoundType.BAMBOO)), ModCreativeModeTab.FARMING_TAB);

    public static final RegistryObject<Block> STONE_PILLAR = registerBlock("stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> ANDESITE_PILLAR = registerBlock("andesite_pillar.json",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> GRANITE_PILLAR = registerBlock("granite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> DIORITE_PILLAR = registerBlock("diorite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> SLATE_PILLAR = registerBlock("slate_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
