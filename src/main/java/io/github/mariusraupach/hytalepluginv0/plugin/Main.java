package io.github.mariusraupach.hytalepluginv0.plugin;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class Main extends JavaPlugin {
    public Main(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();

        this.getCommandRegistry().registerCommand(new io.github.mariusraupach.hytalepluginv0.command.Main("name", "description"));
    }
}
