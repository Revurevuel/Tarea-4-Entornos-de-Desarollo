public void calculosComplejos() {
		System.out.println("Ejecutando calculos complejos");
		
		if (num1 < 20 || num1 > 30) {
			resultado = num1 + num2;
			System.out.println("Los calculos son: " + (num1 + num2));
		}else {
			if (num2 >= 0 && num2 <= 10) {
				resultado = num1 - num2;
				System.out.println("Los calculos son: " + (num1 - num2));
			}else {
				resultado = num1 * num2;
				System.out.println("Los calculos son: " + (num1 * num2));
			}
		}
		
		System.out.println("Todos los cálculos se han realizado");
	}:wq


