abstract class Luchador {
    public abstract boolean esVulnerable();
    public abstract int calcularDanio(Luchador oponente);

    @Override
    public abstract String toString();
}

class Guerrero extends Luchador {

    @Override
    public String toString() {
        return "El luchador es un Guerrero";
    }

    @Override
    public boolean esVulnerable() {
        return false;
    }

    @Override
    public int calcularDanio(Luchador oponente) {
        return oponente.esVulnerable() ? 10 : 6;
    }
}

class Mago extends Luchador {
    private boolean hechizoPreparado = false;

    public void prepararHechizo() {
        hechizoPreparado = true;
    }

    @Override
    public String toString() {
        return "El luchador es un Mago";
    }

    @Override
    public boolean esVulnerable() {
        return !hechizoPreparado;
    }

    @Override
    public int calcularDanio(Luchador oponente) {
        return hechizoPreparado ? 12 : 3;
    }
}

class MagosYGuerreros {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero();
        Mago mago = new Mago();

        System.out.println(guerrero);
        System.out.println(mago);

        System.out.println("¿Guerrero vulnerable?: " + guerrero.esVulnerable());
        System.out.println("¿Mago vulnerable (sin hechizo)?: " + mago.esVulnerable());

        System.out.println("Daño del guerrero contra el mago (vulnerable): " + guerrero.calcularDanio(mago));

        mago.prepararHechizo();
        System.out.println("¿Mago vulnerable (con hechizo)?: " + mago.esVulnerable());
        System.out.println("Daño del mago contra el guerrero (con hechizo): " + mago.calcularDanio(guerrero));
    }
}