class Secretos {

    public static int desplazarAtras(int valor, int lugares) {
        return valor >>> lugares;
    }

    public static int establecerBits(int valor, int mascara) {
        return valor | mascara;
    }

    public static int invertirBits(int valor, int mascara) {
        return valor ^ mascara;
    }

    public static int limpiarBits(int valor, int mascara) {
        return valor & ~mascara;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(desplazarAtras(0b1001, 2)));   // esperado: 10
        System.out.println(Integer.toBinaryString(establecerBits(0b0110, 0b0101))); // esperado: 111
        System.out.println(Integer.toBinaryString(invertirBits(0b1100, 0b0101)));   // esperado: 1001
        System.out.println(Integer.toBinaryString(limpiarBits(0b0110, 0b0101)));    // esperado: 10
    }
}