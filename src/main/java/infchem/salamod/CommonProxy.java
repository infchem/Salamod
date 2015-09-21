package infchem.salamod;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import infchem.salamod.Salamod.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CommonProxy {

	public void load() {
		registerBlocks();
	}

	public void registerBlocks()
	{
		Salamod.Blocks.wedoBlock = new BlockWeDo(Material.iron);
		GameRegistry.registerBlock(Salamod.Blocks.wedoBlock.setCreativeTab(tabWeDo), "wedo");
	}
	
	public static CreativeTabs tabWeDo = new CreativeTabs("tabWeDo") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(Blocks.wedoBlock);
	    }
	};
}