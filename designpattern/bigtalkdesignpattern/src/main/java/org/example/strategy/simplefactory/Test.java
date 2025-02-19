package org.example.strategy.simplefactory;

import org.example.strategy.CashSuper;

import java.util.Scanner;

/**
 * @Author: zongz
 * @Date: 2024-12-09
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("**********************************************");
        System.out.println("《大话设计模式》代码样例");
        System.out.println();

        // 商品折扣模式(1.正常收费 2.打八折 3.打七折)
        int discount = 0;

        // 商品单价
        double price = 0d;
        // 商品购买数量
        int num = 0;
        // 当前商品合计费用
        double totalPrices = 0d;
        // 总计所有商品费用
        double total = 0d;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("请输入商品折扣模式（1.正常收费 2.打八折 3.打七折 4.满300送100）：");
            discount = Integer.parseInt(sc.nextLine());
            System.out.println("请输入商品单价：");
            price = Double.parseDouble(sc.nextLine());
            System.out.println("请输入商品数量：");
            num = Integer.parseInt(sc.nextLine());
            System.out.println();

            if (price > 0 && num > 0) {

                //简单工厂模式根据discount的数字选择合适的收费类生成实例
                CashSuper csuper = CashFactory.createCashAccept(discount);
                //通过多态，可以根据不同收费策略计算得到收费的结果
                totalPrices = csuper.acceptCash(price, num);

                total = total + totalPrices;

                System.out.println();
                System.out.println("单价：" + price + "元 数量：" + num + " 合计：" + totalPrices + "元");
                System.out.println();
                System.out.println("总计：" + total + "元");
                System.out.println();
            }
        } while (price > 0 && num > 0);

        System.out.println();
        System.out.println("**********************************************");
    }
}
