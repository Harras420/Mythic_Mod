package net.harras.mythicmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.harras.mythicmod.MythicMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final  Item MYTHIC_INGOT = registerItem("mythic_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final  Item MYTHIC_ORE = registerItem("mythic_ore",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MythicMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("Registering Mod Items for" + MythicMod.MOD_ID);
    }

}
