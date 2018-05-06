package com.cutie;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by cutie on 2018/5/6.
 */
public class NormalTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 获取网球请求参数中的 时间戳
     * e.g. 152561642
     */
    @Test
    public void getExactTimeStamp(){
        String currentTimeMillis = String.valueOf(System.currentTimeMillis());
        currentTimeMillis = currentTimeMillis.substring(0,9);
        logger.info("currentTimeMillis :{}", currentTimeMillis);
    }
}
