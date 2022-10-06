package br.com.dio.parking.controller.dto;

import lombok.Data;

@Data
public class ParkingCreateDTO {
    private String id;
    private String license;
    private String state;
    private String model;
    private String color;
}
