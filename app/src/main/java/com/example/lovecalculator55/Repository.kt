package com.example.lovecalculator55

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.lovecalculator55.remote.LoveApi
import com.example.lovecalculator55.remote.LoveModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val api: LoveApi) {

    fun getData(firstName: String, secondName: String): MutableLiveData<LoveModel> {
        val liveLove = MutableLiveData<LoveModel>()
        api.getPercentage(firstName, secondName)
            .enqueue(object : Callback<LoveModel> {
                override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                    if (response.isSuccessful) {
                        liveLove.postValue(response.body())
                    }
                }

                override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                    Log.e("ololo", "onFailure: ${t.message}")
                }
            })
        return liveLove
    }
}