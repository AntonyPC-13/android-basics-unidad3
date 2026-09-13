package com.example.thirtydays.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    // small: fondo de la imagen de cada consejo
    small = RoundedCornerShape(12.dp),
    // medium: tarjetas con dos esquinas muy redondeadas (identidad propia de la app)
    medium = RoundedCornerShape(topStart = 24.dp, topEnd = 8.dp, bottomEnd = 24.dp, bottomStart = 8.dp),
    // large: insignia del número de día
    large = RoundedCornerShape(50.dp)
)
