package com.example.cam.di

import com.example.cam.data.repository.CameraRepositoryImplements
import com.example.cam.domain.repository.CameraRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CameraRepositoryModule {

    @Binds
    @Singleton
    abstract  fun bindCameraRepository(
        cameraRepositoryModule: CameraRepositoryImplements
    ):CameraRepository
}