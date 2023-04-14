package entities;

public class Curso extends Conteudo {
    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
