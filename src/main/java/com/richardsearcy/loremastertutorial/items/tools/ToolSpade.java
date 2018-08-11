package com.richardsearcy.loremastertutorial.items.tools;

import com.richardsearcy.loremastertutorial.Main;
import com.richardsearcy.loremastertutorial.init.ModItems;
import com.richardsearcy.loremastertutorial.util.IHasModel;
import javafx.scene.paint.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {

    public ToolSpade(String name, ToolMaterial material) {

        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
