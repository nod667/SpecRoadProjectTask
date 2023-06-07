package ru.malakhov.srptask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.malakhov.srptask.models.ResponseDTO;
import ru.malakhov.srptask.services.ParameterService;

@RestController
@RequestMapping("/app")
public class Controller {

    private ParameterService parameterService;

    @Autowired
    public Controller(ParameterService parameterService) {
        this.parameterService = parameterService;
    }

    @PostMapping("/set")
    public ResponseEntity<ResponseDTO> setValue(@RequestParam(value="value", required=true) int value) {
        return ResponseEntity.ok(parameterService.setValue(value));
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getResult(@RequestParam(value="pow", required=true) int pow,
                                                 @RequestParam(value="add", required=false, defaultValue="1") int add) {
        return ResponseEntity.ok(parameterService.getCalcResult(pow, add));
    }

}
