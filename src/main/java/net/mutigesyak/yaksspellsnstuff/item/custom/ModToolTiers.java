package net.mutigesyak.yaksspellsnstuff.item.custom;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.mutigesyak.yaksspellsnstuff.item.ModItems;
import net.mutigesyak.yaksspellsnstuff.util.ModTags;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier DIVINE_SWORD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_DIVINE_TOOL,
            2800, 4f, 0f, 18, () -> Ingredient.of(ModItems.DIVINE_INGOT));

}
