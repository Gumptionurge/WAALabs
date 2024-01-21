package labs.waa.lab4.Service.Impl;

import labs.waa.lab4.Entity.DTO.LoggerDTO;
import labs.waa.lab4.Entity.Logger;
import labs.waa.lab4.Repository.LoggerRepository;
import labs.waa.lab4.Service.LoggerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {
    @Autowired
    LoggerRepository loggerRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public void log(LoggerDTO loggerDTO) {
        loggerRepository.save(modelMapper.map(loggerDTO, Logger.class));
    }
}
