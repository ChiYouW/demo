package com.mytomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxiansheng
 * @create 2019-03-10 16:26
 *
 * 在之前的servlet开发中,我们在web.xml中配置<servlet></servlet>和<servlet-mapping></servlet-mapping>来指定url交给哪个servlet处理
 *
 */
public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();

    static{
        servletMappingList.add(new ServletMapping("findGril","/girl","com.mytomcat.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("helloWorld","/world","com.mytomcat.HelloWroldServlet"));
    }

}
