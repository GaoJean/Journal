package com.journal.common.logger.slf4j;

import com.journal.common.logger.Logger;

import java.io.Serializable;


public class Slf4jLogger implements Logger, Serializable {

	private static final long serialVersionUID = 1L;

	private final org.slf4j.Logger logger;

	public Slf4jLogger(final org.slf4j.Logger logger) {
		this.logger = logger;
	}

    @Override
    public void trace(final String msg) {
        logger.trace(msg);
    }
    
    @Override 
    public void trace(final String pattern, final Object param){
        logger.trace(pattern,param);
    }
    
    @Override
    public void trace(final String pattern, final Object param1, final Object param2){
        logger.trace(pattern,param1,param2);
    }
    
    @Override
    public void trace(final String pattern, final Object... paramArray){
        logger.trace(pattern,paramArray);
    }

    @Override
    public void trace(final Throwable e) {
        logger.trace(e.getMessage(), e);
    }

    @Override
    public void trace(final String msg, final Throwable e) {
        logger.trace(msg, e);
    }

    @Override
    public void debug(final String msg) {
        logger.debug(msg);
    }
    
    @Override 
    public void debug(final String pattern, final Object param){
        logger.debug(pattern,param);
    }
    
    @Override
    public void debug(final String pattern, final Object param1, final Object param2){
        logger.debug(pattern,param1,param2);
    }
    
    @Override
    public void debug(final String pattern, final Object... paramArray){
        logger.debug(pattern,paramArray);
    }

    @Override
    public void debug(final Throwable e) {
        logger.debug(e.getMessage(), e);
    }

    @Override
    public void debug(final String msg, final Throwable e) {
        logger.debug(msg, e);
    }

    @Override
    public void info(final String msg) {
        logger.info(msg);
    }

    @Override
    public void info(final Throwable e) {
        logger.info(e.getMessage(), e);
    }

    @Override
    public void info(final String msg, final Throwable e) {
        logger.info(msg, e);
    }
    
    @Override 
    public void info(final String pattern, final Object param){
        logger.info(pattern,param);
    }
    
    @Override
    public void info(final String pattern, final Object param1, final Object param2){
        logger.info(pattern,param1,param2);
    }
    
    @Override
    public void info(final String pattern, final Object... paramArray){
        logger.info(pattern,paramArray);
    }

    @Override
    public void warn(final String msg) {
        logger.warn(msg);
    }
    
    @Override 
    public void warn(final String pattern, final Object param){
        logger.warn(pattern,param);
    }
    
    @Override
    public void warn(final String pattern, final Object param1, final Object param2){
        logger.warn(pattern,param1,param2);
    }
    
    @Override
    public void warn(final String pattern, final Object... paramArray){
        logger.warn(pattern,paramArray);
    }
    
    @Override
    public void warn(final Throwable e) {
        logger.warn(e.getMessage(), e);
    }

    @Override
    public void warn(final String msg, final Throwable e) {
        logger.warn(msg, e);
    }

    @Override
    public void error(final String msg) {
        logger.error(msg);
    }
    
    @Override 
    public void error(final String pattern, final Object param){
        logger.error(pattern,param);
    }
    
    @Override
    public void error(final String pattern, final Object param1, final Object param2){
        logger.error(pattern,param1,param2);
    }
    
    @Override
    public void error(final String pattern, final Object... paramArray){
        logger.error(pattern,paramArray);
    }
    
    @Override
    public void error(final Throwable e) {
        logger.error(e.getMessage(), e);
    }

    @Override
    public void error(final String msg, final Throwable e) {
        logger.error(msg, e);
    }
}
