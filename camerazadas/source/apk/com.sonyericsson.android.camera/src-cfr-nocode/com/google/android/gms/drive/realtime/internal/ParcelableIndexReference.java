/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class ParcelableIndexReference
implements SafeParcelable {
    public static final Parcelable.Creator<ParcelableIndexReference> CREATOR;
    final int BR;
    final String Rp;
    final boolean Rq;
    final int mIndex;

    static;

    ParcelableIndexReference(int var1, String var2, int var3, boolean var4);

    @Override
    public int describeContents();

    @Override
    public void writeToParcel(Parcel var1, int var2);
}

