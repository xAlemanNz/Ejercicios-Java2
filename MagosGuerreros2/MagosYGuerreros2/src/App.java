import java.util.List;

class Personaje {
    private String claseDePersonaje;
    private int nivel;
    private int puntosDeVida;

    public void setClaseDePersonaje(String claseDePersonaje) {
        this.claseDePersonaje = claseDePersonaje;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public String getClaseDePersonaje() {
        return claseDePersonaje;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}

class Destino {
    private String nombre;
    private int habitantes;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }
}

enum MetodoDeViaje {
    A_PIE,
    A_CABALLO
}

class MaestroDelJuego {

    public String describir(Personaje personaje) {
        return "Eres un " + personaje.getClaseDePersonaje() + " de nivel " + personaje.getNivel()
                + " con " + personaje.getPuntosDeVida() + " puntos de vida.";
    }

    public String describir(Destino destino) {
        return "Has llegado a " + destino.getNombre() + ", que tiene " + destino.getHabitantes() + " habitantes.";
    }

    public String describir(MetodoDeViaje metodo) {
        if (metodo == MetodoDeViaje.A_CABALLO) {
            return "Estás viajando a tu destino a caballo.";
        } else {
            return "Estás viajando a tu destino a pie.";
        }
    }

    public String describir(Personaje personaje, Destino destino, MetodoDeViaje metodo) {
        return describir(personaje) + " " + describir(metodo) + " " + describir(destino);
    }

    public String describir(Personaje personaje, Destino destino) {
        return describir(personaje, destino, MetodoDeViaje.A_PIE);
    }
}

class MagosYGuerreros2 {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        personaje.setClaseDePersonaje("Mago");
        personaje.setNivel(4);
        personaje.setPuntosDeVida(28);

        Destino destino = new Destino();
        destino.setNombre("Muros");
        destino.setHabitantes(732);

        MaestroDelJuego maestro = new MaestroDelJuego();

        System.out.println(maestro.describir(personaje));
        System.out.println(maestro.describir(destino));
        System.out.println(maestro.describir(MetodoDeViaje.A_CABALLO));
        System.out.println(maestro.describir(personaje, destino, MetodoDeViaje.A_CABALLO));
        System.out.println(maestro.describir(personaje, destino));
    }
}