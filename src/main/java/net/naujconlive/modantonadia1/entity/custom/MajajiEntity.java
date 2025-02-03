package net.naujconlive.modantonadia1.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import net.naujconlive.modantonadia1.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

public class MajajiEntity extends AnimalEntity {

  @Override
  protected void initGoals() {
    this.goalSelector.add(0, new LookAtEntityGoal(this, PlayerEntity.class, 4.0F));
  }
  public MajajiEntity(EntityType<? extends AnimalEntity> entityType, World world) {
    super(entityType, world);
  }

  public static DefaultAttributeContainer.Builder createAttributes() {
    return MobEntity.createMobAttributes()
    .add(EntityAttributes.MAX_HEALTH, 20)
    .add(EntityAttributes.MOVEMENT_SPEED, 0);
  }
  @Override
  public boolean isBreedingItem(ItemStack stack) {
    return false;
  }

  @Override
  public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
    return null;
  }

  @Override
  protected @Nullable SoundEvent getAmbientSound() {
    return ModSounds.MAJAJI_AMBIENT;
  }

  @Override
  protected @Nullable SoundEvent getHurtSound(DamageSource source) {
    return ModSounds.MAJAJI_HIT;
  }

  @Override
  protected @Nullable SoundEvent getDeathSound() {
    return ModSounds.MAJAJI_DEATH;
  }
}
