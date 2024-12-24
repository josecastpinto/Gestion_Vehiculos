public class Carro extends Vehiculo {

    int numPuertas;

    public Carro(String marca, String modelo, double veloMaxima, int numPuertas){
        super(marca, modelo, veloMaxima);
        this.numPuertas= numPuertas;

    }


    public int getNumPuertas(){
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas){
        this.numPuertas=numPuertas;
    }


    
    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Carro [Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Velocidad máxima: " + getVelocidadMaxima() + 
               " km/h, Número de puertas: " + numPuertas + "]";
    }

    // Sobrescribir el método equals
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;  // Compara los atributos de la clase base
        Carro carro = (Carro) obj;
        return numPuertas == carro.numPuertas;
    }

}
