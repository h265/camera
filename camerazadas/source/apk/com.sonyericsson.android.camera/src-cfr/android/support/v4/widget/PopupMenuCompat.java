/*
 * Decompiled with CFR 0_100.
 */
package android.support.v4.widget;

import android.os.Build;
import android.support.v4.widget.PopupMenuCompatKitKat;
import android.view.View;

public class PopupMenuCompat {
    static final PopupMenuImpl IMPL;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            IMPL = new KitKatPopupMenuImpl();
            return;
        }
        IMPL = new BasePopupMenuImpl();
    }

    private PopupMenuCompat() {
    }

    public static View.OnTouchListener getDragToOpenListener(Object object) {
        return IMPL.getDragToOpenListener(object);
    }

    static class BasePopupMenuImpl
    implements PopupMenuImpl {
        BasePopupMenuImpl() {
        }

        @Override
        public View.OnTouchListener getDragToOpenListener(Object object) {
            return null;
        }
    }

    static class KitKatPopupMenuImpl
    extends BasePopupMenuImpl {
        KitKatPopupMenuImpl() {
        }

        @Override
        public View.OnTouchListener getDragToOpenListener(Object object) {
            return PopupMenuCompatKitKat.getDragToOpenListener(object);
        }
    }

    static interface PopupMenuImpl {
        public View.OnTouchListener getDragToOpenListener(Object var1);
    }

}

