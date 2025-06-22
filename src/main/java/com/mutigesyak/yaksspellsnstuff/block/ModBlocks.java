package com.mutigesyak.yaksspellsnstuff.block;

import com.mutigesyak.yaksspellsnstuff.Item.ModItems;
import com.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(YaksSpellsnStuff.MOD_ID);

    public static final DeferredBlock<Block> DRUIDIUM_BLOCK = registerBlock("druidium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> DRIUDIUM_ORE = registerBlock("druidium_ore",
            ()-> new DropExperienceBlock(UniformInt.of(6, 12),
                    BlockBehaviour.Properties.of().strength(6f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DRIUDIUM_DEEPSLATE_ORE = registerBlock("druidium_deepslate_ore",
            ()-> new DropExperienceBlock(UniformInt.of(10, 18),
                    BlockBehaviour.Properties.of().strength(8f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
