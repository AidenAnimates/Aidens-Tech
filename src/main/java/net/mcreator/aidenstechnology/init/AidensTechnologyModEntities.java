
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aidenstechnology.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.aidenstechnology.entity.NosinbulletEntity;
import net.mcreator.aidenstechnology.entity.M16BulletEntity;
import net.mcreator.aidenstechnology.AidensTechnologyMod;

public class AidensTechnologyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, AidensTechnologyMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<NosinbulletEntity>> NOSINBULLET = register("nosinbullet",
			EntityType.Builder.<NosinbulletEntity>of(NosinbulletEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<M16BulletEntity>> M_16_BULLET = register("m_16_bullet",
			EntityType.Builder.<M16BulletEntity>of(M16BulletEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
