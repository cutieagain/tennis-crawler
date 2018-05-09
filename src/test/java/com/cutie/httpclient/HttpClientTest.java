package com.cutie.httpclient;

import com.cutie.entity.tennis.games.TennisGames;
import com.cutie.entity.tennis.singleGame.TennisRoot;
import com.cutie.utils.DateUtils;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by cutie on 2018/5/6.
 */
public class HttpClientTest {

    @Test
    public void getScoreDetail()throws Exception{
//        this.getScoreDetail("7795697");
    }

    @Test
    public void getResult() throws Exception {
        Calendar cal = Calendar.getInstance();
        String start = "2018-01-01";
        String end = "2018-04-30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dBegin = sdf.parse(start);
        Date dEnd = sdf.parse(end);
        List<Date> lDate = DateUtils.findDates(dBegin, dEnd);
        for (Date date : lDate) {
            System.out.println(sdf.format(date));
            this.getMatchList(sdf.format(date));
        }
    }


    public void getMatchList(String date)throws Exception{//2018-05-06
        //创建一个httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个uri对象
        URIBuilder uriBuilder = new URIBuilder("https://www.sofascore.com/tennis//"+ date +"/json");
        String currentTimeMillis = String.valueOf(System.currentTimeMillis());
        currentTimeMillis = currentTimeMillis.substring(0,9);
        uriBuilder.addParameter("_", currentTimeMillis);//"152561951"
        HttpGet get = new HttpGet(uriBuilder.build());
        //执行请求
        CloseableHttpResponse response =httpClient.execute(get);
        //取响应的结果
        int statusCode =response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        HttpEntity entity =response.getEntity();
        String string = EntityUtils.toString(entity,"utf-8");
        Gson gson = new Gson();
        System.out.println("gson format:");
        System.out.println(string);
        TennisGames tennisGames = gson.fromJson(string, TennisGames.class);
        /*System.out.println(gson.toJson(tennisGames));
        System.out.println(gson.toJson(tennisGames.getSportItem().getTournaments().get(0).getEvents().get(0).getId()));*/

        for (int i = 0; i < tennisGames.getSportItem().getTournaments().size(); i++) {
            for (int j = 0; j < tennisGames.getSportItem().getTournaments().get(i).getEvents().size(); j++) {
                this.getScoreDetail(String.valueOf(tennisGames.getSportItem().getTournaments().get(i).getEvents().get(j).getId()), date);
            }
        }
        //this.getScoreDetail(String.valueOf(tennisGames.getSportItem().getTournaments().get(0).getEvents().get(0).getId()), date);

        //关闭httpclient
        response.close();
        httpClient.close();
    }

    private String getScoreDetail(String id, String date) throws Exception{
        //创建一个httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个uri对象
//        URIBuilder uriBuilder = new URIBuilder("https://www.sofascore.com/event/7791152/json");
        String str = "https://www.sofascore.com/event/"+ id +"/general/json";
        URIBuilder uriBuilder = new URIBuilder(str);
        String currentTimeMillis = String.valueOf(System.currentTimeMillis());
        currentTimeMillis = currentTimeMillis.substring(0,9);
        uriBuilder.addParameter("_", currentTimeMillis);//"152561951"
        HttpGet get = new HttpGet(uriBuilder.build());
        //执行请求
        CloseableHttpResponse response =httpClient.execute(get);
        //取响应的结果
        int statusCode =response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        HttpEntity entity =response.getEntity();
        String string = EntityUtils.toString(entity,"utf-8");
        Gson gson = new Gson();
        System.out.println("gson format:");
        System.out.println(string);

        this.saveAsFileWriter(date+"_"+id, string);

        /*TennisRoot tennisRoot = gson.fromJson(string, TennisRoot.class);
        System.out.println(gson.toJson(tennisRoot));
        System.out.println(gson.toJson(tennisRoot.getPointByPoint().get(0).getGames().get(0)));*/

        //关闭httpclient
        response.close();
        httpClient.close();
        return string;
    }


    private static void saveAsFileWriter(String fileName, String content) {
        String savefile = "C:\\Users\\cutie\\Desktop\\tennisJson\\"+ fileName +".txt";
        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(savefile);
            fwriter.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
