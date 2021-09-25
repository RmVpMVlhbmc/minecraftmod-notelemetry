package moe.feiyang.notelemetry.mixin;

import net.minecraft.client.ClientTelemetryManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import moe.feiyang.notelemetry.ModMain;

@Mixin(ClientTelemetryManager.class)
public class ClientTelemetryManagerMixin  {
    @Overwrite
    //Keep vanilla params but do nothing
    private void sendWorldLoadEvent(ClientTelemetryManager.PlayerInfo pi) {
        ModMain.LOGGER.info("[NoTelemetry] World Load event is cancelled.");
    }
}
