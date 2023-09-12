package online.superh;

import online.superh.haro.sharding.HaroShardingApp;
import online.superh.haro.sharding.mapper.OrderMapper;
import online.superh.haro.sharding.pojo.OrderDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-09-12 17:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HaroShardingApp.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testSelectById() {
        OrderDO order = orderMapper.selectById(1);
        System.out.println(order);
    }

    // @Test
    // public void testSelectListByUserId() {
    //     List<OrderDO> orders = orderMapper.selectListByUserId(1);
    //     System.out.println(orders.size());
    // }

    @Test
    public void testInsert() {
        OrderDO order = new OrderDO();
        order.setUserId(1);
        orderMapper.insert(order);
    }

}
