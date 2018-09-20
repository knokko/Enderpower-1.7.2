package enderpower.backups;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;

public class ManaBackup extends WorldSavedData{

	private int mana;
	private int geemana;
	private int fiemana;
	private int doumana;
	private int endermana;
	private static final String IDENTIFIER = "enderpower";

	public ManaBackup(String identifier) {
		super(identifier);
		
	}
	public ManaBackup(){
		super(IDENTIFIER);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		setMana(nbt.getInteger("mana"));
		setMana(nbt.getInteger("geemana"));
		setMana(nbt.getInteger("fiemana"));
		setMana(nbt.getInteger("doumana"));
		setMana(nbt.getInteger("endermana"));
		
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("mana", getMana());
		nbt.setInteger("geemana", getGeeMana());
		nbt.setInteger("fiemana", getFieMana());
		nbt.setInteger("doumana", getDouMana());
		nbt.setInteger("endermana", getEnderMana());
		
	}
	
	public int getEnderMana() {
		return this.endermana;
	}
	public int getDouMana() {
		return this.doumana;
	}
	public int requestNewId() {
		markDirty();
		return mana++;
	}
	
	public static ManaBackup get(World world) {
		ManaBackup data = (ManaBackup)world.loadItemData(ManaBackup.class, IDENTIFIER);
		if (data == null) {
			data = new ManaBackup();
			world.setItemData(IDENTIFIER, data);
		}
		return data;
	}
	public int getGeeMana(){
		return this.geemana;
	}
	
	public int getMana() {
		return this.mana;
	}
	public int getFieMana(){
		return this.fiemana;
	}
	
	public void setMana(int mana) {
		this.mana = mana;
		this.markDirty();
	}
	public void setGeeMana(int geemana){
		this.geemana = geemana;
		this.markDirty();
	}
	public void setFieMana(int fiemana){
		this.fiemana = fiemana;
		this.markDirty();
	}
	public void setDouMana(int doumana){
		this.doumana = doumana;
		this.markDirty();
	}
	public void setEnderMana(int endermana){
		this.endermana = endermana;
		this.markDirty();
	}

}
