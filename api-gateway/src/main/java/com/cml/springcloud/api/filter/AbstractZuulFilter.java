package com.cml.springcloud.api.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;

public abstract class AbstractZuulFilter extends ZuulFilter {
	protected static Logger logger = LoggerFactory.getLogger(AbstractZuulFilter.class);
}
