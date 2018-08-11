package com.richardsearcy.loremastertutorial.init;

import com.richardsearcy.loremastertutorial.blocks.BlockBase;
import com.richardsearcy.loremastertutorial.blocks.RubyBlock;
import com.richardsearcy.loremastertutorial.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
}
