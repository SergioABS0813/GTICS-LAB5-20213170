package com.example.gticslab5.Controller;

import com.example.gticslab5.Entity.Technician;
import com.example.gticslab5.Repository.TechnicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TecnicoController {

    @Autowired
    TechnicianRepository technicianRepository;

    @GetMapping("/tecnicos")
    public String listaTecnicos(Model model){
        List<Technician> listaTecnicos = technicianRepository.listarTecnicos();
        model.addAttribute("listaTecnicos", listaTecnicos);
        return "tecnicos/lista";
    }

}
