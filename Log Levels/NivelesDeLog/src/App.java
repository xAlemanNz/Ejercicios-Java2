class NivelesDeRegistro {

    public static String mensaje(String lineaDeLog) {
        int inicioMensaje = lineaDeLog.indexOf(": ") + 2;
        return lineaDeLog.substring(inicioMensaje).trim();
    }

    public static String nivelDeLog(String lineaDeLog) {
        int inicioNivel = lineaDeLog.indexOf('[') + 1;
        int finNivel = lineaDeLog.indexOf(']');
        return lineaDeLog.substring(inicioNivel, finNivel).toLowerCase();
    }

    public static String reformatear(String lineaDeLog) {
        return mensaje(lineaDeLog) + " (" + nivelDeLog(lineaDeLog) + ")";
    }

    public static void main(String[] args) {
        String registro1 = "[ERROR]: Operación inválida";
        String registro2 = "[ADVERTENCIA]:  Disco casi lleno\r\n";
        String registro3 = "[INFO]: Operación completada";

        System.out.println("Mensaje: '" + mensaje(registro1) + "'");
        System.out.println("Nivel: " + nivelDeLog(registro1));

        System.out.println("Mensaje: '" + mensaje(registro2) + "'");
        System.out.println("Nivel: " + nivelDeLog(registro2));

        System.out.println("Reformateado: " + reformatear(registro3));
    }
}