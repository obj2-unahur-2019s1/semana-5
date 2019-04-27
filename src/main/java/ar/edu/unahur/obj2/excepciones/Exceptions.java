package ar.edu.unahur.obj2.excepciones;

public class Exceptions {

    public static void main(String[] args) throws NumeroMenorACeroException {

        Integer valor = 15;

        /*if (validarNumero(valor)) {
            System.out.printf("Mayor a Cero");




        } else {
            System.out.println("Menor a Cero");
        }*/

        try {

            validarNumeroMayorACero(valor);
            validarNumeroMenorA10(valor);


            System.out.printf("Mayor a Cero");



        } catch (NumeroMenorACeroException e) {
            System.out.println("Menor a Cero");
        } catch (NumeroMayorADiezException e) {
            System.out.printf("Mayor a 10");
        } finally {
            System.out.println("Ejecutar siempre");
        }

        String a = null;

        a.toCharArray();


        System.out.println("Fin");


        validarNumeroMayorACero(valor);

    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Exceptions{");
        sb.append('}');
        return sb.toString();
    }

    private static boolean validarNumero(Integer e) {
        return e > 0;
    }

    private static void validarNumeroMayorACero(Integer e) throws NumeroMenorACeroException {
        if (e <= 0) {
            throw new NumeroMenorACeroException("Menor a cero");
        }
    }

    private static void validarNumeroMenorA10(Integer e)  {
        if (e > 10) {
            throw new NumeroMayorADiezException("Mayor a 10");
        }
    }

}
