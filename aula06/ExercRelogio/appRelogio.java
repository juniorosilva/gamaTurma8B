package aula06.ExercRelogio;

/**
 * appRelogio
 */
public class appRelogio {
    public static void main(String[] args) {

        Relogio h = new Relogio();

        for (int i = 0; i < 120; i++) {
            h.setHorario(i);
            System.out.println(h.getHora());
        }
    }
}