package me.flame.sumo.utils;

import me.flame.sumo.Core;

public interface IHandler {
    /**
     * Enable method
     *
     * @param core Instance of core class {@link Core}
     */
    void enable(Core core);

    /**
     * Disable method
     *
     * @param core Instance of core class {@link Core}
     */
    void disable(Core core);
}
