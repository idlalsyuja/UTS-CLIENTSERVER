/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idlal.nasabah.controller;

import com.idlal.nasabah.VO.nasabah;
import com.idlal.nasabah.service.NasabahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author IDLAL SYUJA NIZHAMUL
 */
@RestController
@RequestMapping ("/nasabah")
public class NasabahController {
    @Autowired
    private NasabahService nasabahService;
    @PostMapping("/")
    public nasabah saveNasabah (@RequestBody nasabah nasabah){
        return nasabahService.saveNasabah(nasabah);
    }
    @GetMapping("/id")
    public nasabah findNasabahById (@PathVariable("id")long pelangganId){
        Long nasabahId = null;
        return nasabahService.findNasabahById (nasabahId);
    }
}

