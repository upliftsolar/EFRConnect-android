package com.siliconlabs.bledemo.Advertiser.Models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
class Service128Bit(val uuid: UUID) : Parcelable {
    override fun toString(): String {
        return uuid.toString()
    }
}