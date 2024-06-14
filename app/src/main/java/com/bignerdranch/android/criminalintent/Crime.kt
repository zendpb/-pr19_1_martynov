package com.bignerdranch.android.criminalintent

import java.time.LocalDate
import java.util.UUID

data class Crime (
    val id: UUID = UUID.randomUUID(),
    var title: String,
    var isSolved: Boolean,
    val date: LocalDate
)