package StevenDimDoors.mod_pocketDim.tileentities;

import StevenDimDoors.mod_pocketDim.mod_pocketDim;
import StevenDimDoors.mod_pocketDim.core.PocketManager;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityDimDoor extends TileEntity

{
	public boolean openOrClosed;
	public int orientation;
	public boolean hasExit;
	public boolean isDungeonChainLink;
	public boolean hasGennedPair=false;
	
	
	
	
	
	 public boolean canUpdate()
	 {
		 return false;
	 }
	 
	 public void updateEntity() 
	 {
     	

	 }
	 
	 @Override
	    public void readFromNBT(NBTTagCompound nbt)
	    {
	        super.readFromNBT(nbt);
	        int i = nbt.getInteger(("Size"));

	        try
	        {
	            this.openOrClosed = nbt.getBoolean("openOrClosed");
	            
	            this.orientation = nbt.getInteger("orientation");
	            
	            this.hasExit = nbt.getBoolean("hasExit");
	            
	            this.isDungeonChainLink = nbt.getBoolean("isDungeonChainLink");

	            this.hasGennedPair = nbt.getBoolean("hasGennedPair");

	          

	           

	        }
	        catch (Exception e)
	        {
	            
	        }
	    }

	    @Override
	    public void writeToNBT(NBTTagCompound nbt)
	    {
	        int i = 0;
	        super.writeToNBT(nbt);
	        nbt.setBoolean("openOrClosed", this.openOrClosed);
	        
	        nbt.setBoolean("hasExit", this.hasExit);

	       	nbt.setInteger("orientation", this.orientation);
	       	
	       	nbt.setBoolean("isDungeonChainLink", isDungeonChainLink);

	       	nbt.setBoolean("hasGennedPair", hasGennedPair);
   
	    }
}
