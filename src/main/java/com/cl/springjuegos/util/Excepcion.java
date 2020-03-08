package com.cl.springjuegos.util;

public class Excepcion extends RuntimeException{

	private static final long serialVersionUID = 1L;
    private String msg;

    public Excepcion(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
