package com.example.meacofan650remote.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SpeedWidget(
    increaseFunction: () -> Unit,
    decreaseFunction: () -> Unit,
    modifier: Modifier = Modifier
) {
    ElevatedCard(modifier = modifier) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Icon(imageVector = Icons.Default.Speed, contentDescription = null)
                Text(text = "Speed", style = MaterialTheme.typography.labelMedium)
            }

            Column {
                FilledTonalIconButton(onClick = increaseFunction) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Increase Speed")
                }

                FilledTonalIconButton(onClick = decreaseFunction) {
                    Icon(imageVector = Icons.Default.Remove, contentDescription = "Decrease Speed")
                }
            }
        }

    }
}

@Preview
@Composable
fun SpeedWidgetPreview() {
    SpeedWidget(increaseFunction = {}, decreaseFunction = {})
}