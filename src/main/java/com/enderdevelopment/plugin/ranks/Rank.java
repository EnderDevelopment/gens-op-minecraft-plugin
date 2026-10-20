package com.enderdevelopment.plugin.ranks;

import java.util.Set;

public enum Rank {
    DEFAULT("default", Set.of("gensop.player")),
    VIP("vip", Set.of("gensop.player", "gensop.vip")),
    MVP("mvp", Set.of("gensop.player", "gensop.vip", "gensop.mvp")),
    ADMIN("admin", Set.of("gensop.player", "gensop.vip", "gensop.mvp", "gensop.admin"));

    private final String name;
    private final Set<String> permissions;

    Rank(String name, Set<String> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }
}