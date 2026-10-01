import java.util.ArrayList;
import java.util.List;

class ListaDeIdiomas {
    private List<String> idiomas = new ArrayList<>();

    public boolean estaVacia() {
        return idiomas.isEmpty();
    }

    public void agregarIdioma(String idioma) {
        idiomas.add(idioma);
    }

    public void eliminarIdioma(String idioma) {
        idiomas.remove(idioma);
    }

    public String primerIdioma() {
        return idiomas.get(0);
    }

    public int contar() {
        return idiomas.size();
    }

    public boolean contieneIdioma(String idioma) {
        return idiomas.contains(idioma);
    }

    public boolean esEmocionante() {
        return idiomas.contains("Java") || idiomas.contains("Kotlin");
    }

    public static void main(String[] args) {
        ListaDeIdiomas lista = new ListaDeIdiomas();

        System.out.println("¿Está vacía?: " + lista.estaVacia());

        lista.agregarIdioma("Kotlin");
        lista.agregarIdioma("Python");
        lista.agregarIdioma("Ruby");

        System.out.println("¿Está vacía?: " + lista.estaVacia());
        System.out.println("Primer idioma: " + lista.primerIdioma());
        System.out.println("Cantidad de idiomas: " + lista.contar());

        lista.eliminarIdioma("Ruby");
        System.out.println("¿Contiene Ruby?: " + lista.contieneIdioma("Ruby"));
        System.out.println("¿Contiene Python?: " + lista.contieneIdioma("Python"));

        System.out.println("¿Es emocionante?: " + lista.esEmocionante());
    }
}