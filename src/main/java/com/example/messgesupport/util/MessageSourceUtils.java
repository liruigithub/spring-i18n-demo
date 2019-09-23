package com.example.messgesupport.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageSourceUtils {

    private MessageSource messageSource;

    private Locale locale;

    @Autowired
    public MessageSourceUtils(@Qualifier("reloadableResourceBundleMessageSource") MessageSource messageSource) {
        this.messageSource = messageSource;
        locale = Locale.CHINA;
    }

    public String getMessage(String code, Object... args) {
        return this.messageSource.getMessage(code, args, locale);
    }

    public String getMessage(String code, Object[] args, Locale locale) {
        return this.messageSource.getMessage(code, args, locale);
    }
}

