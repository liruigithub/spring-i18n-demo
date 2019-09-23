package com.example.messgesupport.web.rest;

import com.example.messgesupport.util.MessageSourceUtils;
import com.example.messgesupport.util.RequestContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

@RestController
public class DemoRestController {

    @Autowired
    private MessageSourceUtils messageSourceUtils;

    @GetMapping("/demo")
    public String demo() {
        return "hello";
    }

    @GetMapping("/locale")
    @ResponseBody
    public String getLocale(@RequestParam("code") String code) throws UnsupportedEncodingException {
        Locale locale = RequestContextUtils.getRequest().getLocale();
        System.out.println(locale);
        if (StringUtils.isEmpty(code)) {
            return "null";
        }
        String msg = messageSourceUtils.getMessage(code, null, locale);
        System.out.printf(msg);
        return "{\"msg\":\"" + msg + "\"}";
    }

}
