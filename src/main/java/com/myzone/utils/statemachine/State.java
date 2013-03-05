package com.myzone.utils.statemachine;

import org.jetbrains.annotations.NotNull;

/**
 * @author: myzone
 * @date: 03.02.13 15:33
 */
public interface State<S> {

    @NotNull
    State<S> react(@NotNull S stimulus);

    interface Factory<S> {

        @NotNull
        State<S> getStartState();

        @NotNull
        State<S> getEndState();

    }
}
