package com.test.web.common;

import com.test.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ljg on 2017/2/21.
 */
@Controller
@RequestMapping("/common")
public class CommonController extends BaseController{

    @RequestMapping(value = "/datas",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getDatas(){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result","ok");
        return map;
    }

    @RequestMapping(value = "/datas2",method = RequestMethod.GET)
    public String getDatas2(){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result","ok");
        return "xx";
    }
}
