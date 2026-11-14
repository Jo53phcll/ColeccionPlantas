import vivero.modelo.Planta;

Planta[] plantas = new Planta[10];
int total = 0;

void main() {
    int opcion;
    do {
        mostrarMenu();
        opcion = leerEntero("Elige una opcion: ", 1, 3);
        switch (opcion) {
            case 1 -> registrarPlanta();
            case 2 -> mostrarPlantas();
            case 3 -> IO.println("Programa finalizado. Hasta pronto!");
        }
    } while (opcion != 3);
}

void mostrarMenu() {
    IO.println();
    IO.println("===== COLECCION DE PLANTAS =====");
    IO.println("1. Registrar planta");
    IO.println("2. Mostrar plantas");
    IO.println("3. Salir");
}

void registrarPlanta() {
    if (total == plantas.length) {
        IO.println("El arreglo esta lleno. No se pueden registrar mas plantas.");
        return;
    }
    String nombre = leerTexto("Nombre de la planta: ");
    String tipo = leerTexto("Tipo (ej: suculenta, helecho, orquidea): ");
    int alturaCm = leerEntero("Altura en cm (1 a 500): ", 1, 500);
    int riegoDias = leerEntero("Riego cada cuantos dias (1 a 60): ", 1, 60);

    plantas[total] = new Planta(nombre, tipo, alturaCm, riegoDias);
    total++;
    IO.println("Planta registrada correctamente.");
}

void mostrarPlantas() {
    if (total == 0) {
        IO.println("Todavia no hay plantas registradas.");
        return;
    }
    IO.println();
    IO.println("--- Plantas registradas (" + total + " de " + plantas.length + ") ---");
    for (int i = 0; i < total; i++) {
        Planta p = plantas[i];
        IO.println((i + 1) + ". " + p.nombre()
                + " | Tipo: " + p.tipo()
                + " | Altura: " + p.alturaCm() + " cm"
                + " | Riego cada " + p.riegoDias() + " dias");
    }
}

String leerTexto(String mensaje) {
    String texto;
    while (true) {
        texto = IO.readln(mensaje).trim();
        if (texto.isEmpty()) {
            IO.println("Error: el campo no puede estar vacio.");
        } else if (texto.length() < 2) {
            IO.println("Error: debe tener al menos 2 caracteres.");
        } else {
            return texto;
        }
    }
}

int leerEntero(String mensaje, int minimo, int maximo) {
    while (true) {
        String entrada = IO.readln(mensaje).trim();
        try {
            int numero = Integer.parseInt(entrada);
            if (numero >= minimo && numero <= maximo) {
                return numero;
            }
            IO.println("Error: el numero debe estar entre " + minimo + " y " + maximo + ".");
        } catch (NumberFormatException e) {
            IO.println("Error: debes ingresar un numero entero valido.");
        }
    }
}