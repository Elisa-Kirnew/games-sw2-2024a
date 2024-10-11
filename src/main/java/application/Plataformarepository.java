package application;

import org.springframework.data.repository.JpaRepository;

import application.modal.Plataforma;

public class Plataformarepository extends JpaRepository<Plataforma, long> {
    public Plataforma findByNome(String, nome);
}
