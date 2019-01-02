package com.coreteka.filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class UserRequestWrapper extends HttpServletRequestWrapper {

    private String body;

    UserRequestWrapper(HttpServletRequest request, String body) {
        super(request);
        this.body = body;
    }

    @Override
    public BufferedReader getReader(){
        return new BufferedReader(new StringReader(body));
    }
}