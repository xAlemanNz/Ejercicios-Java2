enum NivelDeLog {
    DESCONOCIDO("???", 0),
    TRAZA("TRC", 1),
    DEPURACION("DBG", 2),
    INFORMACION("INF", 4),
    ADVERTENCIA("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42);

    private final String codigoTexto;
    private final int codigoNumerico;

    NivelDeLog(String codigoTexto, int codigoNumerico) {
        this.codigoTexto = codigoTexto;
        this.codigoNumerico = codigoNumerico;
    }

    public int obtenerCodigoNumerico() {
        return codigoNumerico;
    }

    public static NivelDeLog desdeTexto(String texto) {
        for (NivelDeLog nivel : values()) {
            if (nivel.codigoTexto.equals(texto)) {
                return nivel;
            }
        }
        return DESCONOCIDO;
    }
}

class LineaDeLog {
    private String lineaOriginal;

    public LineaDeLog(String lineaOriginal) {
        this.lineaOriginal = lineaOriginal;
    }

    public NivelDeLog obtenerNivelDeLog() {
        int inicio = lineaOriginal.indexOf('[') + 1;
        int fin = lineaOriginal.indexOf(']');
        String codigoTexto = lineaOriginal.substring(inicio, fin);
        return NivelDeLog.desdeTexto(codigoTexto);
    }

    public String obtenerMensaje() {
        int inicioMensaje = lineaOriginal.indexOf(": ") + 2;
        return lineaOriginal.substring(inicioMensaje);
    }

    public String obtenerSalidaFormatoCorto() {
        return obtenerNivelDeLog().obtenerCodigoNumerico() + ":" + obtenerMensaje();
    }
}

class RegistrosRegistrosRegistros {
    public static void main(String[] args) {
        LineaDeLog linea1 = new LineaDeLog("[INF]: Archivo eliminado");
        System.out.println(linea1.obtenerNivelDeLog());

        LineaDeLog linea2 = new LineaDeLog("[XYZ]: Mensaje fuera de contexto");
        System.out.println(linea2.obtenerNivelDeLog());

        LineaDeLog linea3 = new LineaDeLog("[ERR]: Desbordamiento de pila");
        System.out.println(linea3.obtenerSalidaFormatoCorto());
    }
}