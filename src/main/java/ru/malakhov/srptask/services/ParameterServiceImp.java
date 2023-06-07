package ru.malakhov.srptask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.malakhov.srptask.models.ResponseDTO;
import ru.malakhov.srptask.models.ValueKeeper;

@Service
public class ParameterServiceImp implements ParameterService{

    private ValueKeeper valueKeeper;

    @Autowired
    public ParameterServiceImp(ValueKeeper valueKeeper) {
        this.valueKeeper = valueKeeper;
    }

    @Override
    public ResponseDTO setValue(int value) {
        ResponseDTO responseDTO = new ResponseDTO();
        valueKeeper.setValue(value);
        responseDTO.setResult("success");
        return responseDTO;
    }

    @Override
    public ResponseDTO getCalcResult(int pow, int add) {
        ResponseDTO responseDTO = new ResponseDTO();
        int result = (pow * valueKeeper.getValue()) + add;
        responseDTO.setResult(String.valueOf(result));
        return responseDTO;
    }

}
