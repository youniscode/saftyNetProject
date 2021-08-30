package com.example.SafetyNey.controller;

public class FireStationsController {

    @RequestMapping(value = "phoneAlert", method = RequestMethod.GET)
    public List<String> phoneNumberList(@RequestParam(name = "fireStation") int number) {

        return this.fireStationService.findPhoneNumbersByStationNumber(number);

    }


}
