package com.myzone.utils.statemachine;

import org.jetbrains.annotations.NotNull;

/**
 * @author: myzone
 * @date: 03.02.13 15:15
 */
public interface StateMachine<S> extends Runnable {

    void run();

    void process(@NotNull S signal);

}
