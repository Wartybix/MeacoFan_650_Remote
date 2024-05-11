package com.example.meacofan650remote.ui

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.meacofan650remote.R

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun TopAppBar() {
    CenterAlignedTopAppBar(title = { Text(stringResource(id = R.string.app_name)) })
}

@Preview
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}