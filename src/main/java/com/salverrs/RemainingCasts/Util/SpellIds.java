package com.salverrs.RemainingCasts.Util;

import com.salverrs.RemainingCasts.Model.SpellCost;
import com.salverrs.RemainingCasts.Model.SpellInfo;
import com.salverrs.RemainingCasts.Model.SpellProduct;
import net.runelite.api.gameval.ItemID;
import net.runelite.api.gameval.SpriteID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpellIds {

    private static final List<SpellInfo> Spells = new ArrayList<>();
    private static final Map<SpellProduct, SpellInfo> SpellProductMap = new HashMap<>();
    private static final Map<String, SpellInfo> SpellNameMap = new HashMap<>();
    private static final Map<Integer, SpellInfo> SpellSpriteMap = new HashMap<>();

    public static List<SpellInfo> getAllSpells()
    {
        return Spells;
    }
    public static SpellInfo getSpellBySpriteId(int spriteId)
    {
        return SpellSpriteMap.getOrDefault(spriteId, null);
    }
    public static SpellInfo getSpellByName(String spellName)
    {
        return SpellNameMap.getOrDefault(spellName.toLowerCase(), null);
    }
    public static SpellInfo getSpellByProduct(int itemId, int quantity)
    {
        return SpellProductMap.getOrDefault(new SpellProduct(itemId, quantity), null);
    }

    static
    {
        // Standard Spellbook

        // Lumbridge Home Teleport
        Spells.add(new SpellInfo("Wind Strike", SpriteID.Magicon.WIND_STRIKE, new SpellCost(new int[] {ItemID.MINDRUNE, ItemID.AIRRUNE}, new int[] {1, 1})));
        Spells.add(new SpellInfo("Confuse", SpriteID.Magicon.CONFUSE, new SpellCost(new int[] {ItemID.BODYRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {1, 3, 2})));

        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Opal)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.AIRRUNE, ItemID.COSMICRUNE, ItemID.OPAL_BOLT}, new int[] {2, 1, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_BRONZE_TIPPED_OPAL_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_OPAL, 10)));
        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Sapphire)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.WATERRUNE, ItemID.COSMICRUNE, ItemID.MINDRUNE, ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_SAPPHIRE}, new int[] {1, 1, 1, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_SAPPHIRE_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_SAPPHIRE, 10)));
        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Jade)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.EARTHRUNE, ItemID.COSMICRUNE, ItemID.XBOWS_CROSSBOW_BOLTS_BLURITE_TIPPED_JADE}, new int[] {2, 1, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_BLURITE_TIPPED_JADE_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_JADE, 10)));
        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Pearl)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.WATERRUNE, ItemID.COSMICRUNE, ItemID.PEARL_BOLT}, new int[] {2, 1, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_IRON_TIPPED_PEARL_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_PEARL, 10)));
        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Emerald)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.AIRRUNE, ItemID.COSMICRUNE, ItemID.NATURERUNE, ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_EMERALD}, new int[] {3, 1, 1, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_EMERALD_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_EMERALD, 10)));
        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Red Topaz)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.FIRERUNE, ItemID.COSMICRUNE, ItemID.XBOWS_CROSSBOW_BOLTS_STEEL_TIPPED_REDTOPAZ}, new int[] {2, 1, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_STEEL_TIPPED_REDTOPAZ_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_TOPAZ, 10)));
        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Ruby)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.FIRERUNE, ItemID.BLOODRUNE, ItemID.COSMICRUNE, ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_RUBY}, new int[] {5, 1, 1, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_RUBY_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_RUBY, 10)));
        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Diamond)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.EARTHRUNE, ItemID.COSMICRUNE, ItemID.LAWRUNE, ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_DIAMOND}, new int[] {10, 1, 2, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_DIAMOND_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_DIAMOND, 10)));
        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Dragonstone)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.EARTHRUNE, ItemID.COSMICRUNE, ItemID.SOULRUNE, ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_DRAGONSTONE}, new int[] {15, 1, 1, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_DRAGONSTONE_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_DRAGONSTONE, 10)));
        Spells.add(new SpellInfo("Enchant Crossbow Bolt (Onyx)", SpriteID.Magicon2.ENCHANT_CROSSBOW_BOLT, new SpellCost(new int[] {ItemID.FIRERUNE, ItemID.COSMICRUNE, ItemID.DEATHRUNE, ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_ONYX}, new int[] {20, 1, 1, 10}),
                new SpellProduct(ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_ONYX_ENCHANTED, 10), new SpellProduct(ItemID.DRAGON_BOLTS_ENCHANTED_ONYX, 10)));

        Spells.add(new SpellInfo("Water Strike", SpriteID.Magicon.WATER_STRIKE, new SpellCost(new int[] {ItemID.MINDRUNE, ItemID.WATERRUNE, ItemID.AIRRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Lvl-1 Enchant", SpriteID.Magicon.LVL_1_ENCHANT, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.WATERRUNE}, new int[] {1, 1})));
        Spells.add(new SpellInfo("Earth Strike", SpriteID.Magicon.EARTH_STRIKE, new SpellCost(new int[] {ItemID.MINDRUNE, ItemID.EARTHRUNE, ItemID.AIRRUNE}, new int[] {1, 2, 1})));
        Spells.add(new SpellInfo("Weaken", SpriteID.Magicon.WEAKEN, new SpellCost(new int[] {ItemID.BODYRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {1, 3, 2})));
        Spells.add(new SpellInfo("Fire Strike", SpriteID.Magicon.FIRE_STRIKE, new SpellCost(new int[] {ItemID.MINDRUNE, ItemID.FIRERUNE, ItemID.AIRRUNE}, new int[] {1, 3, 2})));
        Spells.add(new SpellInfo("Bones to Bananas", SpriteID.Magicon.BONES_TO_BANANAS, new SpellCost(new int[] {ItemID.NATURERUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {1, 2, 2})));
        Spells.add(new SpellInfo("Wind Bolt", SpriteID.Magicon.WIND_BOLT, new SpellCost(new int[] {ItemID.CHAOSRUNE, ItemID.AIRRUNE}, new int[] {1, 2})));
        Spells.add(new SpellInfo("Curse", SpriteID.Magicon.CURSE, new SpellCost(new int[] {ItemID.BODYRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {1, 2, 3})));
        Spells.add(new SpellInfo("Bind", SpriteID.Magicon2.BIND, new SpellCost(new int[] {ItemID.NATURERUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {2, 3, 3})));
        Spells.add(new SpellInfo("Low Level Alchemy", SpriteID.Magicon.LOW_LEVEL_ALCHEMY, new SpellCost(new int[] {ItemID.NATURERUNE, ItemID.FIRERUNE}, new int[] {1, 3})));
        Spells.add(new SpellInfo("Water Bolt", SpriteID.Magicon.WATER_BOLT, new SpellCost(new int[] {ItemID.CHAOSRUNE, ItemID.WATERRUNE, ItemID.AIRRUNE}, new int[] {1, 2, 2})));
        Spells.add(new SpellInfo("Varrock Teleport", SpriteID.Magicon.VARROCK_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {1, 3, 1})));
        Spells.add(new SpellInfo("Lvl-2 Enchant", SpriteID.Magicon.LVL_2_ENCHANT, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.AIRRUNE}, new int[] {1, 3})));
        Spells.add(new SpellInfo("Earth Bolt", SpriteID.Magicon.EARTH_BOLT, new SpellCost(new int[] {ItemID.CHAOSRUNE, ItemID.EARTHRUNE, ItemID.AIRRUNE}, new int[] {1, 3, 2})));
        Spells.add(new SpellInfo("Lumbridge Teleport", SpriteID.Magicon.LUMBRIDGE_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE, ItemID.EARTHRUNE}, new int[] {1, 3, 1})));
        Spells.add(new SpellInfo("Telekinetic Grab", SpriteID.Magicon.TELEKINETIC_GRAB, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE}, new int[] {1, 1})));
        Spells.add(new SpellInfo("Fire Bolt", SpriteID.Magicon.FIRE_BOLT, new SpellCost(new int[] {ItemID.CHAOSRUNE, ItemID.FIRERUNE, ItemID.AIRRUNE}, new int[] {1, 4, 3})));
        Spells.add(new SpellInfo("Falador Teleport", SpriteID.Magicon.FALADOR_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE, ItemID.WATERRUNE}, new int[] {1, 3, 1})));
        Spells.add(new SpellInfo("Crumble Undead", SpriteID.Magicon.CRUMBLE_UNDEAD, new SpellCost(new int[] {ItemID.CHAOSRUNE, ItemID.EARTHRUNE, ItemID.AIRRUNE}, new int[] {1, 2, 2})));
        Spells.add(new SpellInfo("Teleport to House", SpriteID.Magicon2.TELEPORT_TO_HOUSE, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE, ItemID.EARTHRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Wind Blast", SpriteID.Magicon.WIND_BLAST, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.AIRRUNE}, new int[] {1, 3})));
        Spells.add(new SpellInfo("Superheat Item", SpriteID.Magicon.SUPERHEAT_ITEM, new SpellCost(new int[] {ItemID.NATURERUNE, ItemID.FIRERUNE}, new int[] {1, 4})));
        Spells.add(new SpellInfo("Camelot Teleport", SpriteID.Magicon.CAMELOT_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE}, new int[] {1, 5})));
        Spells.add(new SpellInfo("Water Blast", SpriteID.Magicon.WATER_BLAST, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.WATERRUNE, ItemID.AIRRUNE}, new int[] {1, 3, 3})));
        Spells.add(new SpellInfo("Lvl-3 Enchant", SpriteID.Magicon.LVL_3_ENCHANT, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.FIRERUNE}, new int[] {1, 5})));
        Spells.add(new SpellInfo("Iban Blast", SpriteID.Magicon.IBAN_BLAST, new SpellCost(new int[] {ItemID.IBANSTAFF, ItemID.DEATHRUNE, ItemID.FIRERUNE}, new int[] {1, 1, 5})));
        Spells.add(new SpellInfo("Snare", SpriteID.Magicon2.SNARE, new SpellCost(new int[] {ItemID.NATURERUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {3, 4, 4})));
        Spells.add(new SpellInfo("Magic Dart", SpriteID.Magicon2.MAGIC_DART, new SpellCost(new int[] {ItemID.SLAYER_STAFF, ItemID.DEATHRUNE, ItemID.MINDRUNE}, new int[] {1, 1, 4})));
        Spells.add(new SpellInfo("Ardougne Teleport", SpriteID.Magicon.ARDOUGNE_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.WATERRUNE}, new int[] {2, 2})));
        Spells.add(new SpellInfo("Earth Blast", SpriteID.Magicon.EARTH_BLAST, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.EARTHRUNE, ItemID.AIRRUNE}, new int[] {1, 4, 3})));
        Spells.add(new SpellInfo("High Level Alchemy", SpriteID.Magicon.HIGH_LEVEL_ALCHEMY, new SpellCost(new int[] {ItemID.NATURERUNE, ItemID.FIRERUNE}, new int[] {1, 5})));
        Spells.add(new SpellInfo("Charge Water Orb", SpriteID.Magicon.CHARGE_WATER_ORB, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.WATERRUNE, ItemID.STAFFORB}, new int[] {3, 30, 1})));
        Spells.add(new SpellInfo("Lvl-4 Enchant", SpriteID.Magicon.LVL_4_ENCHANT, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.EARTHRUNE}, new int[] {1, 10})));
        Spells.add(new SpellInfo("Watchtower Teleport", SpriteID.Magicon.WATCHTOWER_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.EARTHRUNE}, new int[] {2, 2})));
        Spells.add(new SpellInfo("Fire Blast", SpriteID.Magicon.FIRE_BLAST, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.FIRERUNE, ItemID.AIRRUNE}, new int[] {1, 5, 4})));
        Spells.add(new SpellInfo("Charge Earth Orb", SpriteID.Magicon.CHARGE_EARTH_ORB, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.EARTHRUNE, ItemID.STAFFORB}, new int[] {3, 30, 1})));
        Spells.add(new SpellInfo("Bones to Peaches", SpriteID.Magicon2.BONES_TO_PEACHES, new SpellCost(new int[] {ItemID.NATURERUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {2, 4, 4})));
        Spells.add(new SpellInfo("Saradomin Strike", SpriteID.Magicon.SARADOMIN_STRIKE, new SpellCost(new int[] {ItemID.SARADOMIN_STAFF, ItemID.BLOODRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {1, 2, 4, 2})));
        Spells.add(new SpellInfo("Claws of Guthix", SpriteID.Magicon.CLAWS_OF_GUTHIX, new SpellCost(new int[] {ItemID.GUTHIX_STAFF, ItemID.BLOODRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {1, 2, 4, 1})));
        Spells.add(new SpellInfo("Flames of Zamorak", SpriteID.Magicon.FLAMES_OF_ZAMORAK, new SpellCost(new int[] {ItemID.ZAMORAK_STAFF, ItemID.BLOODRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {1, 2, 1, 4})));
        Spells.add(new SpellInfo("Trollheim Teleport", SpriteID.Magicon2.TROLLHEIM_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.FIRERUNE}, new int[] {2, 2})));
        Spells.add(new SpellInfo("Wind Wave", SpriteID.Magicon.WIND_WAVE, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.AIRRUNE}, new int[] {1, 5})));
        Spells.add(new SpellInfo("Charge Fire Orb", SpriteID.Magicon.CHARGE_FIRE_ORB, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.FIRERUNE, ItemID.STAFFORB}, new int[] {3, 30, 1})));
        Spells.add(new SpellInfo("Ape Atoll Teleport", SpriteID.MagicNecroOn.APE_ATOLL_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.WATERRUNE, ItemID.FIRERUNE, ItemID.BANANA}, new int[] {2, 2, 2, 1})));
        Spells.add(new SpellInfo("Water Wave", SpriteID.Magicon.WATER_WAVE, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.WATERRUNE, ItemID.AIRRUNE}, new int[] {1, 7, 5})));
        Spells.add(new SpellInfo("Charge Air Orb", SpriteID.Magicon.CHARGE_AIR_ORB, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.AIRRUNE, ItemID.STAFFORB}, new int[] {3, 30, 1})));
        Spells.add(new SpellInfo("Vulnerability", SpriteID.Magicon.VULNERABILITY, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {1, 5, 5})));
        Spells.add(new SpellInfo("Lvl-5 Enchant", SpriteID.Magicon.LVL_5_ENCHANT, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {1, 15, 15})));
        Spells.add(new SpellInfo("Kourend Castle Teleport", SpriteID.Magicon2.TELEPORT_TO_KOUREND, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.WATERRUNE, ItemID.FIRERUNE}, new int[] {2, 1, 1})));
        Spells.add(new SpellInfo("Earth Wave", SpriteID.Magicon.EARTH_WAVE, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.EARTHRUNE, ItemID.AIRRUNE}, new int[] {1, 7, 5})));
        Spells.add(new SpellInfo("Enfeeble", SpriteID.Magicon.ENFEEBLE, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {1, 8, 8})));
        Spells.add(new SpellInfo("Teleother Lumbridge", SpriteID.Magicon2.TELEOTHER_LUMBRIDGE, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE, ItemID.EARTHRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Fire Wave", SpriteID.Magicon.FIRE_WAVE, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.FIRERUNE, ItemID.AIRRUNE}, new int[] {1, 7, 5})));
        Spells.add(new SpellInfo("Entangle", SpriteID.Magicon2.ENTANGLE, new SpellCost(new int[] {ItemID.NATURERUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {4, 5, 5})));
        Spells.add(new SpellInfo("Stun", SpriteID.Magicon.STUN, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {1, 12, 12})));
        Spells.add(new SpellInfo("Charge", SpriteID.Magicon2.CHARGE, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {3, 3, 3})));
        Spells.add(new SpellInfo("Wind Surge", SpriteID.Magicon2.WIND_SURGE, new SpellCost(new int[] {ItemID.WRATHRUNE, ItemID.AIRRUNE}, new int[] {1, 7})));
        Spells.add(new SpellInfo("Teleother Falador", SpriteID.Magicon2.TELEOTHER_FALADOR, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE, ItemID.WATERRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Water Surge", SpriteID.Magicon2.WATER_SURGE, new SpellCost(new int[] {ItemID.WRATHRUNE, ItemID.WATERRUNE, ItemID.AIRRUNE}, new int[] {1, 10, 7})));
        Spells.add(new SpellInfo("Tele Block", SpriteID.Magicon2.TELE_BLOCK, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.DEATHRUNE, ItemID.CHAOSRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Teleport to Target", SpriteID.Magicon2.TELEPORT_TO_BOUNTY_TARGET, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.DEATHRUNE, ItemID.CHAOSRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Lvl-6 Enchant", SpriteID.Magicon2.LVL_6_ENCHANT, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.EARTHRUNE, ItemID.FIRERUNE}, new int[] {1, 20, 20})));
        Spells.add(new SpellInfo("Teleother Camelot", SpriteID.Magicon2.TELEOTHER_CAMELOT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE}, new int[] {1, 2})));
        Spells.add(new SpellInfo("Earth Surge", SpriteID.Magicon2.EARTH_SURGE, new SpellCost(new int[] {ItemID.WRATHRUNE, ItemID.EARTHRUNE, ItemID.AIRRUNE}, new int[] {1, 10, 7})));
        Spells.add(new SpellInfo("Lvl-7 Enchant", SpriteID.Magicon2.LVL_7_ENCHANT, new SpellCost(new int[] {ItemID.COSMICRUNE, ItemID.SOULRUNE, ItemID.BLOODRUNE}, new int[] {1, 20, 20})));
        Spells.add(new SpellInfo("Fire Surge", SpriteID.Magicon2.FIRE_SURGE, new SpellCost(new int[] {ItemID.WRATHRUNE, ItemID.FIRERUNE, ItemID.AIRRUNE}, new int[] {1, 10, 7})));

        // Ancients Spellbook

        // Edgeville Home Teleport
        Spells.add(new SpellInfo("Smoke Rush", SpriteID.Magicon2.SMOKE_RUSH, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.CHAOSRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {2, 2, 1, 1})));
        Spells.add(new SpellInfo("Shadow Rush", SpriteID.Magicon2.SHADOW_RUSH, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.CHAOSRUNE, ItemID.SOULRUNE, ItemID.AIRRUNE}, new int[] {2, 2, 1, 1})));
        Spells.add(new SpellInfo("Paddewwa Teleport", SpriteID.Magicon2.PADDEWWA_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {2, 1, 1})));
        Spells.add(new SpellInfo("Blood Rush", SpriteID.Magicon2.BLOOD_RUSH, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.CHAOSRUNE, ItemID.BLOODRUNE}, new int[] {2, 2, 1})));
        Spells.add(new SpellInfo("Ice Rush", SpriteID.Magicon2.ICE_RUSH, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.CHAOSRUNE, ItemID.WATERRUNE}, new int[] {2, 2, 2})));
        Spells.add(new SpellInfo("Senntisten Teleport", SpriteID.Magicon2.SENNTISTEN_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE}, new int[] {2, 1})));
        Spells.add(new SpellInfo("Smoke Burst", SpriteID.Magicon2.SMOKE_BURST, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.CHAOSRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {2, 4, 2, 2})));
        Spells.add(new SpellInfo("Shadow Burst", SpriteID.Magicon2.SHADOW_BURST, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.CHAOSRUNE, ItemID.SOULRUNE, ItemID.AIRRUNE}, new int[] {2, 4, 2, 1})));
        Spells.add(new SpellInfo("Kharyrll Teleport", SpriteID.Magicon2.KHARYRLL_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.BLOODRUNE}, new int[] {2, 1})));
        Spells.add(new SpellInfo("Blood Burst", SpriteID.Magicon2.BLOOD_BURST, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.CHAOSRUNE, ItemID.BLOODRUNE}, new int[] {2, 4, 2})));
        Spells.add(new SpellInfo("Ice Burst", SpriteID.Magicon2.ICE_BURST, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.CHAOSRUNE, ItemID.WATERRUNE}, new int[] {2, 4, 4})));
        Spells.add(new SpellInfo("Lassar Teleport", SpriteID.Magicon2.LASSAR_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.WATERRUNE}, new int[] {2, 4})));
        Spells.add(new SpellInfo("Smoke Blitz", SpriteID.Magicon2.SMOKE_BLITZ, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.BLOODRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {2, 2, 2, 2})));
        Spells.add(new SpellInfo("Shadow Blitz", SpriteID.Magicon2.SHADOW_BLITZ, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.BLOODRUNE, ItemID.SOULRUNE, ItemID.AIRRUNE}, new int[] {2, 2, 2, 2})));
        Spells.add(new SpellInfo("Dareeyak Teleport", SpriteID.Magicon2.DAREEYAK_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {2, 2, 3})));
        Spells.add(new SpellInfo("Blood Blitz", SpriteID.Magicon2.BLOOD_BLITZ, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.BLOODRUNE}, new int[] {2, 4})));
        Spells.add(new SpellInfo("Ice Blitz", SpriteID.Magicon2.ICE_BLITZ, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.BLOODRUNE, ItemID.WATERRUNE}, new int[] {2, 2, 3})));
        Spells.add(new SpellInfo("Carrallanger Teleport", SpriteID.Magicon2.CARRALLANGAR_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE}, new int[] {2, 2})));
        Spells.add(new SpellInfo("Teleport to Target", SpriteID.Magicon2.TELEPORT_TO_BOUNTY_TARGET, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.DEATHRUNE, ItemID.CHAOSRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Smoke Barrage", SpriteID.Magicon2.SMOKE_BARRAGE, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.BLOODRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {4, 2, 4, 4})));
        Spells.add(new SpellInfo("Shadow Barrage", SpriteID.Magicon2.SHADOW_BARRAGE, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.BLOODRUNE, ItemID.SOULRUNE, ItemID.AIRRUNE}, new int[] {4, 2, 3, 4})));
        Spells.add(new SpellInfo("Annakarl Teleport", SpriteID.Magicon2.ANNAKARL_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.BLOODRUNE}, new int[] {2, 2})));
        Spells.add(new SpellInfo("Blood Barrage", SpriteID.Magicon2.BLOOD_BARRAGE, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.BLOODRUNE, ItemID.SOULRUNE}, new int[] {4, 4, 1})));
        Spells.add(new SpellInfo("Ice Barrage", SpriteID.Magicon2.ICE_BARRAGE, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.BLOODRUNE, ItemID.WATERRUNE}, new int[] {4, 2, 6})));
        Spells.add(new SpellInfo("Ghorrock Teleport", SpriteID.Magicon2.GHORROCK_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.WATERRUNE}, new int[] {2, 8})));

        //Normal Ancient Teleports compatibility (name map only)
        Spells.add(new SpellInfo("Edgeville Teleport", SpriteID.Magicon2.PADDEWWA_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {2, 1, 1})));
        Spells.add(new SpellInfo("Digsite Teleport", SpriteID.Magicon2.SENNTISTEN_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE}, new int[] {2, 1})));
        Spells.add(new SpellInfo("Canifis Teleport", SpriteID.Magicon2.KHARYRLL_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.BLOODRUNE}, new int[] {2, 1})));
        Spells.add(new SpellInfo("Ice Mountain Teleport", SpriteID.Magicon2.LASSAR_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.WATERRUNE}, new int[] {2, 4})));
        Spells.add(new SpellInfo("Forgotten Cemetery Teleport", SpriteID.Magicon2.DAREEYAK_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.AIRRUNE, ItemID.FIRERUNE}, new int[] {2, 2, 3})));
        Spells.add(new SpellInfo("Graveyard of Shadows Teleport", SpriteID.Magicon2.CARRALLANGAR_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE}, new int[] {2, 2})));
        Spells.add(new SpellInfo("Demonic Ruins Teleport", SpriteID.Magicon2.ANNAKARL_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.BLOODRUNE}, new int[] {2, 2})));
        Spells.add(new SpellInfo("Frozen Waste Plateau Teleport", SpriteID.Magicon2.GHORROCK_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.WATERRUNE}, new int[] {2, 8})));

        // Lunar Spellbook

        // Lunar Home Teleport
        Spells.add(new SpellInfo("Bake Pie", SpriteID.LunarMagicOn.BAKE_PIE, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.WATERRUNE, ItemID.FIRERUNE}, new int[] {1, 4, 5})));
        Spells.add(new SpellInfo("Geomancy", SpriteID.LunarMagicOn.GEOMANCY, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.NATURERUNE, ItemID.EARTHRUNE}, new int[] {3, 3, 8})));
        Spells.add(new SpellInfo("Cure Plant", SpriteID.LunarMagicOn.CURE_PLANT, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.EARTHRUNE}, new int[] {1, 8})));
        Spells.add(new SpellInfo("Monster Examine", SpriteID.LunarMagicOn.MONSTER_EXAMINE, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.COSMICRUNE, ItemID.MINDRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("NPC Contact", SpriteID.LunarMagicOn.NPC_CONTACT, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.COSMICRUNE, ItemID.AIRRUNE}, new int[] {1, 1, 2})));
        Spells.add(new SpellInfo("Cure Other", SpriteID.LunarMagicOn.CURE_OTHER, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.LAWRUNE, ItemID.EARTHRUNE}, new int[] {1, 1, 10})));
        Spells.add(new SpellInfo("Humidify", SpriteID.LunarMagicOn.HUMIDIFY, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.WATERRUNE, ItemID.FIRERUNE}, new int[] {1, 3, 1})));
        Spells.add(new SpellInfo("Moonclan Teleport", SpriteID.LunarMagicOn.MOONCLAN_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.EARTHRUNE}, new int[] {1, 2, 2})));
        Spells.add(new SpellInfo("Tele Group Moonclan", SpriteID.LunarMagicOn.TELE_GROUP_MOONCLAN, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.EARTHRUNE}, new int[] {1, 2, 4})));
        Spells.add(new SpellInfo("Cure Me", SpriteID.LunarMagicOn.CURE_ME, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.COSMICRUNE, ItemID.LAWRUNE}, new int[] {2, 2, 1})));
        Spells.add(new SpellInfo("Ourania Teleport", SpriteID.LunarMagicOn.OURANIA_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.EARTHRUNE}, new int[] {1, 2, 6})));
        Spells.add(new SpellInfo("Hunter Kit", SpriteID.LunarMagicOn.HUNTER_KIT, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.EARTHRUNE}, new int[] {2, 2})));
        Spells.add(new SpellInfo("Waterbirth Teleport", SpriteID.LunarMagicOn.WATERBIRTH_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {1, 2, 1})));
        Spells.add(new SpellInfo("Tele Group Waterbirth", SpriteID.LunarMagicOn.TELE_GROUP_WATERBIRTH, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {1, 2, 5})));
        Spells.add(new SpellInfo("Cure Group", SpriteID.LunarMagicOn.CURE_GROUP, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.COSMICRUNE, ItemID.LAWRUNE}, new int[] {2, 2, 2})));
        Spells.add(new SpellInfo("Stat Spy", SpriteID.LunarMagicOn.STAT_SPY, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.COSMICRUNE, ItemID.BODYRUNE}, new int[] {2, 2, 5})));
        Spells.add(new SpellInfo("Barbarian Teleport", SpriteID.LunarMagicOn.BARBARIAN_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.FIRERUNE}, new int[] {2, 2, 3})));
        Spells.add(new SpellInfo("Tele Group Barbarian", SpriteID.LunarMagicOn.TELE_GROUP_BARBARIAN, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.FIRERUNE}, new int[] {2, 2, 6})));
        Spells.add(new SpellInfo("Spin Flax", SpriteID.LunarMagicOn.SPIN_FLAX, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.NATURERUNE, ItemID.AIRRUNE}, new int[] {1, 2, 5})));
        Spells.add(new SpellInfo("Superglass Make", SpriteID.LunarMagicOn.SUPERGLASS_MAKE, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.FIRERUNE, ItemID.AIRRUNE}, new int[] {2, 6, 10})));
        Spells.add(new SpellInfo("Tan Leather", SpriteID.LunarMagicOn.TAN_LEATHER, new SpellCost(new int[] {ItemID.FIRERUNE, ItemID.ASTRALRUNE, ItemID.NATURERUNE}, new int[] {5, 2, 1})));
        Spells.add(new SpellInfo("Khazard Teleport", SpriteID.LunarMagicOn.KHAZARD_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {2, 2, 4})));
        Spells.add(new SpellInfo("Tele Group Khazard", SpriteID.LunarMagicOn.TELE_GROUP_KHAZARD, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {2, 2, 8})));
        Spells.add(new SpellInfo("Dream", SpriteID.LunarMagicOn.DREAM, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.COSMICRUNE, ItemID.BODYRUNE}, new int[] {2, 1, 5})));
        Spells.add(new SpellInfo("String Jewellery", SpriteID.LunarMagicOn.STRING_JEWELLERY, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {2, 5, 10})));
        Spells.add(new SpellInfo("Stat Restore Pot Share", SpriteID.LunarMagicOn.STAT_RESTORE_POT_SHARE, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {2, 10, 10})));
        Spells.add(new SpellInfo("Magic Imbue", SpriteID.LunarMagicOn.MAGIC_IMBUE, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.WATERRUNE, ItemID.FIRERUNE}, new int[] {2, 7, 7})));
        Spells.add(new SpellInfo("Fertile Soil", SpriteID.LunarMagicOn.FERTILE_SOIL, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.NATURERUNE, ItemID.EARTHRUNE}, new int[] {3, 2, 15})));
        Spells.add(new SpellInfo("Boost Potion Share", SpriteID.LunarMagicOn.BOOST_POTION_SHARE, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {3, 10, 12})));
        Spells.add(new SpellInfo("Fishing Guild Teleport", SpriteID.LunarMagicOn.FISHING_GUILD_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {3, 3, 10})));
        Spells.add(new SpellInfo("Teleport to Target", SpriteID.Magicon2.TELEPORT_TO_BOUNTY_TARGET, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.DEATHRUNE, ItemID.CHAOSRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Tele Group Fishing Guild", SpriteID.LunarMagicOn.TELE_GROUP_FISHING_GUILD, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {3, 3, 14})));
        Spells.add(new SpellInfo("Plank Make", SpriteID.LunarMagicOn.PLANK_MAKE, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.NATURERUNE, ItemID.EARTHRUNE}, new int[] {2, 1, 15})));
        Spells.add(new SpellInfo("Catherby Teleport", SpriteID.LunarMagicOn.CATHERBY_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {3, 3, 10})));
        Spells.add(new SpellInfo("Tele Group Catherby", SpriteID.LunarMagicOn.TELE_GROUP_CATHERBY, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {3, 3, 15})));
        Spells.add(new SpellInfo("Recharge Dragonstone", SpriteID.LunarMagicOn.RECHARGE_DRAGONSTONE, new SpellCost(new int[] {ItemID.WATERRUNE, ItemID.ASTRALRUNE, ItemID.SOULRUNE}, new int[] {4, 1, 1})));
        Spells.add(new SpellInfo("Ice Plateau Teleport", SpriteID.LunarMagicOn.ICE_PLATEAU_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {3, 3, 8})));
        Spells.add(new SpellInfo("Tele Group Ice Plateau", SpriteID.LunarMagicOn.TELE_GROUP_ICE_PLATEAU, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.ASTRALRUNE, ItemID.WATERRUNE}, new int[] {3, 3, 16})));
        Spells.add(new SpellInfo("Energy Transfer", SpriteID.LunarMagicOn.ENERGY_TRANSFER, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.LAWRUNE, ItemID.NATURERUNE}, new int[] {3, 2, 1})));
        Spells.add(new SpellInfo("Heal Other", SpriteID.LunarMagicOn.HEAL_OTHER, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.LAWRUNE, ItemID.BLOODRUNE}, new int[] {3, 3, 1})));
        Spells.add(new SpellInfo("Vengeance Other", SpriteID.LunarMagicOn.VENGEANCE_OTHER, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.DEATHRUNE, ItemID.EARTHRUNE}, new int[] {3, 2, 10})));
        Spells.add(new SpellInfo("Vengeance", SpriteID.LunarMagicOn.VENGEANCE, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.DEATHRUNE, ItemID.EARTHRUNE}, new int[] {4, 2, 10})));
        Spells.add(new SpellInfo("Heal Group", SpriteID.LunarMagicOn.HEAL_GROUP, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.LAWRUNE, ItemID.BLOODRUNE}, new int[] {4, 6, 3})));
        Spells.add(new SpellInfo("Spellbook Swap", SpriteID.LunarMagicOn.SPELLBOOK_SWAP, new SpellCost(new int[] {ItemID.ASTRALRUNE, ItemID.COSMICRUNE, ItemID.LAWRUNE}, new int[] {3, 2, 1})));

        // Arceuus spellbook

        // Arceuus Home Teleport
        Spells.add(new SpellInfo("Arceuus Library Teleport", SpriteID.MagicNecroOn.ARCEUUS_LIBRARY_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.EARTHRUNE}, new int[] {1, 2})));
        Spells.add(new SpellInfo("Basic Reanimation", SpriteID.MagicNecroOn.BASIC_REANIMATION, new SpellCost(new int[] {ItemID.BODYRUNE, ItemID.NATURERUNE}, new int[] {4, 2})));
        Spells.add(new SpellInfo("Draynor Manor Teleport", SpriteID.MagicNecroOn.DRAYNOR_MANOR_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.WATERRUNE, ItemID.EARTHRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Battlefront Teleport", 1255, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.EARTHRUNE, ItemID.FIRERUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Mind Altar Teleport", SpriteID.MagicNecroOn.MIND_ALTAR_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.MINDRUNE}, new int[] {1, 2})));
        Spells.add(new SpellInfo("Respawn Teleport", SpriteID.MagicNecroOn.RESPAWN_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE}, new int[] {1, 1})));
        Spells.add(new SpellInfo("Ghostly Grasp", SpriteID.MagicNecroOn.GHOSTLY_GRASP, new SpellCost(new int[] {ItemID.CHAOSRUNE, ItemID.AIRRUNE}, new int[] {1, 4})));
        Spells.add(new SpellInfo("Resurrect Lesser Ghost", SpriteID.MagicNecroOn.RESURRECT_LESSER_GHOST, new SpellCost(new int[] {ItemID.MINDRUNE, ItemID.AIRRUNE, ItemID.COSMICRUNE}, new int[] {5, 10, 1})));
        Spells.add(new SpellInfo("Resurrect Lesser Skeleton", 1271, new SpellCost(new int[] {ItemID.MINDRUNE, ItemID.AIRRUNE, ItemID.COSMICRUNE}, new int[] {5, 10, 1})));
        Spells.add(new SpellInfo("Resurrect Lesser Zombie", 1300, new SpellCost(new int[] {ItemID.MINDRUNE, ItemID.AIRRUNE, ItemID.COSMICRUNE}, new int[] {5, 10, 1})));
        Spells.add(new SpellInfo("Salve Graveyard Teleport", SpriteID.MagicNecroOn.SALVE_GRAVEYARD_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE}, new int[] {1, 2})));
        Spells.add(new SpellInfo("Adept Reanimation", SpriteID.MagicNecroOn.ADEPT_REANIMATION, new SpellCost(new int[] {ItemID.BODYRUNE, ItemID.NATURERUNE, ItemID.SOULRUNE}, new int[] {4, 3, 1})));
        Spells.add(new SpellInfo("Inferior Demonbane", SpriteID.MagicNecroOn.INFERIOR_DEMONBANE, new SpellCost(new int[] {ItemID.CHAOSRUNE, ItemID.FIRERUNE}, new int[] {1, 3})));
        Spells.add(new SpellInfo("Shadow Veil", SpriteID.MagicNecroOn.SHADOW_VEIL, new SpellCost(new int[] {ItemID.EARTHRUNE, ItemID.FIRERUNE, ItemID.COSMICRUNE}, new int[] {5, 5, 5})));
        Spells.add(new SpellInfo("Fenkenstrain's Castle Teleport", SpriteID.MagicNecroOn.FENKENSTRAINS_CASTLE_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE, ItemID.EARTHRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Dark Lure", SpriteID.MagicNecroOn.DARK_LURE, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.NATURERUNE}, new int[] {1, 1})));
        Spells.add(new SpellInfo("Skeletal Grasp", SpriteID.MagicNecroOn.SKELETAL_GRASP, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.EARTHRUNE}, new int[] {1, 8})));
        Spells.add(new SpellInfo("Resurrect Superior Ghost", 2979, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.EARTHRUNE, ItemID.COSMICRUNE}, new int[] {5, 10, 1})));
        Spells.add(new SpellInfo("Resurrect Superior Skeleton", SpriteID.MagicNecroOn.RESURRECT_SUPERIOR_SKELETON, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.EARTHRUNE, ItemID.COSMICRUNE}, new int[] {5, 10, 1})));
        Spells.add(new SpellInfo("Resurrect Superior Zombie", 2983, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.EARTHRUNE, ItemID.COSMICRUNE}, new int[] {5, 10, 1})));
        Spells.add(new SpellInfo("Mark of Darkness", SpriteID.MagicNecroOn.MARK_OF_DARKNESS, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.COSMICRUNE}, new int[] {1, 1})));
        Spells.add(new SpellInfo("West Ardougne Teleport", SpriteID.MagicNecroOn.WEST_ARDOUGNE_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE}, new int[] {2, 2})));
        Spells.add(new SpellInfo("Superior Demonbane", SpriteID.MagicNecroOn.SUPERIOR_DEMONBANE, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.FIRERUNE}, new int[] {1, 5})));
        Spells.add(new SpellInfo("Lesser Corruption", SpriteID.MagicNecroOn.LESSER_CORRUPTION, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.SOULRUNE}, new int[] {1, 2})));
        Spells.add(new SpellInfo("Harmony Island Teleport", SpriteID.MagicNecroOn.HARMONY_ISLAND_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE, ItemID.NATURERUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Vile Vigour", SpriteID.MagicNecroOn.VILE_VIGOUR, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.AIRRUNE}, new int[] {1, 3})));
        Spells.add(new SpellInfo("Degrime", SpriteID.MagicNecroOn.DEGRIME, new SpellCost(new int[] {ItemID.EARTHRUNE, ItemID.NATURERUNE}, new int[] {4, 2})));
        Spells.add(new SpellInfo("Cemetery Teleport", SpriteID.MagicNecroOn.CEMETERY_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE, ItemID.BLOODRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Expert Reanimation", SpriteID.MagicNecroOn.EXPERT_REANIMATION, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.NATURERUNE, ItemID.SOULRUNE}, new int[] {1, 3, 2})));
        Spells.add(new SpellInfo("Ward of Arceuus", SpriteID.MagicNecroOn.WARD_OF_ARCEUUS, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.NATURERUNE, ItemID.COSMICRUNE}, new int[] {4, 2, 1})));
        Spells.add(new SpellInfo("Resurrect Greater Ghost", 2980, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.FIRERUNE, ItemID.COSMICRUNE}, new int[] {5, 10, 1})));
        Spells.add(new SpellInfo("Resurrect Greater Skeleton", 2982, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.FIRERUNE, ItemID.COSMICRUNE}, new int[] {5, 10, 1})));
        Spells.add(new SpellInfo("Resurrect Greater Zombie", SpriteID.MagicNecroOn.RESURRECT_GREATER_ZOMBIE, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.FIRERUNE, ItemID.COSMICRUNE}, new int[] {5, 10, 1})));
        Spells.add(new SpellInfo("Resurrect Crops", SpriteID.MagicNecroOn.RESURRECT_CROPS, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.NATURERUNE, ItemID.BLOODRUNE, ItemID.EARTHRUNE}, new int[] {8, 12, 8, 25})));
        Spells.add(new SpellInfo("Undead Grasp", SpriteID.MagicNecroOn.UNDEAD_GRASP, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.FIRERUNE}, new int[] {1, 12})));
        Spells.add(new SpellInfo("Death Charge", SpriteID.MagicNecroOn.DEATH_CHARGE, new SpellCost(new int[] {ItemID.DEATHRUNE, ItemID.BLOODRUNE, ItemID.SOULRUNE}, new int[] {1, 1, 1})));
        Spells.add(new SpellInfo("Dark Demonbane", SpriteID.MagicNecroOn.DARK_DEMONBANE, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.FIRERUNE}, new int[] {2, 7})));
        Spells.add(new SpellInfo("Barrows Teleport", SpriteID.MagicNecroOn.BARROWS_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE, ItemID.BLOODRUNE}, new int[] {2, 2, 1})));
        Spells.add(new SpellInfo("Demonic Offering", SpriteID.MagicNecroOn.DEMONIC_OFFERING, new SpellCost(new int[] {ItemID.SOULRUNE, ItemID.WRATHRUNE}, new int[] {1, 1})));
        Spells.add(new SpellInfo("Greater Corruption", SpriteID.MagicNecroOn.GREATER_CORRUPTION, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.SOULRUNE}, new int[] {1, 3})));
        Spells.add(new SpellInfo("Master Reanimation", SpriteID.MagicNecroOn.MASTER_REANIMATION, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.NATURERUNE, ItemID.SOULRUNE}, new int[] {2, 4, 4})));
        Spells.add(new SpellInfo("Ape Atoll Teleport", SpriteID.MagicNecroOn.APE_ATOLL_TELEPORT, new SpellCost(new int[] {ItemID.LAWRUNE, ItemID.SOULRUNE, ItemID.BLOODRUNE}, new int[] {2, 2, 2})));
        Spells.add(new SpellInfo("Sinister Offering", SpriteID.MagicNecroOn.SINISTER_OFFERING, new SpellCost(new int[] {ItemID.BLOODRUNE, ItemID.WRATHRUNE}, new int[] {1, 1})));

        // Some keys do collide (some spells name/sprite) - no longer bothering to map through cost because unlimited rune supply complicates things.
        // We remove existing sprite keys and ignore them because we don't want the first occurrence mapped if it's not unique.
        // Don't need to remove/ignore keys from name map, because we only use that for tooltips and the rune costs are the same regardless (as of writing, only Teleport to Target is shared).

        // SpellProductMap currently only used for detecting Enchant crossbow bolts.

        final List<Integer> spriteIgnore = new ArrayList<Integer>();

        Spells.forEach(s -> {
            final SpellCost cost = s.getSpellCost();
            final int spriteId = s.getSpriteId();
            final String name = s.getName();

            if (s.getSpellProducts() != null)
            {
                final SpellProduct[] products = s.getSpellProducts();
                for (SpellProduct p : products)
                    SpellProductMap.put(p, s);
            }

            if (!spriteIgnore.contains(spriteId))
            {
                if (!SpellSpriteMap.containsKey(spriteId))
                {
                    SpellSpriteMap.put(spriteId, s);
                }
                else
                {
                    SpellSpriteMap.remove(spriteId);
                    spriteIgnore.add(spriteId);
                }
            }

            if (!SpellNameMap.containsKey(name))
                SpellNameMap.put(name.toLowerCase(), s);
        });
    }
}
