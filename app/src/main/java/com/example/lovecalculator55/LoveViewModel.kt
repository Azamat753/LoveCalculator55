package com.example.lovecalculator55

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lovecalculator55.remote.LoveModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoveViewModel @Inject constructor(
    private val repository: Repository,
) : ViewModel() {

    fun getLiveData(firstName: String, secondName: String)
            : LiveData<LoveModel> {
        return repository.getData(firstName, secondName)
    }
}