public class Moto extends Vehiculo{

    private boolean tieneSidecar;

    // Constructor que llama al constructor de la clase base (Vehiculo)
    public Moto(String marca, String modelo, double veloMaxima, boolean tieneSidecar) {
        super(marca, modelo, veloMaxima); // Llama al constructor de Vehiculo
        this.tieneSidecar = tieneSidecar;
    }

    // Getter y Setter
    public boolean tieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    // Sobrescribir el método mostrarDetalles() para agregar detalles adicionales
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  // Llama al método de la clase base
        System.out.println("¿Tiene Sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Moto [Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Velocidad máxima: " + getVelocidadMaxima() + 
               " km/h, Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No") + "]";
    }

    // Sobrescribir el método equals
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;  // Compara los atributos de la clase base
        Moto moto = (Moto) obj;
        return tieneSidecar == moto.tieneSidecar;
    }
    

}
