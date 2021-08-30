package com.example.SafetyNey.model;

public class FireStation {

    public List<FireStation> findAllFireStationsAddressByNumber(Integer number) {

        return dataHandler.getData().getFirestations().stream().filter(p -> p.getStation().equals(number.toString())).collect(Collectors.toList());
    }
    private boolean personsContainsFirestationAddress(List<FireStation> fireStations, Person person) {
        for (FireStation fireStation : fireStations) {
            if (fireStation.getAddress().equals(person.getAdress())) {
                return true;
            }
        }
        return false;
    }
}
