package io.github.mariusraupach.hytalepluginv0.entity;

import com.hypixel.hytale.protocol.packets.interface_.CustomPageLifetime;
import com.hypixel.hytale.server.core.entity.entities.player.pages.BasicCustomUIPage;
import com.hypixel.hytale.server.core.ui.builder.UICommandBuilder;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class Main extends BasicCustomUIPage {
    public Main(@NonNullDecl PlayerRef playerRef, @NonNullDecl CustomPageLifetime lifetime) {
        super(playerRef, lifetime);
    }

    @Override
    public void build(UICommandBuilder uiCommandBuilder) {
        uiCommandBuilder.append("entity/main.ui");
    }
}
