package ironfurnaces.tileentity;

import ironfurnaces.config.DiamondFurnaceConfig;
import ironfurnaces.container.ContainerIronFurnace;
import ironfurnaces.gui.GuiIronFurnaceBase;
import ironfurnaces.init.ModBlocks;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;

public class TileEntityDiamondFurnace extends TileEntityIronFurnaceBase {
    public TileEntityDiamondFurnace() {
        super(ModBlocks.DIAMOND_FURNACE);
    }

    @Override
    protected int getCookTime() {
        return DiamondFurnaceConfig.SPEED.get();
    }

    @Override
    public String IgetGuiID() {
        return "ironfurnaces:diamond_furnace";
    }

    @Override
    public String IgetName() {
        return "container.diamond_furnace";
    }

    @Override
    public GuiContainer IcreateGui(InventoryPlayer playerInventory, TileEntity te) {
        return new GuiIronFurnaceBase(playerInventory,  (TileEntityDiamondFurnace) te);
    }

    @Override
    public Container IcreateContainer(InventoryPlayer playerInventory, TileEntity te) {
        return new ContainerIronFurnace(playerInventory, (TileEntityIronFurnaceBase) te);
    }
}