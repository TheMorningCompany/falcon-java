package io.github.themorningcompany.falconrockets;

import io.github.themorningcompany.falconrockets.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class RocketsItemGroup extends ItemGroup {
    public RocketsItemGroup() {
        super("rockets");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.falcon_spawn_egg);
    }
}
