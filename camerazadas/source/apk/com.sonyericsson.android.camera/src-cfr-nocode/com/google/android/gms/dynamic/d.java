/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface d
extends IInterface {

    /*
     * Exception performing whole class analysis ignored.
     */
    public static abstract class com.google.android.gms.dynamic.d$a
    extends Binder
    implements d {
        public com.google.android.gms.dynamic.d$a();

        public static d am(IBinder var0);

        @Override
        public IBinder asBinder();

        @Override
        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException;

        /*
         * Exception performing whole class analysis.
         * Exception performing whole class analysis ignored.
         */
        private static class a
        implements d {
            private IBinder lb;

            a(IBinder var1);

            @Override
            public IBinder asBinder();
        }

    }

}

