package moshi.daili.two;

import lombok.Data;

/**
 * @Author fandayong
 * @Date 2021/4/18 12:00 PM
 * @description
 */
@Data
public class Order {
    private Object orderInfo;
    private Long createTime;
    private String id;
}
