package moshi.daili.two;

/**
 * @Author fandayong
 * @description
 */
public class OrderService implements IOrderService{
    private OrderDao orderDao;
    public OrderService(){
        orderDao = new OrderDao();
    }
    @Override
    public int creeateOrder(Order order) {
        System.out.println("orderService使用orderDao创建Order成功");
        return orderDao.insert(order);
    }
}
