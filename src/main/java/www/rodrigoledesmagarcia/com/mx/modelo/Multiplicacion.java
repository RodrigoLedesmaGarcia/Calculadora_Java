package www.rodrigoledesmagarcia.com.mx.modelo;

public class Multiplicacion {

    float operando1;
    float operando2;
    float resultado = (operando1 * operando2);

    public Multiplicacion() {
    }

    public Multiplicacion(float operando1, float operando2, float resultado) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = resultado;
    }

    public float getOperando1() {
        return operando1;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public float getOperando2() {
        return operando2;
    }

    public void setOperando2(float operando2) {
        this.operando2 = operando2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String verResultadoMultiplicacion() {
            return "           "+
                    "\nEL RESULTADO DE LA MULTIPLIACIÓN DE ".concat(String.valueOf(operando1)).concat(" X ").concat(String.valueOf(operando2)).concat( " ES: ").concat(String.valueOf(resultado))+
                    "\n";

    }
}
