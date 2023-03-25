package id.co.gemardy.dukcapilvalidation.service.impl;

import org.springframework.stereotype.Service;

import id.co.gemardy.dukcapilvalidation.dto.request.DukcapilValidationRequest;
import id.co.gemardy.dukcapilvalidation.dto.response.DukcapilValidationResponse;
import id.co.gemardy.dukcapilvalidation.mapper.DukcapilValidationMapper;
import id.co.gemardy.dukcapilvalidation.service.DukcapilValidationService;

@Service
public class DukcapilValidationServiceImpl implements DukcapilValidationService {

    @Override
    public DukcapilValidationResponse validate(DukcapilValidationRequest request) {
        
        return DukcapilValidationMapper.INSTANCE.requestConvertToResponse(request);
    }
    
}
