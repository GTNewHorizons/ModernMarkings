package modernmarkings.items;

import static modernmarkings.ModernMarkings.CREATIVE_TAB;

import net.minecraft.item.Item;

import modernmarkings.ModernMarkings;
import modernmarkings.init.ModItems;

public class ItemBase extends Item {

    /**
     * Creating the Base of a new Mod Item
     *
     * @param name Name for the Item
     */
    public ItemBase(String name, String textureName) {
        setCreativeTab(CREATIVE_TAB);
        setUnlocalizedName(name);
        setTextureName(ModernMarkings.MODID + ":" + textureName);

        ModItems.ITEMS.add(this);
    }
}
