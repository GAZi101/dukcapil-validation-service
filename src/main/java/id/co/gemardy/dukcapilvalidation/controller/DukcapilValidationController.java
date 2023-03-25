package id.co.gemardy.dukcapilvalidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import id.co.gemardy.dukcapilvalidation.adapter.APIAdapter;
import id.co.gemardy.dukcapilvalidation.dto.request.DukcapilValidationRequest;
import id.co.gemardy.dukcapilvalidation.service.DukcapilValidationService;
import jakarta.validation.Valid;

@RestController
public class DukcapilValidationController {
    
    private final DukcapilValidationService dukcapilValidationService;
    private final APIAdapter apiAdapter;

    @Autowired
    public DukcapilValidationController(DukcapilValidationService dukcapilValidationService, APIAdapter apiAdapter) {
        this.dukcapilValidationService = dukcapilValidationService;
        this.apiAdapter = apiAdapter;
    }



    @PostMapping("/dukcapul-validation")
    @ResponseBody
    public ResponseEntity<?> applyMortgage(@RequestBody @Valid DukcapilValidationRequest validationRequest) {
        return apiAdapter.createResponse(dukcapilValidationService.validate(validationRequest));
    }
}
