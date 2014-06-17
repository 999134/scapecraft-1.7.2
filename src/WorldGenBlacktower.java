package net.minecraft.src;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
public class WorldGenBlacktower extends WorldGenerator
{
public WorldGenBlacktower()
{
}
public boolean generate(World world, Random random, int i, int j, int k)
{

	if(world.getBlockId(i, j - 1, k) == Block.grass.blockID && world.getBlockId(i, j, k) == 0){
	

	int Mainblock = Block.obsidian.blockID;
	int lava = Block.lavaMoving.blockID;
	int stone = Block.stone.blockID;
	int Darkwizardspawner = mod_BlocksGalore.DARKWIZARDSpawn.blockID;
	int Diamond = Block.oreDiamond.blockID;
	int BlackSpawner = mod_BlocksGalore.BLKSpawn.blockID;
	int Lightningrod = You_Must_Update_Scapecraft.LightningRod.blockID;
	int HellhoundSpawner = mod_BlocksGalore.HellhoundSpawn.blockID;
	
//layer 1
world.setBlock(i, j, k, Mainblock);
world.setBlock(i+1, j, k, Mainblock);
world.setBlock(i, j, k+1, Mainblock);
world.setBlock(i, j, k-1, Mainblock);
world.setBlock(i-1, j, k, Mainblock);
world.setBlock(i-1, j, k-1, Mainblock);
world.setBlock(i+1, j, k-1, Mainblock);
world.setBlock(i+1, j, k+1, Mainblock);
world.setBlock(i-1, j, k+1, Mainblock);
world.setBlock(i+2, j, k, Mainblock);
world.setBlock(i, j, k+2, Mainblock);
world.setBlock(i, j, k-2, Mainblock);
world.setBlock(i-2, j, k, Mainblock);
world.setBlock(i-2, j, k-2, Mainblock);
world.setBlock(i+2, j, k-2, Mainblock);
world.setBlock(i+2, j, k+2, Mainblock);
world.setBlock(i-2, j, k+2, Mainblock);
world.setBlock(i+2, j, k+1, Mainblock);
world.setBlock(i+2, j, k-1, Mainblock);
world.setBlock(i-2, j, k+1, Mainblock);
world.setBlock(i-2, j, k-1, Mainblock);
world.setBlock(i+1, j, k+2, Mainblock);
world.setBlock(i+1, j, k-2, Mainblock);
world.setBlock(i-1, j, k+2, Mainblock);
world.setBlock(i-1, j, k-2, Mainblock);
world.setBlock(i+3, j, k, Mainblock);
world.setBlock(i+3, j, k, Mainblock);
world.setBlock(i+3, j, k+1, Mainblock);
world.setBlock(i+3, j, k-1, Mainblock);
world.setBlock(i+3, j, k+2, Mainblock);
world.setBlock(i+3, j, k-2, Mainblock);
world.setBlock(i+3, j, k+3, Mainblock);
world.setBlock(i+3, j, k-3, Mainblock);
world.setBlock(i-3, j, k, Mainblock);
world.setBlock(i-3, j, k+1, Mainblock);
world.setBlock(i-3, j, k-1, Mainblock);
world.setBlock(i-3, j, k+2, Mainblock);
world.setBlock(i-3, j, k-2, Mainblock);
world.setBlock(i-3, j, k-3, Mainblock);
world.setBlock(i-3, j, k+3, Mainblock);
world.setBlock(i, j, k+3, Mainblock);
world.setBlock(i+1, j, k+3, Mainblock);
world.setBlock(i-1, j, k+3, Mainblock);
world.setBlock(i+2, j, k+3, Mainblock);
world.setBlock(i-2, j, k+3, Mainblock);
world.setBlock(i, j, k-3, Mainblock);
world.setBlock(i+1, j, k-3, Mainblock);
world.setBlock(i-1, j, k-3, Mainblock);
world.setBlock(i+2, j, k-3, Mainblock);
world.setBlock(i-2, j, k-3, Mainblock);
world.setBlock(i-2, j, k-6, BlackSpawner);
world.setBlock(i-3, j, k-7, BlackSpawner);
world.setBlock(i-2, j, k-7, BlackSpawner);
world.setBlock(i-1, j, k-7, HellhoundSpawner);

//layer 2

world.setBlock(i, j+1, k, lava);
world.setBlock(i+1, j+1, k, lava);
world.setBlock(i, j+1, k+1, lava);
world.setBlock(i, j+1, k-1, lava);
world.setBlock(i-1, j+1, k, lava);
world.setBlock(i-1, j+1, k-1, lava);
world.setBlock(i+1, j+1, k-1, lava);
world.setBlock(i+1, j+1, k+1, lava);
world.setBlock(i-1, j+1, k+1, lava);
world.setBlock(i+2, j+1, k, Mainblock);
world.setBlock(i, j+1, k+2, Mainblock);
world.setBlock(i, j+1, k-2, Mainblock);
world.setBlock(i-2, j+1, k, BlackSpawner);
world.setBlock(i-2, j+1, k-2, Mainblock);
world.setBlock(i+2, j+1, k-2, Mainblock);
world.setBlock(i+2, j+1, k+2, Mainblock);
world.setBlock(i-2, j+1, k+2, Mainblock);
world.setBlock(i+2, j+1, k+1, Mainblock);
world.setBlock(i+2, j+1, k-1, Mainblock);
world.setBlock(i-2, j+1, k+1, Mainblock);
world.setBlock(i-2, j+1, k-1, Mainblock);
world.setBlock(i+1, j+1, k+2, Mainblock);
world.setBlock(i+1, j+1, k-2, Mainblock);
world.setBlock(i-1, j+1, k+2, Mainblock);
world.setBlock(i-1, j+1, k-2, Mainblock);
world.setBlock(i+3, j+1, k, Mainblock);
world.setBlock(i+3, j+1, k, Mainblock);
world.setBlock(i+3, j+1, k+1, Mainblock);
world.setBlock(i+3, j+1, k-1, Mainblock);
world.setBlock(i+3, j+1, k+2, Mainblock);
world.setBlock(i+3, j+1, k-2, Mainblock);
world.setBlock(i+3, j+1, k+3, Mainblock);
world.setBlock(i+3, j+1, k-3, Mainblock);
world.setBlock(i-3, j+1, k, Mainblock);
world.setBlock(i-3, j+1, k+1, Mainblock);
world.setBlock(i-3, j+1, k-1, Mainblock);
world.setBlock(i-3, j+1, k+2, Mainblock);
world.setBlock(i-3, j+1, k-2, Mainblock);
world.setBlock(i-3, j+1, k-3, Mainblock);
world.setBlock(i-3, j+1, k+3, Mainblock);
world.setBlock(i, j+1, k+3, Mainblock);
world.setBlock(i+1, j+1, k+3, Mainblock);
world.setBlock(i-1, j+1, k+3, Mainblock);
world.setBlock(i+2, j+1, k+3, Mainblock);
world.setBlock(i-2, j+1, k+3, Mainblock);
world.setBlock(i, j+1, k-3, Mainblock);
world.setBlock(i+1, j+1, k-3, Mainblock);
world.setBlock(i-1, j+1, k-3, Mainblock);
world.setBlock(i+2, j+1, k-3, Mainblock);
world.setBlock(i-2, j+1, k-3, Mainblock);

//layer3
world.setBlock(i+2, j+2, k+2, Mainblock);
//world.setBlock(i+3, j+2, k, Mainblock);
//world.setBlock(i+3, j+2, k+1, Mainblock);
//world.setBlock(i+3, j+2, k-1, Mainblock);
world.setBlock(i+3, j+2, k+2, Mainblock);
world.setBlock(i+3, j+2, k-2, Mainblock);
world.setBlock(i+3, j+2, k+3, Mainblock);
world.setBlock(i+3, j+2, k-3, Mainblock);
world.setBlock(i-3, j+2, k, Mainblock);
world.setBlock(i-3, j+2, k+1, Mainblock);
world.setBlock(i-3, j+2, k-1, Mainblock);
world.setBlock(i-3, j+2, k+2, Mainblock);
world.setBlock(i-3, j+2, k-2, Mainblock);
world.setBlock(i-3, j+2, k-3, Mainblock);
world.setBlock(i-3, j+2, k+3, Mainblock);
world.setBlock(i, j+2, k+3, Mainblock);
world.setBlock(i+1, j+2, k+3, Mainblock);
world.setBlock(i-1, j+2, k+3, Mainblock);
world.setBlock(i+2, j+2, k+3, Mainblock);
world.setBlock(i-2, j+2, k+3, Mainblock);
world.setBlock(i, j+2, k-3, Mainblock);
world.setBlock(i+1, j+2, k-3, Mainblock);
world.setBlock(i-1, j+2, k-3, Mainblock);
world.setBlock(i+2, j+2, k-3, Mainblock);
world.setBlock(i-2, j+2, k-3, Mainblock);

//layer4
world.setBlock(i+1, j+3, k+2, Mainblock);
//world.setBlock(i+3, j+3, k, Mainblock);
//world.setBlock(i+3, j+3, k+1, Mainblock);
//world.setBlock(i+3, j+3, k-1, Mainblock);
world.setBlock(i+3, j+3, k+2, Mainblock);
world.setBlock(i+3, j+3, k-2, Mainblock);
world.setBlock(i+3, j+3, k+3, Mainblock);
world.setBlock(i+3, j+3, k-3, Mainblock);
world.setBlock(i-3, j+3, k, Mainblock);
world.setBlock(i-3, j+3, k+1, Mainblock);
world.setBlock(i-3, j+3, k-1, Mainblock);
world.setBlock(i-3, j+3, k+2, Mainblock);
world.setBlock(i-3, j+3, k-2, Mainblock);
world.setBlock(i-3, j+3, k-3, Mainblock);
world.setBlock(i-3, j+3, k+3, Mainblock);
world.setBlock(i, j+3, k+3, Mainblock);
world.setBlock(i+1, j+3, k+3, Mainblock);
world.setBlock(i-1, j+3, k+3, Mainblock);
world.setBlock(i+2, j+3, k+3, Mainblock);
world.setBlock(i-2, j+3, k+3, Mainblock);
world.setBlock(i, j+3, k-3, Mainblock);
world.setBlock(i+1, j+3, k-3, Mainblock);
world.setBlock(i-1, j+3, k-3, Mainblock);
world.setBlock(i+2, j+3, k-3, Mainblock);
world.setBlock(i-2, j+3, k-3, Mainblock);

//layer5
world.setBlock(i, j+4, k+2, Mainblock);
//world.setBlock(i+3, j+4, k, Mainblock);
//world.setBlock(i+3, j+4, k+1, Mainblock);
//world.setBlock(i+3, j+4, k-1, Mainblock);
world.setBlock(i+3, j+4, k+2, Mainblock);
world.setBlock(i+3, j+4, k-2, Mainblock);
world.setBlock(i+3, j+4, k+3, Mainblock);
world.setBlock(i+3, j+4, k-3, Mainblock);
world.setBlock(i-3, j+4, k, Mainblock);
world.setBlock(i-3, j+4, k+1, Mainblock);
world.setBlock(i-3, j+4, k-1, Mainblock);
world.setBlock(i-3, j+4, k+2, Mainblock);
world.setBlock(i-3, j+4, k-2, Mainblock);
world.setBlock(i-3, j+4, k-3, Mainblock);
world.setBlock(i-3, j+4, k+3, Mainblock);
world.setBlock(i, j+4, k+3, Mainblock);
world.setBlock(i+1, j+4, k+3, Mainblock);
world.setBlock(i-1, j+4, k+3, Mainblock);
world.setBlock(i+2, j+4, k+3, Mainblock);
world.setBlock(i-2, j+4, k+3, Mainblock);
world.setBlock(i, j+4, k-3, Mainblock);
world.setBlock(i+1, j+4, k-3, Mainblock);
world.setBlock(i-1, j+4, k-3, Mainblock);
world.setBlock(i+2, j+4, k-3, Mainblock);
world.setBlock(i-2, j+4, k-3, Mainblock);

//layer6
world.setBlock(i-1, j+5, k+2, Mainblock);
//world.setBlock(i+3, j+5, k, Mainblock);
//world.setBlock(i+3, j+5, k+1, Mainblock);
//world.setBlock(i+3, j+5, k-1, Mainblock);
world.setBlock(i+3, j+5, k+2, Mainblock);
world.setBlock(i+3, j+5, k-2, Mainblock);
world.setBlock(i+3, j+5, k+3, Mainblock);
world.setBlock(i+3, j+5, k-3, Mainblock);
world.setBlock(i-3, j+5, k, Mainblock);
world.setBlock(i-3, j+5, k+1, Mainblock);
world.setBlock(i-3, j+5, k-1, Mainblock);
world.setBlock(i-3, j+5, k+2, Mainblock);
world.setBlock(i-3, j+5, k-2, Mainblock);
world.setBlock(i-3, j+5, k-3, Mainblock);
world.setBlock(i-3, j+5, k+3, Mainblock);
world.setBlock(i, j+5, k+3, Mainblock);
world.setBlock(i+1, j+5, k+3, Mainblock);
world.setBlock(i-1, j+5, k+3, Mainblock);
world.setBlock(i+2, j+5, k+3, Mainblock);
world.setBlock(i-2, j+5, k+3, Mainblock);
world.setBlock(i, j+5, k-3, Mainblock);
world.setBlock(i+1, j+5, k-3, Mainblock);
world.setBlock(i-1, j+5, k-3, Mainblock);
world.setBlock(i+2, j+5, k-3, Mainblock);
world.setBlock(i-2, j+5, k-3, Mainblock);

//layer7
world.setBlock(i-2, j+6, k+2, Mainblock);
world.setBlock(i+3, j+6, k, Mainblock);
world.setBlock(i+3, j+6, k, Mainblock);
world.setBlock(i+3, j+6, k+1, Mainblock);
world.setBlock(i+3, j+6, k-1, Mainblock);
world.setBlock(i+3, j+6, k+2, Mainblock);
world.setBlock(i+3, j+6, k-2, Mainblock);
world.setBlock(i+3, j+6, k+3, Mainblock);
world.setBlock(i+3, j+6, k-3, Mainblock);
world.setBlock(i-3, j+6, k, Mainblock);
world.setBlock(i-3, j+6, k+1, Mainblock);
world.setBlock(i-3, j+6, k-1, Mainblock);
world.setBlock(i-3, j+6, k+2, Mainblock);
world.setBlock(i-3, j+6, k-2, Mainblock);
world.setBlock(i-3, j+6, k-3, Mainblock);
world.setBlock(i-3, j+6, k+3, Mainblock);
world.setBlock(i, j+6, k+3, Mainblock);
world.setBlock(i+1, j+6, k+3, Mainblock);
world.setBlock(i-1, j+6, k+3, Mainblock);
world.setBlock(i+2, j+6, k+3, Mainblock);
world.setBlock(i-2, j+6, k+3, Mainblock);
world.setBlock(i, j+6, k-3, Mainblock);
world.setBlock(i+1, j+6, k-3, Mainblock);
world.setBlock(i-1, j+6, k-3, Mainblock);
world.setBlock(i+2, j+6, k-3, Mainblock);
world.setBlock(i-2, j+6, k-3, Mainblock);
//layer8
world.setBlock(i-2, j+7, k+1, Mainblock);
world.setBlock(i+3, j+7, k, Mainblock);
world.setBlock(i+3, j+7, k, Mainblock);
world.setBlock(i+3, j+7, k+1, Mainblock);
world.setBlock(i+3, j+7, k-1, Mainblock);
world.setBlock(i+3, j+7, k+2, Mainblock);
world.setBlock(i+3, j+7, k-2, Mainblock);
world.setBlock(i+3, j+7, k+3, Mainblock);
world.setBlock(i+3, j+7, k-3, Mainblock);
world.setBlock(i-3, j+7, k, Mainblock);
world.setBlock(i-3, j+7, k+1, Mainblock);
world.setBlock(i-3, j+7, k-1, Mainblock);
world.setBlock(i-3, j+7, k+2, Mainblock);
world.setBlock(i-3, j+7, k-2, Mainblock);
world.setBlock(i-3, j+7, k-3, Mainblock);
world.setBlock(i-3, j+7, k+3, Mainblock);
world.setBlock(i, j+7, k+3, Mainblock);
world.setBlock(i+1, j+7, k+3, Mainblock);
world.setBlock(i-1, j+7, k+3, Mainblock);
world.setBlock(i+2, j+7, k+3, Mainblock);
world.setBlock(i-2, j+7, k+3, Mainblock);
world.setBlock(i, j+7, k-3, Mainblock);
world.setBlock(i+1, j+7, k-3, Mainblock);
world.setBlock(i-1, j+7, k-3, Mainblock);
world.setBlock(i+2, j+7, k-3, Mainblock);
world.setBlock(i-2, j+7, k-3, Mainblock);
//layer9
world.setBlock(i-2, j+8, k, Mainblock);
world.setBlock(i+3, j+8, k, Mainblock);
world.setBlock(i+3, j+8, k, Mainblock);
world.setBlock(i+3, j+8, k+1, Mainblock);
world.setBlock(i+3, j+8, k-1, Mainblock);
world.setBlock(i+3, j+8, k+2, Mainblock);
world.setBlock(i+3, j+8, k-2, Mainblock);
world.setBlock(i+3, j+8, k+3, Mainblock);
world.setBlock(i+3, j+8, k-3, Mainblock);
world.setBlock(i-3, j+8, k, Mainblock);
world.setBlock(i-3, j+8, k+1, Mainblock);
world.setBlock(i-3, j+8, k-1, Mainblock);
world.setBlock(i-3, j+8, k+2, Mainblock);
world.setBlock(i-3, j+8, k-2, Mainblock);
world.setBlock(i-3, j+8, k-3, Mainblock);
world.setBlock(i-3, j+8, k+3, Mainblock);
world.setBlock(i, j+8, k+3, Mainblock);
world.setBlock(i+1, j+8, k+3, Mainblock);
world.setBlock(i-1, j+8, k+3, Mainblock);
world.setBlock(i+2, j+8, k+3, Mainblock);
world.setBlock(i-2, j+8, k+3, Mainblock);
world.setBlock(i, j+8, k-3, Mainblock);
world.setBlock(i+1, j+8, k-3, Mainblock);
world.setBlock(i-1, j+8, k-3, Mainblock);
world.setBlock(i+2, j+8, k-3, Mainblock);
world.setBlock(i-2, j+8, k-3, Mainblock);
//layer10
world.setBlock(i-2, j+9, k-1, Mainblock);
world.setBlock(i+3, j+9, k, Mainblock);
world.setBlock(i+3, j+9, k, Mainblock);
world.setBlock(i+3, j+9, k+1, Mainblock);
world.setBlock(i+3, j+9, k-1, Mainblock);
world.setBlock(i+3, j+9, k+2, Mainblock);
world.setBlock(i+3, j+9, k-2, Mainblock);
world.setBlock(i+3, j+9, k+3, Mainblock);
world.setBlock(i+3, j+9, k-3, Mainblock);
world.setBlock(i-3, j+9, k, Mainblock);
world.setBlock(i-3, j+9, k+1, Mainblock);
world.setBlock(i-3, j+9, k-1, Mainblock);
world.setBlock(i-3, j+9, k+2, Mainblock);
world.setBlock(i-3, j+9, k-2, Mainblock);
world.setBlock(i-3, j+9, k-3, Mainblock);
world.setBlock(i-3, j+9, k+3, Mainblock);
world.setBlock(i, j+9, k+3, Mainblock);
world.setBlock(i+1, j+9, k+3, Mainblock);
world.setBlock(i-1, j+9, k+3, Mainblock);
world.setBlock(i+2, j+9, k+3, Mainblock);
world.setBlock(i-2, j+9, k+3, Mainblock);
world.setBlock(i, j+9, k-3, Mainblock);
world.setBlock(i+1, j+9, k-3, Mainblock);
world.setBlock(i-1, j+9, k-3, Mainblock);
world.setBlock(i+2, j+9, k-3, Mainblock);
world.setBlock(i-2, j+9, k-3, Mainblock);
//layer11
world.setBlock(i-2, j+10, k-2, Mainblock);
world.setBlock(i+3, j+10, k, Mainblock);
world.setBlock(i+3, j+10, k, Mainblock);
world.setBlock(i+3, j+10, k+1, Mainblock);
world.setBlock(i+3, j+10, k-1, Mainblock);
world.setBlock(i+3, j+10, k+2, Mainblock);
world.setBlock(i+3, j+10, k-2, Mainblock);
world.setBlock(i+3, j+10, k+3, Mainblock);
world.setBlock(i+3, j+10, k-3, Mainblock);
world.setBlock(i-3, j+10, k, Mainblock);
world.setBlock(i-3, j+10, k+1, Mainblock);
world.setBlock(i-3, j+10, k-1, Mainblock);
world.setBlock(i-3, j+10, k+2, Mainblock);
world.setBlock(i-3, j+10, k-2, Mainblock);
world.setBlock(i-3, j+10, k-3, Mainblock);
world.setBlock(i-3, j+10, k+3, Mainblock);
world.setBlock(i, j+10, k+3, Mainblock);
world.setBlock(i+1, j+10, k+3, Mainblock);
world.setBlock(i-1, j+10, k+3, Mainblock);
world.setBlock(i+2, j+10, k+3, Mainblock);
world.setBlock(i-2, j+10, k+3, Mainblock);
world.setBlock(i, j+10, k-3, Mainblock);
world.setBlock(i+1, j+10, k-3, Mainblock);
world.setBlock(i-1, j+10, k-3, Mainblock);
world.setBlock(i+2, j+10, k-3, Mainblock);
world.setBlock(i-2, j+10, k-3, Mainblock);
//layer12
world.setBlock(i-1, j+11, k-2, Mainblock);
world.setBlock(i+3, j+11, k, Mainblock);
world.setBlock(i+3, j+11, k, Mainblock);
world.setBlock(i+3, j+11, k+1, Mainblock);
world.setBlock(i+3, j+11, k-1, Mainblock);
world.setBlock(i+3, j+11, k+2, Mainblock);
world.setBlock(i+3, j+11, k-2, Mainblock);
world.setBlock(i+3, j+11, k+3, Mainblock);
world.setBlock(i+3, j+11, k-3, Mainblock);
world.setBlock(i-3, j+11, k, Mainblock);
world.setBlock(i-3, j+11, k+1, Mainblock);
world.setBlock(i-3, j+11, k-1, Mainblock);
world.setBlock(i-3, j+11, k+2, Mainblock);
world.setBlock(i-3, j+11, k-2, Mainblock);
world.setBlock(i-3, j+11, k-3, Mainblock);
world.setBlock(i-3, j+11, k+3, Mainblock);
world.setBlock(i, j+11, k+3, Mainblock);
world.setBlock(i+1, j+11, k+3, Mainblock);
world.setBlock(i-1, j+11, k+3, Mainblock);
world.setBlock(i+2, j+11, k+3, Mainblock);
world.setBlock(i-2, j+11, k+3, Mainblock);
world.setBlock(i, j+11, k-3, Mainblock);
world.setBlock(i+1, j+11, k-3, Mainblock);
world.setBlock(i-1, j+11, k-3, Mainblock);
world.setBlock(i+2, j+11, k-3, Mainblock);
world.setBlock(i-2, j+11, k-3, Mainblock);
//layer13
world.setBlock(i, j+12, k-2, Mainblock);
world.setBlock(i+3, j+12, k, Mainblock);
world.setBlock(i+3, j+12, k, Mainblock);
world.setBlock(i+3, j+12, k+1, Mainblock);
world.setBlock(i+3, j+12, k-1, Mainblock);
world.setBlock(i+3, j+12, k+2, Mainblock);
world.setBlock(i+3, j+12, k-2, Mainblock);
world.setBlock(i+3, j+12, k+3, Mainblock);
world.setBlock(i+3, j+12, k-3, Mainblock);
world.setBlock(i-3, j+12, k, Mainblock);
world.setBlock(i-3, j+12, k+1, Mainblock);
world.setBlock(i-3, j+12, k-1, Mainblock);
world.setBlock(i-3, j+12, k+2, Mainblock);
world.setBlock(i-3, j+12, k-2, Mainblock);
world.setBlock(i-3, j+12, k-3, Mainblock);
world.setBlock(i-3, j+12, k+3, Mainblock);
world.setBlock(i, j+12, k+3, Mainblock);
world.setBlock(i+1, j+12, k+3, Mainblock);
world.setBlock(i-1, j+12, k+3, Mainblock);
world.setBlock(i+2, j+12, k+3, Mainblock);
world.setBlock(i-2, j+12, k+3, Mainblock);
world.setBlock(i, j+12, k-3, Mainblock);
world.setBlock(i+1, j+12, k-3, Mainblock);
world.setBlock(i-1, j+12, k-3, Mainblock);
world.setBlock(i+2, j+12, k-3, Mainblock);
world.setBlock(i-2, j+12, k-3, Mainblock);
//layer14
world.setBlock(i, j+13, k, stone);
world.setBlock(i+1, j+13, k, stone);
world.setBlock(i, j+13, k+1, stone);
world.setBlock(i, j+13, k-1, stone);
world.setBlock(i-1, j+13, k, stone);
world.setBlock(i-1, j+13, k-1, Darkwizardspawner);
world.setBlock(i+1, j+13, k-1, Darkwizardspawner);
world.setBlock(i+1, j+13, k+1, Darkwizardspawner);
world.setBlock(i-1, j+13, k+1, Darkwizardspawner);
world.setBlock(i+2, j+13, k, stone);
world.setBlock(i, j+13, k+2, stone);
//world.setBlock(i, j+13, k-2, stone);
world.setBlock(i-2, j+13, k, stone);
//world.setBlock(i-2, j+13, k-2, stone);
world.setBlock(i+2, j+13, k-2, stone);
world.setBlock(i+2, j+13, k+2, stone);
world.setBlock(i-2, j+13, k+2, stone);
world.setBlock(i+2, j+13, k+1, stone);
world.setBlock(i+2, j+13, k-1, stone);
world.setBlock(i-2, j+13, k+1, stone);
world.setBlock(i-2, j+13, k-1, stone);
world.setBlock(i+1, j+13, k+2, stone);
world.setBlock(i+1, j+13, k-2, stone);
world.setBlock(i-1, j+13, k+2, stone);
//world.setBlock(i-1, j+13, k-2, stone);
world.setBlock(i+3, j+13, k, Mainblock);
world.setBlock(i+3, j+13, k, Mainblock);
world.setBlock(i+3, j+13, k+1, Mainblock);
world.setBlock(i+3, j+13, k-1, Mainblock);
world.setBlock(i+3, j+13, k+2, Mainblock);
world.setBlock(i+3, j+13, k-2, Mainblock);
world.setBlock(i+3, j+13, k+3, Mainblock);
world.setBlock(i+3, j+13, k-3, Mainblock);
world.setBlock(i-3, j+13, k, Mainblock);
world.setBlock(i-3, j+13, k+1, Mainblock);
world.setBlock(i-3, j+13, k-1, Mainblock);
world.setBlock(i-3, j+13, k+2, Mainblock);
world.setBlock(i-3, j+13, k-2, Mainblock);
world.setBlock(i-3, j+13, k-3, Mainblock);
world.setBlock(i-3, j+13, k+3, Mainblock);
world.setBlock(i, j+13, k+3, Mainblock);
world.setBlock(i+1, j+13, k+3, Mainblock);
world.setBlock(i-1, j+13, k+3, Mainblock);
world.setBlock(i+2, j+13, k+3, Mainblock);
world.setBlock(i-2, j+13, k+3, Mainblock);
world.setBlock(i, j+13, k-3, Mainblock);
world.setBlock(i+1, j+13, k-3, Mainblock);
world.setBlock(i-1, j+13, k-3, Mainblock);
world.setBlock(i+2, j+13, k-3, Mainblock);
world.setBlock(i-2, j+13, k-3, Mainblock);


//layer15

world.setBlock(i, j+14, k, Mainblock);
world.setBlock(i-3, j+14, k+3, Mainblock);
world.setBlock(i+3, j+14, k+3, Mainblock);
world.setBlock(i-3, j+14, k-3, Mainblock);
world.setBlock(i+3, j+14, k-3, Mainblock);
world.setBlock(i, j+15, k, Mainblock);
world.setBlock(i, j+16, k, Mainblock);
world.setBlock(i, j+17, k, Mainblock);
world.setBlock(i, j+18, k, Mainblock);
world.setBlock(i, j+19, k, Diamond);


world.setBlock(i, j+20, k, Lightningrod);


return true;


}
	return false;}
}