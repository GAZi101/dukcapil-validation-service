package id.co.gemardy.dukcapilvalidation.service;


import id.co.gemardy.dukcapilvalidation.dto.request.DukcapilValidationRequest;
import id.co.gemardy.dukcapilvalidation.dto.response.DukcapilValidationResponse;


public interface DukcapilValidationService {
    DukcapilValidationResponse validate(DukcapilValidationRequest request);
}
