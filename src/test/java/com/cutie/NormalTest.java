package com.cutie;

import com.cutie.utils.DateUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
    public void getExactTimeStamp() {
        String currentTimeMillis = String.valueOf(System.currentTimeMillis());
        currentTimeMillis = currentTimeMillis.substring(0, 9);
        logger.info("currentTimeMillis :{}", currentTimeMillis);
    }

    @Test
    public void getDateRange() throws ParseException {
        Calendar cal = Calendar.getInstance();
        String start = "2018-01-01";
        String end = "2018-04-30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dBegin = sdf.parse(start);
        Date dEnd = sdf.parse(end);
        List<Date> lDate = DateUtils.findDates(dBegin, dEnd);
        for (Date date : lDate) {
            System.out.println(sdf.format(date));
        }
    }

}
