package net.naujconlive.modantonadia1.block.custom;

import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.naujconlive.modantonadia1.entity.ModEntities;
import net.naujconlive.modantonadia1.entity.custom.DickEntity;
import org.jetbrains.annotations.Nullable;

public class DickBlock extends HorizontalFacingBlock {
  public static final MapCodec<DickBlock> CODEC = createCodec(DickBlock::new);

  public DickBlock(Settings settings) {
    super(settings);
  }

  @Override
  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
    if(!world.isClient()) {
      Entity entity = null;
      List<DickEntity> entities = world.getEntitiesByType(ModEntities.DICK, new Box(pos), dickEntity -> true);
      if(entities.isEmpty()) {
        entity = ModEntities.DICK.spawn((ServerWorld) world, pos, SpawnReason.TRIGGERED);
      } else {
        entity = entities.get(0);
      }

      player.startRiding(entity);
    }

    return ActionResult.SUCCESS;
  }

  @Override
  protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
    return CODEC;
  }

  @Override
  public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
    return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
  }

  @Override
  protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
    builder.add(FACING);
  }
}
