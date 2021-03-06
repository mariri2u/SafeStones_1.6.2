package mariri.safestones;


import java.util.List;

import net.minecraft.block.BlockStoneBrick;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSafeColorStone extends BlockStoneBrick implements IBlockSafeStone{
	
	@SideOnly(Side.CLIENT)
	protected Icon[] icons;

	protected String unlocalizedName;
	
	protected BlockSafeColorStone(){
		super(SafeStones.BLOCK_SAFE_COLOR_STONE_ID);
		setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundStoneFootstep);
		this.setHardness(2.0F);
		this.setResistance(2000.0F);
    	this.icons = new Icon[16];
    	this.unlocalizedName = "safeColorStone";

//		setBlockName(unlocalizedName);
        GameRegistry.registerBlock(this, ItemBlockSafeStone.class, unlocalizedName);
   
        registerRecipe();
        registerOreDictionary();
    }
    
	private void registerRecipe(){
		// black
		// cobblestone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 0),
        		"XXX", "XYX", "XXX",
        		'X', "cobblestone",
        		'Y', new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE)
        	));

        // stone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 1),
        		"XXX", "XYX", "XXX",
        		'X', "stone",
        		'Y', new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE)
        	));
        
        FurnaceRecipes.smelting().addSmelting(this.blockID, 0, new ItemStack(this, 1, 1), 0);
        
        // stonebrick
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 2),
        		"XXX", "XYX", "XXX",
        		'X', "stonebrick",
        		'Y', new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE)
        	));

        GameRegistry.addRecipe( new ItemStack(this, 4, 2),
        	new Object[] { "XX", "XX",
        		'X', new ItemStack(this, 1, 1)
        	});

        // smoothstone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 3),
        		"XXX", "XYX", "XXX",
        		'X', "smoothstone",
        		'Y', new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE)
        	));

        
        GameRegistry.addRecipe( new ItemStack(this, 4, 3),
        	new Object[] { "XX", "XX",
        		'X', new ItemStack(this, 1, 2)
        	});
		
		// red
		// cobblestone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 4),
        		"XXX", "XYX", "XXX",
        		'X', "cobblestone",
        		'Y', new ItemStack(Item.redstone)
        	));

        // stone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 5),
        		"XXX", "XYX", "XXX",
        		'X', "stone",
        		'Y', new ItemStack(Item.redstone)
        	));
        
        FurnaceRecipes.smelting().addSmelting(this.blockID, 4, new ItemStack(this, 1, 5), 0);
        
        // stonebrick
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 6),
        		"XXX", "XYX", "XXX",
        		'X', "stonebrick",
        		'Y', new ItemStack(Item.redstone)
        	));

        GameRegistry.addRecipe( new ItemStack(this, 4, 6),
        	new Object[] { "XX", "XX",
        		'X', new ItemStack(this, 1, 5)
        	});

        // smoothstone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 7),
        		"XXX", "XYX", "XXX",
        		'X', "smoothstone",
        		'Y', new ItemStack(Item.redstone)
        	));

        GameRegistry.addRecipe( new ItemStack(this, 4, 7),
        	new Object[] { "XX", "XX",
				'X', new ItemStack(this, 1, 6)
        	});
		
		// blue
		// cobblestone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 8),
        		"XXX", "XYX", "XXX",
        		'X', "cobblestone",
        		'Y', new ItemStack(Item.dyePowder, 1, 4)
        	));

        // stone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 9),
        		"XXX", "XYX", "XXX",
        		'X', "stone",
        		'Y', new ItemStack(Item.dyePowder, 1, 4)
        	));
        
        FurnaceRecipes.smelting().addSmelting(this.blockID ,8, new ItemStack(this, 1, 9), 0);
        
        // stonebrick
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 10),
        		"XXX", "XYX", "XXX",
        		'X', "stonebrick",
        		'Y', new ItemStack(Item.dyePowder, 1, 4)
        	));

        GameRegistry.addRecipe( new ItemStack(this, 4, 10),
        	new Object[] { "XX", "XX",
        		'X', new ItemStack(this, 1, 9)
        	});

        // smoothstone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 11),
        		"XXX", "XYX", "XXX",
        		'X', "smoothstone",
        		'Y', new ItemStack(Item.dyePowder, 1, 4)
        	));
        
        GameRegistry.addRecipe( new ItemStack(this, 4, 11),
        	new Object[] { "XX", "XX",
        		'X', new ItemStack(this, 1, 10)
        	});
        
		// white
		// cobblestone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 12),
        		"XXX", "XYX", "XXX",
        		'X', "cobblestone",
        		'Y', new ItemStack(Item.netherQuartz)
        	));

        // stone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 13),
        		"XXX", "XYX", "XXX",
        		'X', "stone",
        		'Y', new ItemStack(Item.netherQuartz)
        	));
        
        FurnaceRecipes.smelting().addSmelting(this.blockID, 12, new ItemStack(this, 1, 13), 0);
        
        // stonebrick
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 14),
        		"XXX", "XYX", "XXX",
        		'X', "stonebrick",
        		'Y', new ItemStack(Item.netherQuartz)
        	));

        GameRegistry.addRecipe( new ItemStack(this, 4, 14),
        	new Object[] { "XX", "XX",
        		'X', new ItemStack(this, 1, 13)
        	});

        // smoothstone
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack(this, 8, 15),
        		"XXX", "XYX", "XXX",
        		'X', "smoothstone",
        		'Y', new ItemStack(Item.netherQuartz)
        	));

        GameRegistry.addRecipe( new ItemStack(this, 4, 15),
        	new Object[] { "XX", "XX",
        		'X', new ItemStack(this, 1, 14)
        	});
	}
	
	private void registerOreDictionary(){
        OreDictionary.registerOre("cobblestone", new ItemStack(this, 1, 0));
        OreDictionary.registerOre("stone", new ItemStack(this, 1, 1));
        OreDictionary.registerOre("stonebrick", new ItemStack(this, 1, 2));
        OreDictionary.registerOre("smoothstone", new ItemStack(this, 1, 3));
        OreDictionary.registerOre("cobblestone", new ItemStack(this, 1, 4));
        OreDictionary.registerOre("stone", new ItemStack(this, 1, 5));
        OreDictionary.registerOre("stonebrick", new ItemStack(this, 1, 6));
        OreDictionary.registerOre("smoothstone", new ItemStack(this, 1, 7));
        OreDictionary.registerOre("cobblestone", new ItemStack(this, 1, 8));
        OreDictionary.registerOre("stone", new ItemStack(this, 1, 9));
        OreDictionary.registerOre("stonebrick", new ItemStack(this, 1, 10));
        OreDictionary.registerOre("smoothstone", new ItemStack(this, 1, 11));
        OreDictionary.registerOre("cobblestone", new ItemStack(this, 1, 12));
        OreDictionary.registerOre("stone", new ItemStack(this, 1, 13));
        OreDictionary.registerOre("stonebrick", new ItemStack(this, 1, 14));
        OreDictionary.registerOre("smoothstone", new ItemStack(this, 1, 15));
	}
	
    @Override
    public int damageDropped(int meta){
    	if(meta % 4 == 1){
    		return meta - 1;
    	}else{
    		return meta;
    	}
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        this.icons[0] = iconRegister.registerIcon("mariri:black_cobblestone");
        this.icons[1] = iconRegister.registerIcon("mariri:black_stone");
        this.icons[2] = iconRegister.registerIcon("mariri:black_stonebrick");
        this.icons[3] = iconRegister.registerIcon("mariri:black_smoothstone");
        this.icons[4] = iconRegister.registerIcon("mariri:red_cobblestone");
        this.icons[5] = iconRegister.registerIcon("mariri:red_stone");
        this.icons[6] = iconRegister.registerIcon("mariri:red_stonebrick");
        this.icons[7] = iconRegister.registerIcon("mariri:red_smoothstone");
        this.icons[8] = iconRegister.registerIcon("mariri:blue_cobblestone");
        this.icons[9] = iconRegister.registerIcon("mariri:blue_stone");
        this.icons[10] = iconRegister.registerIcon("mariri:blue_stonebrick");
        this.icons[11] = iconRegister.registerIcon("mariri:blue_smoothstone");
        this.icons[12] = iconRegister.registerIcon("mariri:white_cobblestone");
        this.icons[13] = iconRegister.registerIcon("mariri:white_stone");
        this.icons[14] = iconRegister.registerIcon("mariri:white_stonebrick");
        this.icons[15] = iconRegister.registerIcon("mariri:white_smoothstone");
    }
    
    public String getUnlocalizedName(int meta){
    	return "tile."+ unlocalizedName + "." + meta;
    }
    
	@Override
    public boolean canCreatureSpawn(EnumCreatureType type, World world, int x, int y, int z){
    	return false;
    }
	
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta){
    	if(meta < icons.length){
    		return icons[meta];
    	}else{
    		return icons[0];
    	}
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int id, CreativeTabs tab, List list){
    	for(int i = 0; i < icons.length; i++){
    		list.add(new ItemStack(id, 1, i));
    	}
    }
}
