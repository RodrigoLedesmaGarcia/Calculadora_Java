package www.rodrigoledesmagarcia.com.mx.modelo;

public class RaizCuadrada {

    float operando1;

    public RaizCuadrada() {
    }

    public RaizCuadrada(float operando1, float resultado) {
        this.operando1 = operando1;
        this.resultado = resultado;
    }

    public float getOperando1() {
        return operando1;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    float resultado = (float) Math.sqrt(operando1);

    public String verResultadoRaizCuadrada() {
        return " "+
                "\nEL RESILTADO DE LA RAIZ CUADRADA DE "+ operando1 +" ES: " +resultado+
                "\n" ;
    }
}
