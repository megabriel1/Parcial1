
package com.mycompany.practicados.controller;

import com.mycompany.practicados.service.ProveedorService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Resource
private ProveedorService proveedorService;
    
    @GetMapping("/index")
    public String get(Model model) {

        model.addAttribute("proveedorList", proveedorService.buscarProveedorList());
        
        return "index";
    }
    @GetMapping("/")
    public String getEliminado(Model model) {

        model.addAttribute("proveedorList", proveedorService.buscarEliminadosList());

        return "index";
    }
}
