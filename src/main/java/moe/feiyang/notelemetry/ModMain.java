package moe.feiyang.notelemetry;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModMain implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("notelemetry");

	@Override
	public void onInitialize() {
		LOGGER.info("[NoTelemetry] Mod initialized.");
	}
}
