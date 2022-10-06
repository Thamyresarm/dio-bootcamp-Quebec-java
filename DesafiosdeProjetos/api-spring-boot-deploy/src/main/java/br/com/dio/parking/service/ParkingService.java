package br.com.dio.parking.service;

import br.com.dio.parking.exception.ParkingNotfoundExeption;
import br.com.dio.parking.model.Parking;
import br.com.dio.parking.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class ParkingService {

    /*private static Map<String, Parking> parkingMap = new HashMap<>();
    static {
        var id = getUUID();
        var id1 = getUUID();
        Parking parking = new Parking(id, "QWS-1111", "SC", "CELTA", "PRETO");
        Parking parking1 = new Parking(id1, "TTT-1111", "SP", "GOL", "BRANCO");
        parkingMap.put(id, parking);
        parkingMap.put(id1, parking1);
    }*/

    @Autowired
    private final ParkingRepository parkingRepository;

    public ParkingService(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<Parking> findAlL() {
        return parkingRepository.findAll();
        //return parkingMap.values().stream().collect(Collectors.toList());
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Parking findById(String id) {

        return parkingRepository.findById(id).orElseThrow(() ->
                new ParkingNotfoundExeption(id));

     /*   Parking parking = parkingMap.get(id);
        if (parking == null) {
            throw new ParkingNotfoundExeption(id);
        }
        return parkingMap.get(id);*/
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    @Transactional
    public Parking create(Parking parkingCreate) {
        String uuid = getUUID();
        parkingCreate.setId(uuid);
        parkingCreate.setEntryDate(LocalDateTime.now());
        parkingRepository.save(parkingCreate);
        //parkingMap.put(uuid, parkingCreate);
        return parkingCreate;
    }

    @Transactional
    public void delete(String id) {
        Parking parking = findById(id);
        parkingRepository.delete(parking);
        // parkingMap.remove(id);
    }

    //Criar um DTO para Update
    @Transactional
    public Parking update(String id, Parking parkingCreate) {
        Parking parking = findById(id);
        //verificar se nao é nulo para cada campo
        parking.setColor(parkingCreate.getColor());
        parking.setState(parkingCreate.getState());
        parking.setModel(parkingCreate.getModel());
        parking.setLicense(parkingCreate.getLicense());
        parkingRepository.save(parking);
        //parkingMap.replace(id, parking);
        return parking;
    }

    @Transactional
    public Parking checkOut(String id) {
        Parking parking = findById(id);
        parking.setExitDate(LocalDateTime.now());
        parking.setBill(ParkingCheckout.getBill(parking));
        parkingRepository.save(parking);
        return parking;
    }
}
