package com.dca.app.zuul.server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class PostTiempoTranscurridoFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(PostTiempoTranscurridoFilter.class);

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {


        RequestContext rq = RequestContext.getCurrentContext();
        HttpServletRequest request = rq.getRequest();

        log.info("Entrando al post filter");

        Long tiempoInicio = (Long)request.getAttribute("tiempoInicio");
        Long tiempoFinal = System.currentTimeMillis();
        Long tiempoTranscurrido = tiempoFinal - tiempoInicio;

        log.info(String.format("Tiempo transcurrido en segundos: %s", tiempoTranscurrido.doubleValue() / 1000.00));
        log.info(String.format("Tiempo transcurrido en milisegundos: %s", tiempoTranscurrido));

        return null;
    }
}
