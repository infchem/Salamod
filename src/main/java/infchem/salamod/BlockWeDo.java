package infchem.salamod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockWeDo extends BlockContainer {


	public BlockWeDo(Material material) {
		super(material);
		setBlockName("WeDo");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister ir) {
		this.blockIcon = ir.registerIcon( "salamod:wedo");
	}
	
	/**
	 * Returns grey texture if TE is not bound to a player,
	 * else blockIcon 
	 */
	@SideOnly(Side.CLIENT)
	@Override
    public IIcon getIcon(IBlockAccess iba, int x, int y, int z, int side)
	{	
		return this.blockIcon;
	}
	
	
	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return null;
	}

	
}