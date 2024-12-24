public class Vehiculo {

      // Atributos comunes a todos los vehículos
      private String marca;
      private String modelo;
      private double velocidadMaxima;
  
      // Constructor
      public Vehiculo(String marca, String modelo, double velocidadMaxima) {
          this.marca = marca;
          this.modelo = modelo;
          this.velocidadMaxima = velocidadMaxima;
      }
  
      // Getters y Setters
      public String getMarca() {
          return marca;
      }
  
      public void setMarca(String marca) {
          this.marca = marca;
      }
  
      public String getModelo() {
          return modelo;
      }
  
      public void setModelo(String modelo) {
          this.modelo = modelo;
      }
  
      public double getVelocidadMaxima() {
          return velocidadMaxima;
      }
  
      public void setVelocidadMaxima(double velocidadMaxima) {
          this.velocidadMaxima = velocidadMaxima;
      }
  
      // Método para mostrar los detalles del vehículo
      public void mostrarDetalles() {
          System.out.println("Marca: " + marca);
          System.out.println("Modelo: " + modelo);
          System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
      }
  
      // Sobrescribir el método toString
      @Override
      public String toString() {
          return "Vehiculo [Marca: " + marca + ", Modelo: " + modelo + ", Velocidad máxima: " + velocidadMaxima + " km/h]";
      }
  
      // Sobrescribir el método equals
      @Override
      public boolean equals(Object obj) {
          if (this == obj) return true;
          if (obj == null || getClass() != obj.getClass()) return false;
          Vehiculo vehiculo = (Vehiculo) obj;
          return Double.compare(vehiculo.velocidadMaxima, velocidadMaxima) == 0 &&
                 marca.equals(vehiculo.marca) && modelo.equals(vehiculo.modelo);
      }


}
