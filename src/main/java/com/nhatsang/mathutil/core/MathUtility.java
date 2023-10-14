/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhatsang.mathutil.core;

/**
 *
 * @author nhats
 */
// đây là bộ thư viện chứa các hàm dùng trong tính toán
//toán học,clone giống class Math bên JDK
//Khi gọi là thư viện dùng chung mà ko cần nhớ nhung gì sau khi xử lý
//--> thư viện chứa đồ STATIC
public class MathUtility {

    public static final double PI = 3.1415;

    //hàm tính n!=1,2,3,4...n
    //n<0  n>20 ko tính do 21! tràn kiểu long
    //ko tính giai thừa âm!!!
    //0! =1! =1
//    public static long getFactorial(int n) {
//        long result = 10;
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid input: n must be a non-negative integer");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    //NÂNG CẤP HÀM TÍNH GIAI THỪA , DÙNG THUẬT TOÁN ĐỆ QUY
    //n! = 1.2.3....n
    //5! = 1.2.3.4.5
    //5! = 4! X 5
    //4! = 3! X 4
    //3! = 2! X 3
    //2! = 1! X 2
    // 1! Là 1 , stop
    //n! = n X (n-1)!
    //=> ĐỆ QUY - recursion là GỌI LẠI CHÍNH MÌNH VỚI 1 QUY MÔ NHỎ HƠN
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid input: n must be a non-negative integer");
        
        if (n == 0 || n == 1) 
            return 1;
        

        return n * getFactorial(n - 1); //n! = n X (n-1)!
    }
}
