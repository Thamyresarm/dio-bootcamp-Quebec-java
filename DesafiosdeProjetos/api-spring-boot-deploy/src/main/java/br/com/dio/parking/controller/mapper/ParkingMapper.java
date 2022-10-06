package br.com.dio.parking.controller.mapper;

import br.com.dio.parking.controller.dto.ParkingCreateDTO;
import br.com.dio.parking.controller.dto.ParkingDTO;
import br.com.dio.parking.model.Parking;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ParkingMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ParkingDTO toparkingDTO(Parking parking){
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }

    public List<ParkingDTO> toparkingDTOList(List<Parking> parkingList){
        return parkingList.stream().map(this::toparkingDTO).collect(Collectors.toList());
    }

    public Parking toparking(ParkingDTO dto) {
        return MODEL_MAPPER.map(dto, Parking.class);
    }

    public Parking toparkingCreate(ParkingCreateDTO dto) {
        return MODEL_MAPPER.map(dto, Parking.class);
    }
}
