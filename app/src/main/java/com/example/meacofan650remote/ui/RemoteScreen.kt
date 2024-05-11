package com.example.meacofan650remote.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BrightnessMedium
import androidx.compose.material.icons.outlined.Eco
import androidx.compose.material.icons.outlined.PowerSettingsNew
import androidx.compose.material.icons.outlined.RotateLeft
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material.icons.outlined.VolumeOff
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RemoteScreen(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues()
) {
    Box(modifier = modifier
        .padding(paddingValues)
        .padding(horizontal = 24.dp)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            SpeedWidget()

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                RemoteButton(icon = Icons.Outlined.Eco, text = "Eco", modifier = Modifier.weight(1f)) {

                }


                RemoteButton(icon = Icons.Outlined.RotateLeft, text = "Oscillate", modifier = Modifier.weight(1f)) {

                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                RemoteButton(icon = Icons.Outlined.BrightnessMedium, text = "Light", modifier = Modifier.weight(1f)) {

                }

                RemoteButton(icon = Icons.Outlined.VolumeOff, text = "Mute", modifier = Modifier.weight(1f)) {

                }


            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                RemoteButton(icon = Icons.Outlined.Timer, text = "Timer", modifier = Modifier.weight(1f)) {

                }

                RemoteButton(icon = Icons.Outlined.PowerSettingsNew, text = "Power", emphasise = true, modifier = Modifier.weight(1f)) {

                }
            }
        }
    }


}

@Preview
@Composable
fun RemoteScreenPreview() {
    RemoteScreen()
}