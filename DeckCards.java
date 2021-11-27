package ejercicio2;
//Importacion de librerias.
import java.util.ArrayList;
//Declaracion de clase publica "DeckCards".
public class DeckCards {
	
	public static void main(String[] args) {
		
		//Declarar variables tipo String a los palos(suits) y los valores(values) de una baraja de cartas inglesa.
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		//Listar resultados en una lista llamada "deck"
		ArrayList<Card> deck = new ArrayList<Card>();
		
		//Crear Cartas
		//Crear todas las covinaciones posibles con los palos y los valores de las variables.
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		
		//Elegir una carta aleatoria
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		
		//Escribir 5 lineas en la Lista deck ya creada con las cartas seleccionadas.
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
