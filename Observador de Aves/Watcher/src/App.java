class ObservadorDeAves {
    private int[] conteoDiario;

    public ObservadorDeAves(int[] conteoDiario) {
        this.conteoDiario = conteoDiario;
    }

    public static int[] obtenerSemanaPasada() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int obtenerConteoDeHoy() {
        return conteoDiario[conteoDiario.length - 1];
    }

    public void incrementarConteoDeHoy() {
        conteoDiario[conteoDiario.length - 1]++;
    }

    public boolean tieneDiaSinAves() {
        for (int conteo : conteoDiario) {
            if (conteo == 0) {
                return true;
            }
        }
        return false;
    }

    public int obtenerConteoPrimerosDias(int numeroDeDias) {
        int total = 0;
        for (int i = 0; i < numeroDeDias; i++) {
            total += conteoDiario[i];
        }
        return total;
    }

    public int obtenerDiasOcupados() {
        int diasOcupados = 0;
        for (int conteo : conteoDiario) {
            if (conteo >= 5) {
                diasOcupados++;
            }
        }
        return diasOcupados;
    }

    public static void main(String[] args) {
        int[] aveesPorDia = {2, 5, 0, 7, 4, 1};
        ObservadorDeAves observador = new ObservadorDeAves(aveesPorDia);

        System.out.println("Semana pasada: " + java.util.Arrays.toString(ObservadorDeAves.obtenerSemanaPasada()));
        System.out.println("Hoy: " + observador.obtenerConteoDeHoy());
        observador.incrementarConteoDeHoy();
        System.out.println("Hoy después de incrementar: " + observador.obtenerConteoDeHoy());
        System.out.println("¿Hubo un día sin aves?: " + observador.tieneDiaSinAves());
        System.out.println("Conteo primeros 4 días: " + observador.obtenerConteoPrimerosDias(4));
        System.out.println("Días ocupados: " + observador.obtenerDiasOcupados());
    }
}