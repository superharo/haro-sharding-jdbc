package online.superh.haro.sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import online.superh.haro.sharding.pojo.OrderDO;
import org.springframework.stereotype.Repository;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-09-12 17:10
 */
@Repository
public interface OrderMapper extends BaseMapper<OrderDO> {

    // OrderDO selectById(@Param("id") Integer id);
    //
    // List<OrderDO> selectListByUserId(@Param("userId") Integer userId);
    //
    // void insert(OrderDO order);

}
