package com.example.caseStudy.controllers;

import com.example.caseStudy.dto.APIResponseDTO;
import com.example.caseStudy.dto.ProductDTO;
import com.example.caseStudy.dto.UserDTO;
import com.example.caseStudy.services.VendingMachineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/vendingMachine")
public class MachineController {

    private VendingMachineService vendingMachineService;

    private MachineController(VendingMachineService vendingMachineService){
        this.vendingMachineService =vendingMachineService;
    }

    @GetMapping("/getProduct")
    public List<ProductDTO> getAllProduct(){
        return vendingMachineService.getAllProducts();
    }

    @PostMapping("/login")
    public APIResponseDTO login(@RequestBody UserDTO newUser){
        return vendingMachineService.login(newUser);
    }

    @PostMapping("/buyProduct")
    public APIResponseDTO buyProduct(@RequestBody  ProductDTO productDTO ){
        return vendingMachineService.buyOneProduct(productDTO);
    }

    @PostMapping("/updateCountProduct")
    public APIResponseDTO updateCountProduct(@RequestBody ProductDTO productDTO){
        return vendingMachineService.updateCountProduct( productDTO);
    }

    @PostMapping("/updatePriceProduct")
    public APIResponseDTO updatePriceProduct(@RequestBody ProductDTO productDTO){
        return vendingMachineService.updatePriceProduct( productDTO);
    }

    @PostMapping("/resetMachine")
    public APIResponseDTO resetMachine(){
        return vendingMachineService.resetMachine();
    }

    @PostMapping("/collectMoney")
    public APIResponseDTO collectMoney(){
        return vendingMachineService.collectMoney();
    }

}
