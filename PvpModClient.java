package pl.pvpmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

/**
 * Entrypoint "client" - tu rejestrujemy rysowanie HUD-u.
 * HudRenderCallback wywoływany jest co klatkę po narysowaniu vanilla HUD-u.
 */
public class PvpModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(PvpHud::render);
    }
}
