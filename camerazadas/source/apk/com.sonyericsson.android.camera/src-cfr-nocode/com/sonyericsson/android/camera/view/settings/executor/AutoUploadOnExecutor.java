/*
 * Decompiled with CFR 0_100.
 */
package com.sonyericsson.android.camera.view.settings.executor;

import android.content.Context;
import com.sonyericsson.android.camera.configuration.ParameterKey;
import com.sonyericsson.cameracommon.setting.executor.SettingExecutorInterface;
import com.sonyericsson.cameracommon.setting.settingitem.TypedSettingItem;

/*
 * Exception performing whole class analysis.
 */
class AutoUploadOnExecutor
implements SettingExecutorInterface<ParameterKey> {
    private final Context mContext;

    public AutoUploadOnExecutor(Context var1);

    @Override
    public void onExecute(TypedSettingItem<ParameterKey> var1);
}

