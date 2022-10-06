package br.com.dio.parking.controller.service;

import org.testcontainers.containers.MSSQLServerContainer;

public class AbstractContainerBase {

    static final MSSQLServerContainer SQL_SERVER_CONTAINER;

    static {
        SQL_SERVER_CONTAINER = new MSSQLServerContainer("localhost");
        SQL_SERVER_CONTAINER.start();

        System.setProperty("spring.datasource.url", SQL_SERVER_CONTAINER.getJdbcUrl());
        System.setProperty("spring.datasource.usename", SQL_SERVER_CONTAINER.getUsername());
        System.setProperty("spring.datasource.password", SQL_SERVER_CONTAINER.getPassword());
    }

}
