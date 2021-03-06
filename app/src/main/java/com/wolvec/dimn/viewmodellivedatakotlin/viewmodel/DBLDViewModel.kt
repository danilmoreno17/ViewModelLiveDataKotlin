package com.wolvec.dimn.viewmodellivedatakotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wolvec.dimn.viewmodellivedatakotlin.utils.User

class DBLDViewModel: ViewModel() {

    var user: MutableLiveData<User> = MutableLiveData()
    var visible: MutableLiveData<Boolean> = MutableLiveData()
    var size: MutableLiveData<Float> = MutableLiveData(14f)

    fun setUser(user: User){
        this.user.value = user
    }

    fun updateUser(){
        val user = User("Laura","24")
        this.user.value = user
    }

    fun setVisible(visible: Boolean){
        this.visible.value = visible
    }

    fun changeVisibility(){
        if(visible.value == true){
            visible.value= false
        }else{
            visible.value = true
        }
        size.value = size.value!!.toFloat() + 5f
    }
}