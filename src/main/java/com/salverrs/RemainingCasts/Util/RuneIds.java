package com.salverrs.RemainingCasts.Util;

import net.runelite.api.gameval.ItemID;

import java.util.*;

public class RuneIds {

    private static final Map<Integer, Integer[]> RuneMap = new HashMap<>();
    private static final Map<Integer, Integer[]> ReqStaffMap = new HashMap<>();
    private static final Map<Integer, Integer> StaffMap = new HashMap<>();
    private static final Map<Integer, Integer> TomeMap = new HashMap<>();
    private static final Map<Integer, Integer> IngredientMap = new HashMap<>();
    private static final List<Integer> EnchantProducts = new ArrayList<>();

    public static Set<Integer> getAllRuneIds()
    {
        return RuneMap.keySet();
    }

    public static Integer[] getRuneIds(int runeId)
    {
        return RuneMap.getOrDefault(runeId, null);
    }

    public static int getIngredientId(int itemId)
    {
        return IngredientMap.getOrDefault(itemId, -1);
    }

    public static boolean isEnchantProduct(int itemId)
    {
        return EnchantProducts.contains(itemId);
    }

    public static boolean isReqStaff(int itemId)
    {
        return ReqStaffMap.containsKey(itemId);
    }

    public static Integer[] getRuneIdsFromEquipment(int equipmentId)
    {
        if (StaffMap.containsKey(equipmentId))
        {
            return RuneMap.getOrDefault(StaffMap.get(equipmentId), new Integer[] {StaffMap.get(equipmentId)});
        }
        else if (TomeMap.containsKey(equipmentId))
        {
            return RuneMap.getOrDefault(TomeMap.get(equipmentId), null);
        }
        return null;
    }

    public static Integer[] getItemIdsFromEquipment(int equipmentId)
    {
        return ReqStaffMap.getOrDefault(equipmentId, null);
    }

    static
    {
        // Regular runes
        RuneMap.put(ItemID.AIRRUNE, new Integer[] {ItemID.AIRRUNE});
        RuneMap.put(ItemID.WATERRUNE, new Integer[] {ItemID.WATERRUNE});
        RuneMap.put(ItemID.EARTHRUNE, new Integer[] {ItemID.EARTHRUNE});
        RuneMap.put(ItemID.FIRERUNE, new Integer[] {ItemID.FIRERUNE});
        RuneMap.put(ItemID.MINDRUNE, new Integer[] {ItemID.MINDRUNE});
        RuneMap.put(ItemID.BODYRUNE, new Integer[] {ItemID.BODYRUNE});
        RuneMap.put(ItemID.COSMICRUNE, new Integer[] {ItemID.COSMICRUNE});
        RuneMap.put(ItemID.CHAOSRUNE, new Integer[] {ItemID.CHAOSRUNE});
        RuneMap.put(ItemID.NATURERUNE, new Integer[] {ItemID.NATURERUNE});
        RuneMap.put(ItemID.LAWRUNE, new Integer[] {ItemID.LAWRUNE});
        RuneMap.put(ItemID.DEATHRUNE, new Integer[] {ItemID.DEATHRUNE});
        RuneMap.put(ItemID.ASTRALRUNE, new Integer[] {ItemID.ASTRALRUNE});
        RuneMap.put(ItemID.BLOODRUNE, new Integer[] {ItemID.BLOODRUNE});
        RuneMap.put(ItemID.SOULRUNE, new Integer[] {ItemID.SOULRUNE});
        RuneMap.put(ItemID.WRATHRUNE, new Integer[] {ItemID.WRATHRUNE});

        // Regular runes (variations)
        RuneMap.put(ItemID.ROGUETRADER_AIRRUNE, new Integer[] {ItemID.AIRRUNE});
        RuneMap.put(ItemID._100GUIDE_AIRRUNE_DUM, new Integer[] {ItemID.AIRRUNE});
        RuneMap.put(ItemID.SLUG2_RUNE_AIR, new Integer[] {ItemID.AIRRUNE});
        RuneMap.put(ItemID.FAKE_AIRRUNE, new Integer[] {ItemID.AIRRUNE});
        RuneMap.put(ItemID.NZONE_AIRRUNE, new Integer[] {ItemID.AIRRUNE});

        RuneMap.put(ItemID.ROGUETRADER_WATERRUNE, new Integer[] {ItemID.WATERRUNE});
        RuneMap.put(ItemID._100GUIDE_WATERRUNE_DUM, new Integer[] {ItemID.WATERRUNE});
        RuneMap.put(ItemID.SLUG2_RUNE_WATER, new Integer[] {ItemID.WATERRUNE});
        RuneMap.put(ItemID.FAKE_WATERRUNE, new Integer[] {ItemID.WATERRUNE});
        RuneMap.put(ItemID.NZONE_WATERRUNE, new Integer[] {ItemID.WATERRUNE});

        RuneMap.put(ItemID.ROGUETRADER_EARTHRUNE, new Integer[] {ItemID.EARTHRUNE});
        RuneMap.put(ItemID.SLUG2_RUNE_EARTH, new Integer[] {ItemID.EARTHRUNE});
        RuneMap.put(ItemID.FAKE_EARTHRUNE, new Integer[] {ItemID.EARTHRUNE});
        RuneMap.put(ItemID.NZONE_EARTHRUNE, new Integer[] {ItemID.EARTHRUNE});

        RuneMap.put(ItemID.ROGUETRADER_FIRERUNE, new Integer[] {ItemID.FIRERUNE});
        RuneMap.put(ItemID._100GUIDE_FIRERUNE_DUM, new Integer[] {ItemID.FIRERUNE});
        RuneMap.put(ItemID.SLUG2_RUNE_FIRE, new Integer[] {ItemID.FIRERUNE});
        RuneMap.put(ItemID.FAKE_FIRERUNE, new Integer[] {ItemID.FIRERUNE});
        RuneMap.put(ItemID.NZONE_FIRERUNE, new Integer[] {ItemID.FIRERUNE});
        RuneMap.put(ItemID.SUNFIRERUNE, new Integer[] {ItemID.FIRERUNE});

        RuneMap.put(ItemID.ROGUETRADER_MINDRUNE, new Integer[] {ItemID.MINDRUNE});
        RuneMap.put(ItemID.SLUG2_RUNE_MIND, new Integer[] {ItemID.MINDRUNE});
        RuneMap.put(ItemID.FAKE_MINDRUNE, new Integer[] {ItemID.MINDRUNE});

        RuneMap.put(ItemID.ROGUETRADER_BODYRUNE, new Integer[] {ItemID.BODYRUNE});
        RuneMap.put(ItemID.FAKE_BODYRUNE, new Integer[] {ItemID.BODYRUNE});

        RuneMap.put(ItemID.FAKE_COSMICRUNE, new Integer[] {ItemID.COSMICRUNE});

        RuneMap.put(ItemID.ROGUETRADER_CHAOSRUNE, new Integer[] {ItemID.CHAOSRUNE});
        RuneMap.put(ItemID._100GUIDE_CHAOSRUNE_DUM, new Integer[] {ItemID.CHAOSRUNE});
        RuneMap.put(ItemID.FAKE_CHAOSRUNE, new Integer[] {ItemID.CHAOSRUNE});
        RuneMap.put(ItemID.NZONE_CHAOSRUNE, new Integer[] {ItemID.CHAOSRUNE});

        RuneMap.put(ItemID.FAKE_NATURERUNE, new Integer[] {ItemID.NATURERUNE});

        RuneMap.put(ItemID.ROGUETRADER_LAWRUNE, new Integer[] {ItemID.LAWRUNE});
        RuneMap.put(ItemID.FAKE_LAWRUNE, new Integer[] {ItemID.LAWRUNE});

        RuneMap.put(ItemID.ROGUETRADER_DEATHRUNE, new Integer[] {ItemID.DEATHRUNE});
        RuneMap.put(ItemID.FAKE_DEATHRUNE, new Integer[] {ItemID.DEATHRUNE});
        RuneMap.put(ItemID.NZONE_DEATHRUNE, new Integer[] {ItemID.DEATHRUNE});

        RuneMap.put(ItemID.FAKE_ASTRALRUNE, new Integer[] {ItemID.ASTRALRUNE});

        RuneMap.put(ItemID.FAKE_BLOODRUNE, new Integer[] {ItemID.BLOODRUNE});
        RuneMap.put(ItemID.NZONE_BLOODRUNE, new Integer[] {ItemID.BLOODRUNE});

        RuneMap.put(ItemID.FAKE_SOULRUNE, new Integer[] {ItemID.SOULRUNE});

        RuneMap.put(ItemID.FAKE_WRATHRUNE, new Integer[] {ItemID.WRATHRUNE});

        // Combo runes
        RuneMap.put(ItemID.MISTRUNE, new Integer[] {ItemID.AIRRUNE, ItemID.WATERRUNE});
        RuneMap.put(ItemID.DUSTRUNE, new Integer[] {ItemID.AIRRUNE, ItemID.EARTHRUNE});
        RuneMap.put(ItemID.MUDRUNE, new Integer[] {ItemID.WATERRUNE, ItemID.EARTHRUNE});
        RuneMap.put(ItemID.SMOKERUNE, new Integer[] {ItemID.AIRRUNE, ItemID.FIRERUNE});
        RuneMap.put(ItemID.STEAMRUNE, new Integer[] {ItemID.WATERRUNE, ItemID.FIRERUNE});
        RuneMap.put(ItemID.LAVARUNE, new Integer[] {ItemID.EARTHRUNE, ItemID.FIRERUNE});
        RuneMap.put(ItemID.AETHERRUNE, new Integer[] {ItemID.COSMICRUNE, ItemID.SOULRUNE});

        // Staffs
        StaffMap.put(ItemID.STAFF_OF_AIR, ItemID.AIRRUNE);
        StaffMap.put(ItemID.STAFF_OF_WATER, ItemID.WATERRUNE);
        StaffMap.put(ItemID.STAFF_OF_EARTH, ItemID.EARTHRUNE);
        StaffMap.put(ItemID.STAFF_OF_FIRE, ItemID.FIRERUNE);

        StaffMap.put(ItemID.AIR_BATTLESTAFF, ItemID.AIRRUNE);
        StaffMap.put(ItemID.WATER_BATTLESTAFF, ItemID.WATERRUNE);
        StaffMap.put(ItemID.EARTH_BATTLESTAFF, ItemID.EARTHRUNE);
        StaffMap.put(ItemID.FIRE_BATTLESTAFF, ItemID.FIRERUNE);

        StaffMap.put(ItemID.MYSTIC_AIR_STAFF, ItemID.AIRRUNE);
        StaffMap.put(ItemID.MYSTIC_WATER_STAFF, ItemID.WATERRUNE);
        StaffMap.put(ItemID.MYSTIC_EARTH_STAFF, ItemID.EARTHRUNE);
        StaffMap.put(ItemID.MYSTIC_FIRE_STAFF, ItemID.FIRERUNE);

        StaffMap.put(ItemID.MIST_BATTLESTAFF, ItemID.MISTRUNE);
        StaffMap.put(ItemID.DUST_BATTLESTAFF, ItemID.DUSTRUNE);
        StaffMap.put(ItemID.MUD_BATTLESTAFF, ItemID.MUDRUNE);
        StaffMap.put(ItemID.SMOKE_BATTLESTAFF, ItemID.SMOKERUNE);
        StaffMap.put(ItemID.STEAM_BATTLESTAFF, ItemID.STEAMRUNE);
        StaffMap.put(ItemID.LAVA_BATTLESTAFF, ItemID.LAVARUNE);

        StaffMap.put(ItemID.MYSTIC_MIST_BATTLESTAFF, ItemID.MISTRUNE);
        StaffMap.put(ItemID.MYSTIC_DUST_BATTLESTAFF, ItemID.DUSTRUNE);
        StaffMap.put(ItemID.MYSTIC_MUD_STAFF, ItemID.MUDRUNE);
        StaffMap.put(ItemID.MYSTIC_SMOKE_BATTLESTAFF, ItemID.SMOKERUNE);
        StaffMap.put(ItemID.MYSTIC_STEAM_BATTLESTAFF, ItemID.STEAMRUNE);
        StaffMap.put(ItemID.MYSTIC_LAVA_STAFF, ItemID.LAVARUNE);

        StaffMap.put(ItemID.NATURE_STAFF_CHARGED, ItemID.NATURERUNE);

        StaffMap.put(ItemID.KODAI_WAND, ItemID.WATERRUNE);
        StaffMap.put(ItemID.BR_KODAI_WAND, ItemID.WATERRUNE);

        // Required staffs
        ReqStaffMap.put(ItemID.IBANSTAFF, new Integer[] {ItemID.IBANSTAFF});
        ReqStaffMap.put(ItemID.IBANSTAFF_UPGRADED, new Integer[] {ItemID.IBANSTAFF});
        ReqStaffMap.put(ItemID.SLAYER_STAFF, new Integer[] {ItemID.SLAYER_STAFF});
        ReqStaffMap.put(ItemID.SLAYER_STAFF_ENCHANTED, new Integer[] {ItemID.SLAYER_STAFF});
        ReqStaffMap.put(ItemID.SARADOMIN_STAFF, new Integer[] {ItemID.SARADOMIN_STAFF});
        ReqStaffMap.put(ItemID.GUTHIX_STAFF, new Integer[] {ItemID.GUTHIX_STAFF});
        ReqStaffMap.put(ItemID.PEST_VOID_KNIGHT_MACE, new Integer[] {ItemID.GUTHIX_STAFF});
        ReqStaffMap.put(ItemID.PEST_VOID_KNIGHT_MACE_TROUVER, new Integer[] {ItemID.GUTHIX_STAFF});
        ReqStaffMap.put(ItemID.ZAMORAK_STAFF, new Integer[] {ItemID.ZAMORAK_STAFF});

        ReqStaffMap.put(ItemID.SOTD, new Integer[] {ItemID.SLAYER_STAFF, ItemID.ZAMORAK_STAFF});
        ReqStaffMap.put(ItemID.BR_SOTD, new Integer[] {ItemID.SLAYER_STAFF, ItemID.ZAMORAK_STAFF});
        ReqStaffMap.put(ItemID.TOXIC_SOTD_CHARGED, new Integer[] {ItemID.SLAYER_STAFF, ItemID.ZAMORAK_STAFF});
        ReqStaffMap.put(ItemID.TOXIC_SOTD, new Integer[] {ItemID.SLAYER_STAFF, ItemID.ZAMORAK_STAFF});
        ReqStaffMap.put(ItemID.STAFF_OF_LIGHT, new Integer[] {ItemID.SLAYER_STAFF, ItemID.SARADOMIN_STAFF});
        ReqStaffMap.put(ItemID.STAFF_OF_BALANCE, new Integer[] {ItemID.SLAYER_STAFF, ItemID.GUTHIX_STAFF});

        // Tomes
        TomeMap.put(ItemID.TOME_OF_WATER, ItemID.WATERRUNE);
        TomeMap.put(ItemID.TOME_OF_FIRE, ItemID.FIRERUNE);
        TomeMap.put(ItemID.TOME_OF_EARTH, ItemID.EARTHRUNE);

        // Ingredients
        IngredientMap.put(ItemID.STAFFORB, ItemID.STAFFORB);
        IngredientMap.put(ItemID.OPAL_BOLT, ItemID.OPAL_BOLT);
        IngredientMap.put(ItemID.XBOWS_CROSSBOW_BOLTS_BLURITE_TIPPED_JADE, ItemID.XBOWS_CROSSBOW_BOLTS_BLURITE_TIPPED_JADE);
        IngredientMap.put(ItemID.PEARL_BOLT, ItemID.PEARL_BOLT);
        IngredientMap.put(ItemID.XBOWS_CROSSBOW_BOLTS_STEEL_TIPPED_REDTOPAZ, ItemID.XBOWS_CROSSBOW_BOLTS_STEEL_TIPPED_REDTOPAZ);
        IngredientMap.put(ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_SAPPHIRE, ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_SAPPHIRE);
        IngredientMap.put(ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_EMERALD, ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_EMERALD);
        IngredientMap.put(ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_RUBY, ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_RUBY);
        IngredientMap.put(ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_DIAMOND, ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_DIAMOND);
        IngredientMap.put(ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_DRAGONSTONE, ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_DRAGONSTONE);
        IngredientMap.put(ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_ONYX, ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_ONYX);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_OPAL, ItemID.OPAL_BOLT);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_JADE, ItemID.XBOWS_CROSSBOW_BOLTS_BLURITE_TIPPED_JADE);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_PEARL, ItemID.PEARL_BOLT);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_TOPAZ, ItemID.XBOWS_CROSSBOW_BOLTS_STEEL_TIPPED_REDTOPAZ);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_SAPPHIRE, ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_SAPPHIRE);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_EMERALD, ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_EMERALD);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_RUBY, ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_RUBY);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_DIAMOND, ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_DIAMOND);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_DRAGONSTONE, ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_DRAGONSTONE);
        IngredientMap.put(ItemID.DRAGON_BOLTS_UNENCHANTED_ONYX, ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_ONYX);

        // Products (Enchant Crossbow only)
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_BRONZE_TIPPED_OPAL_ENCHANTED);
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_BLURITE_TIPPED_JADE_ENCHANTED);
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_IRON_TIPPED_PEARL_ENCHANTED);
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_STEEL_TIPPED_REDTOPAZ_ENCHANTED);
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_SAPPHIRE_ENCHANTED);
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_MITHRIL_TIPPED_EMERALD_ENCHANTED);
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_RUBY_ENCHANTED);
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_ADAMANTITE_TIPPED_DIAMOND_ENCHANTED);
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_DRAGONSTONE_ENCHANTED);
        EnchantProducts.add(ItemID.XBOWS_CROSSBOW_BOLTS_RUNITE_TIPPED_ONYX_ENCHANTED);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_OPAL);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_JADE);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_PEARL);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_TOPAZ);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_SAPPHIRE);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_EMERALD);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_RUBY);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_DIAMOND);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_DRAGONSTONE);
        EnchantProducts.add(ItemID.DRAGON_BOLTS_ENCHANTED_ONYX);

    }

}