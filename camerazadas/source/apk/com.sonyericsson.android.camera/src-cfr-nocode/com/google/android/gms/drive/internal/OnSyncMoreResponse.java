/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class OnSyncMoreResponse
implements SafeParcelable {
    public static final Parcelable.Creator<OnSyncMoreResponse> CREATOR;
    final int BR;
    final boolean Oz;

    static;

    OnSyncMoreResponse(int var1, boolean var2);

    @Override
    public int describeContents();

    @Override
    public void writeToParcel(Parcel var1, int var2);
}

