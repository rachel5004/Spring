package com.sist.naver;
// XML => �뙆�떛 (jaxb)
/*
 *   <rss> ====> class => Rss
 *     <channel> ===> class => Channel
 *       <item>  ===> Item
 *        <title>�젣紐�</title> => Item 蹂��닔 
 *        <description>釉붾줈洹멸�</description>
 *       </item>
 *     </channel>
 *   </rss>
 */
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 *  xzCkjdHVMmHBQA5GsaNk
xpoZsdLvAt
 */

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

@Component
public class NaverManager{
	
    public void naverGetData(String finddata) {
    	String clientId = "sovyumgH7A2rheIKsX8B"; //애플리케이션 클라이언트 아이디
    	String clientSecret = "DbDav37TWm"; //애플리케이션 클라이언트 시크릿
        String text = null;
        try {
            text = URLEncoder.encode(finddata+"�뿉 蹂� �쁺�솕 異붿쿇", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("寃��깋�뼱 �씤肄붾뵫 �떎�뙣",e);
        }


        //String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text;    // json 寃곌낵
        String apiURL = "https://openapi.naver.com/v1/search/blog.xml?display=100&query="+ text; // xml 寃곌낵


        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("X-Naver-Client-Id", clientId);
        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
        String responseBody = get(apiURL,requestHeaders);


        System.out.println(responseBody);
        try {
        	FileWriter fw=new FileWriter("c:\\upload\\recommand.xml");
        	fw.write(responseBody);
        	fw.close();
        }catch(Exception ex){}
    }


    private static String get(String apiUrl, Map<String, String> requestHeaders){
        HttpURLConnection con = connect(apiUrl);
        try {
            con.setRequestMethod("GET");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }


            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // �젙�긽 �샇異�
                return readBody(con.getInputStream());
            } else { // �뿉�윭 諛쒖깮
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API �슂泥�怨� �쓳�떟 �떎�뙣", e);
        } finally {
            con.disconnect();
        }
    }


    private static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL�씠 �옒紐삳릺�뿀�뒿�땲�떎. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("�뿰寃곗씠 �떎�뙣�뻽�뒿�땲�떎. : " + apiUrl, e);
        }
    }


    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);


        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();


            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }


            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API �쓳�떟�쓣 �씫�뒗�뜲 �떎�뙣�뻽�뒿�땲�떎.", e);
        }
    }
    
    public List<String> naverBlogData(String finddata)
    {
    	List<String> list=new ArrayList<String>();
    	try
    	{
    		// XML�쓣 ���옣 
    		naverGetData(finddata);
    		// �뙆�떛 
    		JAXBContext jb=JAXBContext.newInstance(Rss.class);
    		// xml�깭洹몃�� �옄諛붽컼泥대줈 蹂��솚 
    		/*
    		 *   XML => �옄諛� (Unmarshaller)
    		 *   �옄諛� => XML (Marshaller) 
    		 */
    		Unmarshaller un=jb.createUnmarshaller();
    		Rss rss=(Rss)un.unmarshal(new File("c:\\upload\\recommand.xml"));
    		List<Item> nList=rss.getChannel().getItem();
    		for(Item i:nList)
    		{
    			list.add(i.getDescription());
    		}
    	}catch(Exception ex){}
    	return list;
    }
}














