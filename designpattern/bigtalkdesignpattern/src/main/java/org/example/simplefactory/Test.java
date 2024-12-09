package org.example.simplefactory;

import java.util.Scanner;

/**
 * @Author: zongz
 * @Date: 2024-12-01
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("**********************************************");
        System.out.println("《大话设计模式》代码样例");
        System.out.println();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字A：");
            double numberA = Double.parseDouble(scanner.nextLine());
            System.out.println("请选择运算符号（+、-、*、/）：");
            String strOperate = scanner.nextLine();
            System.out.println("请输入数字B：");
            double numberB = Double.parseDouble(scanner.nextLine());

            Operation oper = OperationFactory.createOperation(strOperate);
            double result = oper.getResult(numberA, numberB);
            System.out.println("结果是：" + result);
        } catch (Exception e) {
            System.out.println("您的输入有错：" + e.toString());
        }
        System.out.println();
        System.out.println("**********************************************");

    }
}
