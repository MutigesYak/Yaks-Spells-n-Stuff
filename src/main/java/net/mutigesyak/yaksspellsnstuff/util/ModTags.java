package net.mutigesyak.yaksspellsnstuff.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_DIVINE_TOOL = createTag("needs_divine_tool");
        public static final TagKey<Block> INCORRECT_FOR_DIVINE_TOOL = createTag("incorrect_for_divine_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(YaksSpellsnStuff.MOD_ID, name));
        }
    }
}