package isep.eapli.demo_orm;

public class Automovel {
    int numKms;
    String matricula;

    public int getNumKms() {
        return numKms;
    }

    public void setNumKms(int numKms) {
        this.numKms = numKms;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "numKms=" + numKms +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
