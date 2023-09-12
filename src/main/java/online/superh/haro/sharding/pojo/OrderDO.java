package online.superh.haro.sharding.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-09-12 16:54
 */
@TableName(value = "orders")//需要和分库分表规则中设置的一致，要使用 MyBatis-Plus 给咱自动生成 CRUD 操作
@Data
public class OrderDO {
    /**
     * 订单编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;
}
