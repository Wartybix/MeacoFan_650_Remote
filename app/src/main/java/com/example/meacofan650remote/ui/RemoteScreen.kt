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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.meacofan650remote.R
import com.example.meacofan650remote.data.RemoteFunction

@Composable
fun RemoteScreen(
    modifier: Modifier = Modifier,
    transmitFunction: (RemoteFunction) -> Unit,
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
            SpeedWidget(
                increaseFunction = { transmitFunction(RemoteFunction.SPEED_UP) },
                decreaseFunction = { transmitFunction(RemoteFunction.SPEED_DOWN) },
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                RemoteButton(
                    icon = Icons.Outlined.Eco,
                    text = stringResource(R.string.eco),
                    modifier = Modifier.weight(1f)
                ) {
                    transmitFunction(RemoteFunction.ECO)
                }


                RemoteButton(
                    icon = Icons.Outlined.RotateLeft,
                    text = stringResource(R.string.oscillate),
                    modifier = Modifier.weight(1f)
                ) {
                    transmitFunction(RemoteFunction.OSCILLATION)
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                RemoteButton(
                    icon = Icons.Outlined.BrightnessMedium,
                    text = stringResource(R.string.light),
                    modifier = Modifier.weight(1f)
                ) {
                    transmitFunction(RemoteFunction.LIGHT)
                }

                RemoteButton(
                    icon = Icons.Outlined.VolumeOff,
                    text = stringResource(R.string.mute),
                    modifier = Modifier.weight(1f)
                ) {
                    transmitFunction(RemoteFunction.MUTE)
                }


            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                RemoteButton(
                    icon = Icons.Outlined.Timer,
                    text = stringResource(R.string.timer),
                    modifier = Modifier.weight(1f)
                ) {
                    transmitFunction(RemoteFunction.TIMER)
                }

                RemoteButton(
                    icon = Icons.Outlined.PowerSettingsNew,
                    text = stringResource(R.string.power),
                    emphasise = true,
                    modifier = Modifier.weight(1f)
                ) {
                    transmitFunction(RemoteFunction.POWER)
                }
            }
        }
    }


}

@Preview
@Composable
fun RemoteScreenPreview() {
    RemoteScreen(transmitFunction = {})
}