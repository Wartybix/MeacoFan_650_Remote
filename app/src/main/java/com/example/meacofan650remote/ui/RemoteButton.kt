package com.example.meacofan650remote.ui

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RemoteButton(
    icon: ImageVector?,
    text: String,
    modifier: Modifier = Modifier,
    emphasise: Boolean = false,
    onClick: () -> Unit
) {
    val content: @Composable RowScope.() -> Unit by remember {
        mutableStateOf({
            if (icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(ButtonDefaults.IconSize)
                )
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            }
            Text(text = text)
        })
    }
    if (emphasise)
        Button(onClick = onClick, content = content, modifier = modifier)
    else
        FilledTonalButton(onClick = onClick, content = content, modifier = modifier)
}

@Preview
@Composable
fun RemoteButtonPreview() {
    RemoteButton(icon = Icons.Outlined.Timer, text = "Timer") {
        
    }
}