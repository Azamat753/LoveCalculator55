package com.example.lovecalculator55

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class InterfaceModule {

    @Binds
    abstract fun provideMakeVoice(duckQuakeImpl: DuckQuakeImpl): MakeVoice

}