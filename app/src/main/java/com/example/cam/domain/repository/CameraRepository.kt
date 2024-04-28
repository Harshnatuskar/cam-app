package com.example.cam.domain.repository

import androidx.camera.view.LifecycleCameraController

interface CameraRepository {
    suspend fun takePhoto (
        controller: LifecycleCameraController
    )

    suspend fun takeVideo (
        controller: LifecycleCameraController
    )
}