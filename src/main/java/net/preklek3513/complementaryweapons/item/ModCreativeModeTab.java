package net.preklek3513.complementaryweapons.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COMPLEMENTARY_WEAPONS_TAB = new CreativeModeTab("complementaryweaponstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MILK.get());
        }
    };
}
