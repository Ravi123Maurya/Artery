package com.ravimaurya.artery.presentation.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.ravimaurya.artery.presentation.utils.Screens

class SignUpViewModel(val navController: NavController): ViewModel() {

    private val _signUpState = mutableStateOf(SignUpState())
    val signUpState: State<SignUpState> = _signUpState
    var signUpInProgress by mutableStateOf(false)
    var isSignUpFailed by mutableStateOf(false)

    fun onEvent(event: SignUpEvent){
        when(event){
            is SignUpEvent.EmailChanged -> {
                _signUpState.value = _signUpState.value.copy(
                    email = event.email
                )
            }
            is SignUpEvent.FirstNameChanged -> {
                _signUpState.value = _signUpState.value.copy(
                    firstName = event.fistName
                )
            }
            is SignUpEvent.LastNameChanged -> {
                _signUpState.value = _signUpState.value.copy(
                    lastName = event.lastName
                )
            }
            is SignUpEvent.PasswordChanged -> {
                _signUpState.value = _signUpState.value.copy(
                    password = event.password
                )
            }
            SignUpEvent.SignUpButtonClicked -> {
                signUp()
            }
        }
    }

   private fun signUp(){
        signUpInProgress = true
        val email = _signUpState.value.email
        val password = _signUpState.value.password

        FirebaseAuth
            .getInstance()
            .createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                    signUpInProgress = false
                if (it.isSuccessful){
                    navController.navigate(Screens.Home.route)
                }
            }
            .addOnFailureListener{
                signUpInProgress = false
                isSignUpFailed = true
            }
    }


}

sealed class SignUpEvent{
    data class FirstNameChanged(val fistName:String): SignUpEvent()
    data class LastNameChanged(val lastName: String): SignUpEvent()
    data class EmailChanged(val email:String): SignUpEvent()
    data class PasswordChanged(val password: String): SignUpEvent()

    data object SignUpButtonClicked: SignUpEvent()
}

data class SignUpState(
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val password: String = ""
)