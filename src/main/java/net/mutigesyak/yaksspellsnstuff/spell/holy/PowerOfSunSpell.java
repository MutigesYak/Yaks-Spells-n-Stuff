package net.mutigesyak.yaksspellsnstuff.spell.holy;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.AutoSpellConfig;
import io.redspace.ironsspellbooks.api.spells.CastType;
import io.redspace.ironsspellbooks.api.spells.SpellRarity;
import net.minecraft.resources.ResourceLocation;
import net.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;


@AutoSpellConfig


public class PowerOfSunSpell extends AbstractSpell  {


    @Override
    public ResourceLocation getSpellResource() {
        return YaksSpellsnStuff.id("power_of_sun_spell");
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }
    private final DefaultConfig defaultConfig = new DefaultConfig()
            .setMinRarity(SpellRarity.EPIC)
            .setSchoolResource(SchoolRegistry.HOLY_RESOURCE)
            .setMaxLevel(5)
            .setCooldownSeconds(30)
            .build();

    @Override
    public CastType getCastType() {
        return CastType.INSTANT;
    }

    public PowerOfSunSpell() {
        this.manaCostPerLevel = 25;
        this.baseSpellPower = 5;
        this.spellPowerPerLevel = 10;
        this.baseManaCost = 35;
        this.castTime = 0;
    }



    @Override
    public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {

    }

}
