package net.naujconlive.modantonadia1.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class DickEntity extends Entity {
  public DickEntity(EntityType<?> type, World world) {
    super(type, world);
  }

  @Override
  protected void initDataTracker(DataTracker.Builder builder) {

  }

  @Override
  public boolean damage(ServerWorld world, DamageSource source, float amount) {
    return false;
  }

  @Override
  protected void readCustomDataFromNbt(NbtCompound nbt) {

  }

  @Override
  protected void writeCustomDataToNbt(NbtCompound nbt) {

  }

  @Override
  protected void removePassenger(Entity passenger) {
    super.removePassenger(passenger);
    this.kill();
  }

  private void kill() {

  }
}
