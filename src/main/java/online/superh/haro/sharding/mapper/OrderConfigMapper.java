package online.superh.haro.sharding.mapper;

import online.superh.haro.sharding.pojo.OrderConfigDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-09-12 17:24
 */
@Repository
public interface OrderConfigMapper {

    OrderConfigDO selectById(@Param("id") Integer id);

}
