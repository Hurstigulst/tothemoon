
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.test.client.particle.MoonDustParticle;
import net.mcreator.test.client.particle.CheesehitpartParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TestModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(TestModParticleTypes.CHEESEHITPART.get(), CheesehitpartParticle::provider);
		event.register(TestModParticleTypes.MOON_DUST.get(), MoonDustParticle::provider);
	}
}
