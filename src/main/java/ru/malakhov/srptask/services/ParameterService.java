package ru.malakhov.srptask.services;

import ru.malakhov.srptask.models.ResponseDTO;

public interface ParameterService {

    ResponseDTO setValue(int value);

    ResponseDTO getCalcResult(int pow, int add);

}
