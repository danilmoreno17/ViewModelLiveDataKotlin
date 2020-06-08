package com.wolvec.dimn.viewmodellivedatakotlin.viewmodel

import androidx.lifecycle.ViewModel
import com.wolvec.dimn.viewmodellivedatakotlin.utils.User

class UserViewModel : ViewModel {

    var userList: MutableList<User>

    constructor(){
        userList = ArrayList()
    }

    fun addUser(user: User){
        userList.add(user)
    }
}