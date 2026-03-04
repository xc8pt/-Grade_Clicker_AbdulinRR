package com.abdulin.grade_clicker.model

import android.window.TrustedPresentationThresholds
import androidx.annotation.DrawableRes

data class Grade(
    @DrawableRes val imageId: Int,
    val pointsPerClick: Int,
    val threshold: Int
)