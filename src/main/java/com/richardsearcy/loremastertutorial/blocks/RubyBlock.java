package com.richardsearcy.loremastertutorial.blocks;

import com.richardsearcy.loremastertutorial.Main;
import com.richardsearcy.loremastertutorial.init.ModBlocks;
import com.richardsearcy.loremastertutorial.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class RubyBlock extends BlockBase {

    public RubyBlock(String name, Material material) {

        super(name, material);

        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(1.0F);
        //setLightOpacity(1);
        //setBlockUnbreakable();

    }
}
