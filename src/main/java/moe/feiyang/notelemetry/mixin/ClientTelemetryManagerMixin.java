package moe.feiyang.notelemetry.mixin;

import net.minecraft.client.ClientTelemetryManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import moe.feiyang.notelemetry.ModMain;

@Mixin(ClientTelemetryManager.class)
public class ClientTelemetryManagerMixin  {
    /**
    * Overwrites WorldLoad event then prints relevant log.
    *
    * @author    Fei Yang
    * @reason    Disable telemetry event WorldLoad
    * @param  pi PlayerInfo, it only exists to make Mixin happy
    * @return    Nothing
    */
    @Overwrite
    private void sendWorldLoadEvent(ClientTelemetryManager.PlayerInfo pi) {
        ModMain.LOGGER.info("[NoTelemetry] WorldLoad event is cancelled.");
    }
}
