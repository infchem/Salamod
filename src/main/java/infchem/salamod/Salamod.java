package infchem.salamod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "salamod", name = "Salamod Tutorial mod", version = "0.1", dependencies = "", useMetadata = true)

public class Salamod {
	
	@Instance("salamod")
	public static Salamod instance;

	@SidedProxy(clientSide = "infchem.salamod.ClientProxy", serverSide = "infchem.salamod.CommonProxy")
	public static CommonProxy proxy;

	// block declarations
	public static class Blocks {
		public static BlockWeDo wedoBlock;
	}

	// block IDs
	public static int blockID;

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.load();
	}
	public String getVersion() {
		return "0.1";
	}
}