package net.minecraft.core.dispenser;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;

public interface DispenseBehaviorTypes {
   static void bootstrap(final WritableRegistry<MapCodec<? extends DispenseBehavior>> registry) {
      Registry.register(registry, "brush_armadillo", BrushArmadilloDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "charge_respawn_anchor", ChargeRespawnAnchorDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "convert_to_mud", ConvertToMudDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "drop_item", DropItemDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "empty_bucket", EmptyBucketDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "equip", EquipDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "equip_chest", EquipChestBehavior.MAP_CODEC);
      Registry.register(registry, "equip_sulfur_cube", EquipSulfurCubeDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "fill_bottle", FillBottleDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "fill_bucket", FillBucketDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "grow_plant", GrowPlantDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "ignite", IgniteDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "insert_into_container", InsertIntoContainerDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "place_armor_stand", PlaceArmorStandDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "place_boat", PlaceBoatDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "place_minecart", PlaceMinecartDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "place_block", PlaceBlockDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "shear", ShearDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "shoot_projectile", ShootProjectileDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "spawn_golem_from_carved_pumpkin", SpawnGolemFromCarvedPumpkinDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "spawn_mob", SpawnMobDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "spawn_tnt", SpawnTNTDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "spawn_wither_from_wither_skeleton_skull", SpawnWitherFromWitherSkeletonSkullDispenseBehavior.MAP_CODEC);
      Registry.register(registry, "transform_block", TransformBlockDispenseBehavior.MAP_CODEC);
   }
}
