package flamepoint1544.beyond_bedrock.blocks;

import flamepoint1544.beyond_bedrock.BeyondBedrock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public final class GlassSlab extends SlabBlock{
	public GlassSlab(Settings settings){
		super(settings);
	}
	
    /*******************************************************************************************************
     * !NOT DEPRECATED!
     * + isSideInvisible(BlockState state, BlockState stateFrom, Direction direction)
     * Overides minecraft function from AbstractBlock that appears to check if a side should not be rendered
     *******************************************************************************************************/
	@SuppressWarnings("deprecation")
	@Override
	public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction){
		if(stateFrom.isIn(BeyondBedrock.GLASS_BLOCKS)){
			return true;
        }

		if(stateFrom.getBlock() == this){
			if(isInvisibleToGlassSlab(state, stateFrom, direction)){
				return true;
            }
        }
			
		return super.isSideInvisible(state, stateFrom, direction);
	}
	
	private boolean isInvisibleToGlassSlab(BlockState state, BlockState stateFrom, Direction direction){
		SlabType type = state.get(SlabBlock.TYPE);
		SlabType typeFrom = stateFrom.get(SlabBlock.TYPE);
		
		switch(direction){
			case UP:
			if(typeFrom != SlabType.TOP && type != SlabType.BOTTOM){
				return true;
            }
			
			case DOWN:
			if(typeFrom != SlabType.BOTTOM && type != SlabType.TOP){
				return true;
            }
			
			case NORTH:
			case EAST:
			case SOUTH:
			case WEST:
			if(type == typeFrom || typeFrom == SlabType.DOUBLE){
				return true;
            }
		}
		
		return false;
	}
	
	@Override
	public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
		return VoxelShapes.empty();
	}
	
	@Override
	@Environment(EnvType.CLIENT)
	public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos){
		return 1.0F;
	}
	
	@Override
	public boolean isTransparent(BlockState state, BlockView world, BlockPos pos){
		return true;
	}
}