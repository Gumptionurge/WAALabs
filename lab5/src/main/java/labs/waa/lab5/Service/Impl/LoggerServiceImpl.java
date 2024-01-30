package labs.waa.lab5.Service.Impl;

import labs.waa.lab5.Entity.DTO.LoggerDTO;
import labs.waa.lab5.Entity.Logger;
import labs.waa.lab5.Repository.LoggerRepository;
import labs.waa.lab5.Service.LoggerService;
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
