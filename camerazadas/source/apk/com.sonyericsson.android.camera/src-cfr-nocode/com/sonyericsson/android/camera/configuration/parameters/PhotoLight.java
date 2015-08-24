/*
 * Decompiled with CFR 0_100.
 */
package com.sonyericsson.android.camera.configuration.parameters;

import com.sonyericsson.android.camera.ActionMode;
import com.sonyericsson.android.camera.configuration.ParameterKey;
import com.sonyericsson.android.camera.configuration.parameters.ParameterApplicable;
import com.sonyericsson.android.camera.configuration.parameters.ParameterValue;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public final class PhotoLight
extends Enum<PhotoLight>
implements ParameterValue {
    private static final /* synthetic */ PhotoLight[] $VALUES;
    public static final /* enum */ PhotoLight OFF;
    public static final /* enum */ PhotoLight ON;
    private static final int sParameterTextId = 2131296513;
    private final boolean mBooleanValue;
    private final int mIconId;
    private final int mTextId;
    private final String mValue;

    static;

    private PhotoLight(int var3, int var4, String var5, boolean var6);

    public static PhotoLight[] getOptions(ActionMode var0);

    public static PhotoLight getPhotoLightFromParameterString(String var0);

    public static PhotoLight valueOf(String var0);

    public static PhotoLight[] values();

    @Override
    public void apply(ParameterApplicable var1);

    public boolean getBooleanValue();

    @Override
    public int getIconId();

    @Override
    public ParameterKey getParameterKey();

    @Override
    public int getParameterKeyTextId();

    @Override
    public String getParameterName();

    @Override
    public ParameterValue getRecommendedValue(ParameterValue[] var1, ParameterValue var2);

    @Override
    public int getTextId();

    @Override
    public String getValue();
}
