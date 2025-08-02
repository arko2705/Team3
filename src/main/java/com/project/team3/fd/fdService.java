package com.project.team3.fd;

import org.springframework.stereotype.Service;

@Service
public class fdService {
    public double calculateMaturityAmount(fdRequest request) {
        double principal = request.getPrincipal();
        double rate = request.getRate();
        double time = request.getTime();
        
        // Assuming the formula for maturity amount is A = P(1 + rt)
        // where A is the maturity amount, P is the principal, r is the rate, and t is the time
        return principal * (1 + (rate / 100) * time);
    }
}
