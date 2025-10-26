package net.mutigesyak.yaksspellsnstuff.spell;

import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;
import net.mutigesyak.yaksspellsnstuff.spell.holy.PowerOfSunSpell;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSpells {



        public static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(SpellRegistry.SPELL_REGISTRY_KEY, YaksSpellsnStuff.MOD_ID);

        public static void register(IEventBus eventBus) {
            SPELLS.register(eventBus);
        }

        public static Supplier<AbstractSpell> registerSpell(AbstractSpell spell) {
            return SPELLS.register(spell.getSpellName(), () -> spell);
        }

        public static final Supplier<AbstractSpell> POWER_OF_SUN_SPELL = registerSpell(new PowerOfSunSpell());
    }



