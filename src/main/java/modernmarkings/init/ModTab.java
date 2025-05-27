package modernmarkings.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import modernmarkings.ModernMarkings;

public class ModTab extends CreativeTabs {

    public ModTab(String name) {
        super(ModernMarkings.MODID + "." + name);
    }

    @Override
    public Item getTabIconItem() {
        return new ItemStack(ModItems.CHALK).getItem();
    }
}
