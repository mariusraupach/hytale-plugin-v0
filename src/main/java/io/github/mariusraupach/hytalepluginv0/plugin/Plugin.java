package io.github.mariusraupach.hytalepluginv0.plugin;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import io.github.mariusraupach.hytalepluginv0.command.Command;
import io.github.mariusraupach.hytalepluginv0.system.System;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class Plugin extends JavaPlugin {
    public Plugin(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();

        this.getCommandRegistry().registerCommand(new Command("name", "description"));
        this.getEntityStoreRegistry().registerSystem(new System());
    }
}
