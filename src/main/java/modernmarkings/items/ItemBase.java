package modernmarkings.items;

import net.minecraft.item.Item;

import modernmarkings.ModernMarkings;
import modernmarkings.init.ModItems;

public class ItemBase extends Item {

    public ItemBase(String name, String textureName) {
        setUnlocalizedName(name);
        setTextureName(ModernMarkings.MODID + ":" + textureName);

        setCreativeTab(ModernMarkings.CREATIVE_TAB);

        ModItems.ITEMS.add(this);
    }
}
