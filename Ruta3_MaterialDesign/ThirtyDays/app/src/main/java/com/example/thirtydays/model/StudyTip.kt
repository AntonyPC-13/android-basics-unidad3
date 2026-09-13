package com.example.thirtydays.model

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class StudyTip(
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    val image: ImageVector
)
