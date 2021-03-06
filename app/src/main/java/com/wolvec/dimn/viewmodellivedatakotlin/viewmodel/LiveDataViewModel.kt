package com.wolvec.dimn.viewmodellivedatakotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wolvec.dimn.viewmodellivedatakotlin.utils.User

class LiveDataViewModel: ViewModel() {

    var userListLiveData: MutableLiveData<List<User>> = MutableLiveData()
    var userList: MutableList<User> = ArrayList()

    fun getUserList(): LiveData<List<User>>{
        return userListLiveData
    }

    fun addUser(user: User){
        userList.add(user)
        userListLiveData.value = userList
    }
}