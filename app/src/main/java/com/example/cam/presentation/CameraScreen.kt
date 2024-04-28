package com.example.cam.presentation

import android.app.Activity
import androidx.camera.view.CameraController
import androidx.camera.view.LifecycleCameraController
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CameraScreen(
    activity: Activity
){
    val controller = rememberSaveable {
        LifecycleCameraController(
            activity.applicationContext
        ).apply {
            setEnabledUseCases(
                CameraController.IMAGE_CAPTURE or CameraController.VIDEO_CAPTURE
            )
        }

    }
    val cameraViewModel = hiltViewModel<CameraViewModel>()
    val isRecording by cameraViewModel.isRecording.collectAsState()
}