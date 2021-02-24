package lista2;

public class exerc2 {
	public char dados[];
	public int tamanho;
	
	
	public exerc2 () {
		this.dados = new char[5];
		this.tamanho = 0;
		
	}
	
	public boolean isEmpty() {
		if(tamanho == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(tamanho == dados.length) {
			return true;
		} else {
			return false;
		}
	}
	public void addInit(char value) {
		 
		if (tamanho < dados.length) {
			for (int i = tamanho; i > 0; i--) {
				dados[i]=dados[i-1];
			}
			dados[0] = value;
			tamanho++;
		} else {
			System.out.println("Erro, lista cheia");      
		}
		
	}
	
	public void addFinal(char value) {
		
		if (tamanho < dados.length) {
			dados[tamanho]= value;
			tamanho++;
		} else {
			System.out.println("Erro, lista cheia");      
		}
		
	}
	
	public void addPosition(char value, int position) {
		
		if((tamanho<dados.length) && (position<tamanho+1)&&(position>=0)) {
			
			for (int i = tamanho; i != position; i--) {
				if (i!=0){                                                            
					dados[i] = dados[i-1];
				}
			}
			dados[position] = value;
			tamanho++;
		} else {
			System.out.println("Erro, lista cheia, ou posição invalida ");  
		}
		
		
	}
	
	public char removeInit() {
		char dado = dados[0];
		if (tamanho > 0) {
			for (int i = 0; i < tamanho; i ++ ) {
				dados[i] = dados[i+1];
			}
		}
		tamanho--;
		return dado;
	}
	
	
	public void removeFinal() {
		
		if (tamanho > 0) {
			dados[tamanho-1] = 1;
			tamanho--;
			
		} else {
			System.out.println("Erro lista vazia");   
		}
	}
	
	public void removePos(int pos) {
		
		if (pos < tamanho-1  && pos >= 0 ) {
			System.out.println("Não é possivel remover o que não está lá");   
		} else {
			for (int i = pos;  i < dados.length; i--) {
				dados[i] = dados[i+1];
			}
			tamanho--;
		}
	}
	
	public String percorre(){                    
		String aux=" ";

		for (int i=0;i<tamanho;i++){
			aux=aux+"\n"+dados[i];
		}
		return aux;
	}
	
	
}
