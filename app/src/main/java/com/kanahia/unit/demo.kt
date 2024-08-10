package com.kanahia.unit

class demo {

    fun validatePass(pass: String) : Boolean{
        if (pass.isEmpty() || pass.length > 15 || pass.length < 6) return false;
        return true;
    }
}