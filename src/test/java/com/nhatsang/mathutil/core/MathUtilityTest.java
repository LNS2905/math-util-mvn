/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nhatsang.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nhats
 */
public class MathUtilityTest {

    //cấu trúc Test Case: ID | Desc | Steps/Procedures | Expected Result | Status
    //Test Case #1 = Verify  getFactorial(with n=0)
    //Steps:
    // 1. Given n =0
    // 2. Call/invoke getFactorial (n=0)
    // Expected Result:
    //     the method must return 1 as the result of 0!
    //Status : PASSED | FALLED đoán xem , chờ code xong, chạy mới biết
    @Test
    public void verifyFactorialGivenRightArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

//Test Case #2
    @Test
    public void verifyFactorialGivenRightArgument1ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    //Test Case #
    @Test
    public void verifyFactorialGivenRightArgument5ReturnOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
