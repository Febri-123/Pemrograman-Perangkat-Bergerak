package com.example.modul5_recyclerview1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Inis_Variable(
    val fotomhs: Int=0,
    val Namamhs : String,
    val Telpmhs : String,
    val Nimmhs : String,

) : Parcelable
