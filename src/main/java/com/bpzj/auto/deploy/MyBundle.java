package com.bpzj.auto.deploy;


import com.intellij.AbstractBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;


public final class MyBundle extends AbstractBundle {
    private static final String BUNDLE = "messages.MyBundle";
    public static final MyBundle INSTANCE = new MyBundle(BUNDLE);

    protected MyBundle(@NotNull String pathToBundle) {
        super(pathToBundle);
    }


    @NotNull
    public static String message(@PropertyKey(resourceBundle = BUNDLE) @NotNull String key, @NotNull Object... params) {
        return INSTANCE.getMessage(key, params);
    }

    @NotNull
    public static String messagePointer(@PropertyKey(resourceBundle = BUNDLE) @NotNull String key, @NotNull Object... params) {
        return message(key, params);
    }

}
