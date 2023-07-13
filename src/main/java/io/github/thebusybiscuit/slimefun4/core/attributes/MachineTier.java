package io.github.thebusybiscuit.slimefun4.core.attributes;

import javax.annotation.Nonnull;

public enum MachineTier {

    BASIC("&e기초"),
    AVERAGE("&6초급"),
    MEDIUM("&a중급"),
    GOOD("&2상급"),
    ADVANCED("&6고급"),
    END_GAME("&4최고급");

    private final String prefix;

    MachineTier(@Nonnull String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }

}

