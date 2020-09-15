package aula06.ExercRelogio;

/**
 * Relogio
 */
public class Relogio {
    private int hora = 0, minuto = 0, segundo = 0;

    public String getHora() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public void setHorario(int segundo) {
        if (segundo <= 60) {
            this.segundo = segundo;
            if (segundo == 60) {
                this.segundo = 0;
                this.minuto++;
                if (minuto == 60) {
                    this.minuto = 0;
                    this.hora++;
                    if (hora == 23) {
                        this.hora = 0;
                    }
                }
            }
        }
    }
}