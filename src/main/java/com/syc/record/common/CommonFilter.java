package com.syc.record.common;


import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import java.io.IOException;

public class CommonFilter implements Filter {
    private String characterEncoding;
    @Override
    public void init(FilterConfig filterConfig){
        characterEncoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (StringUtils.isNotBlank(characterEncoding)) {
            servletRequest.setCharacterEncoding(characterEncoding);
            servletResponse.setCharacterEncoding(characterEncoding);
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {

    }
}
