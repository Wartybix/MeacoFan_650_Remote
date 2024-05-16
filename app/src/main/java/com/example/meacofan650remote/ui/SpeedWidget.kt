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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.meacofan650remote.R

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
                Text(text = stringResource(R.string.speed), style = MaterialTheme.typography.labelMedium)
            }

            Column {
                FilledTonalIconButton(onClick = increaseFunction) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = stringResource(R.string.increase_speed))
                }

                FilledTonalIconButton(onClick = decreaseFunction) {
                    Icon(imageVector = Icons.Default.Remove, contentDescription = stringResource(R.string.decrease_speed))
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