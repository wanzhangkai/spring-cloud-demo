package com.pipikai.order.utils;

import java.util.Random;

/**
 * Created by wanzhangkai
 * 2018/11/21 21:55
 * Email: zhangkaiwan@qq.com
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式；时间+随机数
     *
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return String.valueOf(System.currentTimeMillis() + number);
    }
}
