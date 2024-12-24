public class App {
    public static void main(String[] args) throws Exception {
        // Crear un objeto de tipo Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 180, 4);
        Carro carro2 = new Carro("Honda", "Civic", 200, 4);
        Carro carro3 = new Carro("Logan", "Suzuki", 180, 4);

        // Crear un objeto de tipo Moto
        Moto moto1 = new Moto("Harley Davidson", "Sportster", 160, true);
        Moto moto2 = new Moto("Yamaha", "YZF-R1", 299, false);
        Moto moto3 = new Moto("Harley Davidson", "Sportster", 160, true);


         // Mostrar los detalles de los vehículos
         System.out.println("Detalles del carro 1:");
         carro1.mostrarDetalles();
         System.out.println("\nDetalles del carro 2:");
         carro2.mostrarDetalles();
         System.out.println("\nDetalles del carro 3:");
         carro3.mostrarDetalles();
 
         System.out.println("\nDetalles de la moto 1:");
         moto1.mostrarDetalles();
         System.out.println("\nDetalles de la moto 2:");
         moto2.mostrarDetalles();
         System.out.println("\nDetalles de la moto 3:");
         moto3.mostrarDetalles();
 
         // Usar el método toString() para mostrar la información
         System.out.println("\nUsando toString:");
         System.out.println(carro1);
         System.out.println(moto1);
 
         // Comparar vehículos usando el método equals
         System.out.println("\nComparando vehículos usando equals:");
         System.out.println("¿El carro 1 es igual al carro 2? " + carro1.equals(carro2));
         System.out.println("¿La moto 1 es igual a la moto 2? " + moto1.equals(moto2));
         System.out.println("¿La moto 1 es igual a la moto 2? " + moto1.equals(moto3));
    }
}
