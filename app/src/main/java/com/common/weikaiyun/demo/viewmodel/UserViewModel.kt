package com.common.weikaiyun.demo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.common.weikaiyun.demo.db.User
import com.common.weikaiyun.demo.model.UserModel
import kotlinx.coroutines.launch

class UserViewModel: ViewModel() {
    private val model = UserModel()
    val userList = model.getAll()

    fun insertAll(vararg users: User) {
        viewModelScope.launch {
            model.insertAll(*users)
        }
    }
}