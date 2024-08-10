package com.kanahia.unit

import org.junit.Assert.*
import org.junit.Test

class demoTest{

    @Test
    fun validPasswordTest(){
        //ARRANGE
        val demo = demo()
        //ACT
        val result = demo.validatePass("12345")
        //ASSERT
        assertEquals(false, result)
    }
}