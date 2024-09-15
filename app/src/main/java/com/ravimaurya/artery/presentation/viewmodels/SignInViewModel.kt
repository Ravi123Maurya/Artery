package com.ravimaurya.artery.presentation.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.ravimaurya.artery.presentation.utils.Screens

class SignInViewModel(val navController: NavController): ViewModel() {

    private val _signInState = mutableStateOf(SignInState())
    val signInState: State<SignInState> = _signInState

    var signInInProgress by mutableStateOf(false)
    var isSignInFailed by mutableStateOf(false)

    fun onEvent(event: SignInEvent){
        when(event){
            is SignInEvent.EmailChanged -> {
                _signInState.value = _signInState.value.copy(
                    email = event.email
                )
            }
            is SignInEvent.PasswordChanged -> {
                _signInState.value = _signInState.value.copy(
                    password = event.password
                )
            }
            SignInEvent.SignInButtonClicked -> {
                signIn()
            }
        }
    }

    private fun signIn(){
        signInInProgress = true
        val email = _signInState.value.email
        val password = _signInState.value.password

        FirebaseAuth
            .getInstance()
            .signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if(it.isSuccessful){
                    navController.navigate(Screens.Home.route)
                }
            }
            .addOnFailureListener {
                signInInProgress = false
                isSignInFailed = true
            }
    }

}

sealed class SignInEvent{
    data class EmailChanged(val email: String): SignInEvent()
    data class PasswordChanged(val password: String): SignInEvent()

    data object SignInButtonClicked: SignInEvent()
}

data class SignInState(
    val email: String = "",
    val password: String = "",
)