
public class AppQuestoes {

	public static void main (String[] args) {
		
		questoes quest, questDicas, questMulti; 
		
		quest = new questoes("Qual o meu nome?", "Ana Beatriz"); 
		questDicas = new qDicas("Qual o último filme que assistimos? ", "Uma família do Bagulho", "Tem a Jennifer Aniston"); 
		questMulti = new qMultipla("Qual o nome do amor da minha vida?", "Thiago", "Thiago", "Thiego", "James" , "Giacommino");
		
		quest.exibe();
		quest.corrige("Ana Beatriz"); 
		
		questDicas.exibe();
		questDicas.corrige("Uma família do Bagulho"); 
		
		questMulti.exibe(); 
		questMulti.corrige("Thiago"); 
		
	}
	
	
}
