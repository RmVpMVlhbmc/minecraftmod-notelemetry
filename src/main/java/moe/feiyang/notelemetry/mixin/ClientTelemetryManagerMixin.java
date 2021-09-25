package moe.feiyang.notelemetry.mixin;

import net.minecraft.client.ClientTelemetryManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import moe.feiyang.notelemetry.ModMain;

@Mixin(ClientTelemetryManager.class)
public class ClientTelemetryManagerMixin  {
    @Inject(at = @At("HEAD"), method = "sendWorldLoadEvent")
    //Keep vanilla params but do nothing
    private void sendWorldLoadEventMixin(ClientTelemetryManager.PlayerInfo r, CallbackInfo ci) {
        ModMain.LOGGER.info("[NoTelemetry] World Load event is cancelled.");
        return;
    }
}
