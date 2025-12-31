package com.ERR0RW0LF.set_the_sails.item.custom;

import com.ERR0RW0LF.set_the_sails.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class HammerItem extends Item {

    private static final Map<Block, Block> HAMMER_MAP =
            Map.of(
                    Blocks.OAK_PLANKS, ModBlocks.PLANK_BLOCK
            );

    public HammerItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context){
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if (HAMMER_MAP.containsKey(clickedBlock)) {
            if (!world.isClient()){
                world.setBlockState(context.getBlockPos(), HAMMER_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);
                double x = context.getBlockPos().getX();
                double y = context.getBlockPos().getY();
                double z = context.getBlockPos().getZ();
                ((ServerWorld) world).spawnParticles(
                        new BlockStateParticleEffect(ParticleTypes.BLOCK, HAMMER_MAP.get(clickedBlock).getDefaultState()),
                        x + 0.5,
                        y + 0.5,
                        z + 0.5,
                        50,
                        0.5,
                        0.5,
                        0.5,
                        0.3
                );
            }
        }

        return ActionResult.SUCCESS;
    }

}
