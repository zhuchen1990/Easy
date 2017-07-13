package com.ezreal.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Ezreal# on 2017/7/13.
 */
public class JsoupTest {
    /**
     *解析一个html字符串
     */
    @Test
    public void paresTest(){
        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc = Jsoup.parse(html);
        System.out.print(doc);
    }
    /**
     *假如你有一个HTML片断 (比如. 一个 div 包含一对 p 标签; 一个不完整的HTML文档) 想对它进行解析。
     * 这个HTML片断可以是用户提交的一条评论或在一个CMS页面中编辑body部分。
     */
    @Test
    public void parseBodyFragmentTest(){
        String html = "<div><p>Lorem ipsum.</p>";
        Document doc = Jsoup.parseBodyFragment(html);
        Element body = doc.body();
        System.out.print(body);
    }

    /**
     * 从一个网站获取和解析一个HTML文档，并查找其中的相关数据，可以使用 Jsoup.connect(String url)方法。
     * connect(String url) 方法创建一个新的 Connection 和 get() 取得和解析一个HTML文件。
     * 如果从该URL获取HTML时发生错误，便会抛出 IOException，应适当处理。
     *
     * 这个方法只支持Web URLs (http 和 https 协议); 假如你需要从一个文件加载，可以使用 parse(File in, String charsetName) 代替。
     * @throws IOException
     */
    @Test
    public void connectTest()throws IOException{
//        Document doc =Jsoup.connect("网址/").get();
//        String title = doc.title();
//        Document doc =Jsoup.connect("网址/")
//                .data("query", "Java") //请求参数
//                .userAgent("I’mjsoup") //设置User-Agent
//                .cookie("auth", "token") //设置cookie
//                .timeout(3000) //设置连接超时时间
//                .post(); //使用POST方法访问URL

        Document doc = Jsoup.connect("http://example.com/")
                .data("query", "Java")
                .userAgent("Mozilla")
                .cookie("auth", "token")
                .timeout(3000)
                .post();
        System.out.print(doc);
    }

}
