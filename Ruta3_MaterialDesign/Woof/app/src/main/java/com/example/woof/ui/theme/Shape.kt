package com.example.woof.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    // small: foto del perro en círculo
    small = RoundedCornerShape(50.dp),
    // medium: lo usa Card por defecto (esquinas superior derecha e inferior izquierda redondeadas)
    medium = RoundedCornerShape(bottomStart = 16.dp, topEnd = 16.dp)
)
