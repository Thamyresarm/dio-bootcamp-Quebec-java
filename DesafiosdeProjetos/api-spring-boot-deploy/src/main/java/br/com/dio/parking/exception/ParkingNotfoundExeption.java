package br.com.dio.parking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ParkingNotfoundExeption extends RuntimeException {

    public ParkingNotfoundExeption(String id) {
        super("Parking not found with id: " + id);
    }

}
