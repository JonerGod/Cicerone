package androidx.fragment.app;

import android.os.Bundle;

/**
 * Created by Konstantin Tskhovrebov (aka @terrakok)
 * on 11.10.16
 */

public class FragmentTransaction {
    public FragmentTransaction add(int containerViewId, Fragment fragment) {
        throw new RuntimeException("Stub!");
    }

    public final FragmentTransaction add(
            int containerViewId,
            Class<? extends Fragment> fragmentClass,
            Bundle args) {
        throw new RuntimeException("Stub!");
    }

    public FragmentTransaction replace(int containerViewId, Fragment fragment) {
        throw new RuntimeException("Stub!");
    }

    public final FragmentTransaction replace(
            int containerViewId,
            Class<? extends Fragment> fragmentClass,
            Bundle args) {
        throw new RuntimeException("Stub!");
    }

    public FragmentTransaction addToBackStack(String name) {
        throw new RuntimeException("Stub!");
    }

    public int commit() {
        throw new RuntimeException("Stub!");
    }
}
