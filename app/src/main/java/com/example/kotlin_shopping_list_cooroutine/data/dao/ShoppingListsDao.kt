package com.example.kotlin_shopping_list_cooroutine.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.kotlin_shopping_list_cooroutine.data.entity.ShoppingListsEntity

@Dao
interface ShoppingListsDao {
    @Insert
    suspend fun insertList(list: ShoppingListsEntity)

    @Query("SELECT * FROM ShoppingListsEntity")
    fun getAllList(): LiveData<List<ShoppingListsEntity>>

    @Query("DELETE FROM ShoppingListsEntity WHERE id = :id")
    suspend fun delete(id: String)
}