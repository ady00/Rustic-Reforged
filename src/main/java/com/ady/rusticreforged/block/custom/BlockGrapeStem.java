package com.ady.rusticreforged.block.custom;

import com.ady.rusticreforged.block.ModBlocks;
import com.ady.rusticreforged.item.ModItems;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.List;

public class BlockGrapeStem extends CropBlock {

    public static final BooleanProperty CAN_GROW = BooleanProperty.create("grow");

    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    BlockPos ropeAbove;

    public BlockGrapeStem(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }


    /*
    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos) {
        if (state.getValue(AXIS) != EnumFacing.Axis.Y && world.getBlockState(pos.down()).getBlock() instanceof BlockRopeBase && !(world.getBlockState(pos.down()).getBlock() instanceof BlockGrapeLeaves)
                && world.getBlockState(pos.down()).getValue(BlockRope.AXIS) == EnumFacing.Axis.Y) {
            return state.withProperty(DANGLE, true);
        }
        return state.withProperty(DANGLE, false);

     */


    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.GRAPE_SEEDS.get();
    }
}
