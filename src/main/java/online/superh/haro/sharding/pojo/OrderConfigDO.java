package online.superh.haro.sharding.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-09-12 17:08
 */
@TableName("order_config")
@Data
public class OrderConfigDO {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 支付超时时间
     * 单位：分钟
     */
    private Integer payTimeout;

}
