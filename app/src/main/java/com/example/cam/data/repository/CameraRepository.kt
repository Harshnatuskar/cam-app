package com.example.cam.data.repository

import android.app.Application
import androidx.camera.view.LifecycleCameraController
import com.example.cam.domain.repository.CameraRepository
import javax.inject.Inject

class CameraRepositoryImplements @Inject constructor(
    private val application: Application
): CameraRepository {
    override suspend fun takePhoto(controller: LifecycleCameraController) {
        TODO("Not yet implemented")
    }

    override suspend fun takeVideo(controller: LifecycleCameraController) {
        TODO("Not yet implemented")
    }

}