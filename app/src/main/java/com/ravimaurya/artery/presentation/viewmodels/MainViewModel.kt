package com.ravimaurya.artery.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class MainViewModel: ViewModel() {

    val isUserLoggedIn: MutableLiveData<Boolean> = MutableLiveData()

    fun checkUserLoggedIn(){
        isUserLoggedIn.value = FirebaseAuth.getInstance().currentUser != null
    }

}


