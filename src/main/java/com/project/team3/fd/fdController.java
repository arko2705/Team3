package com.project.team3.fd;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/fd")
public class fdController {

    private final fdService fdService;

    public fdController(fdService fdService) {
        this.fdService = fdService;
    }

    @PostMapping("/calculate-maturity")
    @ResponseBody
    public fdResponse calculateMaturity(@RequestBody fdRequest request) {
        double maturityAmount = fdService.calculateMaturityAmount(request);
        fdResponse response = new fdResponse();
        response.setMaturityAmount(maturityAmount);
        return response;
    }
}
