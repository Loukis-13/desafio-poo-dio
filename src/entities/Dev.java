package entities;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();


    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevs().add(this);
    }

    public void progredir() {
        if (!conteudosInscritos.isEmpty()) {
            conteudosConcluidos.add(conteudosInscritos.remove(0));
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(List<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
