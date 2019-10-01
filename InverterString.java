// Instagram: @brevetecno
// Youtube: Brevetecno


// Inveter String
public class InverterString{
	public static void main(String args[]){

		// Texto que será invertido da direita para esquerda
		String normal_name = "Brevetecno!";
		
		// Variável onde irá formar e guardar o texto invertido
		String inverted_name = "";
		
		// Inverte uma String (No caso é a String text)
		for(int i = normal_name.length()-1; i >= 0; i--){

			// Pega apenas uma letra da direita para esquerda da variável normal_name
			char c = normal_name.charAt(i);

			// Irá adicionando letra por letra da direita para esquerda dentro da inverted_name 
			inverted_name += Character.toString(c);
		}
			
		// Mostra o texto normal
		System.out.println("Texto normal: " + normal_name);
            
		// Mostra o texto invertido
        	System.out.println("Texto invertido: " + inverted_name);
	}
}
