package moshi.daili.two;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author fandayong
 * @Date 2021/4/18 12:11 PM
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.creeateOrder(order);
            System.out.println(DynamicDataSourceEntry.get());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}

