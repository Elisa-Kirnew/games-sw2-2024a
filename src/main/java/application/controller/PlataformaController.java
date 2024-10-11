package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResquestBody;

import application.modal.Plataforma;
import application.Plataformarepository;

@RestController
@RequestMapping("/plataformas")
public class PlataformaController {
    @Autowired
    private Plataformarepository plataformaRepo;

    @PostMapping
    public Plataforma insert(@ResquestBody Plataforma plaforma) {
        return plataformaRepo.save(plataforma);
    }
}
