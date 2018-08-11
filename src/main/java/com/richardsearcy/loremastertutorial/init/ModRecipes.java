package com.richardsearcy.loremastertutorial.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    // Init method for smelting recipes
    public static void init() {

        // Smelting recipe: input - ruby, output - ruby_block
        GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModBlocks.RUBY_BLOCK, 1), 1.5F);

        // Smelting recipe: input - ruby_block, output - 2 diamond_blocks
        GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(Blocks.DIAMOND_BLOCK, 2), 3.0F);
    }
}
