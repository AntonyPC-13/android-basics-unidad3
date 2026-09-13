package com.example.thirtydays.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.filled.AccessAlarm
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.Cached
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Celebration
import androidx.compose.material.icons.filled.DoNotDisturbOn
import androidx.compose.material.icons.filled.DonutLarge
import androidx.compose.material.icons.filled.Draw
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.Laptop
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.LocalDrink
import androidx.compose.material.icons.filled.Park
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.RecordVoiceOver
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.Style
import androidx.compose.material.icons.filled.Summarize
import androidx.compose.material.icons.filled.TaskAlt
import androidx.compose.material.icons.filled.Timer
import com.example.thirtydays.R
import com.example.thirtydays.model.StudyTip

// Un consejo por día: la posición en la lista (índice + 1) es el número de día
object StudyTipsRepository {
    val tips = listOf(
        StudyTip(R.string.tip_title_1, R.string.tip_desc_1, Icons.Filled.Flag),
        StudyTip(R.string.tip_title_2, R.string.tip_desc_2, Icons.Filled.CalendarMonth),
        StudyTip(R.string.tip_title_3, R.string.tip_desc_3, Icons.Filled.Laptop),
        StudyTip(R.string.tip_title_4, R.string.tip_desc_4, Icons.Filled.Timer),
        StudyTip(R.string.tip_title_5, R.string.tip_desc_5, Icons.Filled.DoNotDisturbOn),
        StudyTip(R.string.tip_title_6, R.string.tip_desc_6, Icons.Filled.Psychology),
        StudyTip(R.string.tip_title_7, R.string.tip_desc_7, Icons.Filled.Cached),
        StudyTip(R.string.tip_title_8, R.string.tip_desc_8, Icons.Filled.Style),
        StudyTip(R.string.tip_title_9, R.string.tip_desc_9, Icons.Filled.RecordVoiceOver),
        StudyTip(R.string.tip_title_10, R.string.tip_desc_10, Icons.Filled.Summarize),
        StudyTip(R.string.tip_title_11, R.string.tip_desc_11, Icons.Filled.Lightbulb),
        StudyTip(R.string.tip_title_12, R.string.tip_desc_12, Icons.Filled.Calculate),
        StudyTip(R.string.tip_title_13, R.string.tip_desc_13, Icons.Filled.Quiz),
        StudyTip(R.string.tip_title_14, R.string.tip_desc_14, Icons.Filled.Groups),
        StudyTip(R.string.tip_title_15, R.string.tip_desc_15, Icons.Filled.School),
        StudyTip(R.string.tip_title_16, R.string.tip_desc_16, Icons.Filled.Bedtime),
        StudyTip(R.string.tip_title_17, R.string.tip_desc_17, Icons.Filled.LocalDrink),
        StudyTip(R.string.tip_title_18, R.string.tip_desc_18, Icons.AutoMirrored.Filled.DirectionsRun),
        StudyTip(R.string.tip_title_19, R.string.tip_desc_19, Icons.Filled.Restaurant),
        StudyTip(R.string.tip_title_20, R.string.tip_desc_20, Icons.Filled.SelfImprovement),
        StudyTip(R.string.tip_title_21, R.string.tip_desc_21, Icons.Filled.AutoStories),
        StudyTip(R.string.tip_title_22, R.string.tip_desc_22, Icons.Filled.Draw),
        StudyTip(R.string.tip_title_23, R.string.tip_desc_23, Icons.Filled.Headphones),
        StudyTip(R.string.tip_title_24, R.string.tip_desc_24, Icons.Filled.TaskAlt),
        StudyTip(R.string.tip_title_25, R.string.tip_desc_25, Icons.Filled.DonutLarge),
        StudyTip(R.string.tip_title_26, R.string.tip_desc_26, Icons.Filled.Replay),
        StudyTip(R.string.tip_title_27, R.string.tip_desc_27, Icons.Filled.Park),
        StudyTip(R.string.tip_title_28, R.string.tip_desc_28, Icons.Filled.EmojiEvents),
        StudyTip(R.string.tip_title_29, R.string.tip_desc_29, Icons.Filled.AccessAlarm),
        StudyTip(R.string.tip_title_30, R.string.tip_desc_30, Icons.Filled.Celebration)
    )
}
