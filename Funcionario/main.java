package Funcionario;

public class main {
  	 // Método principal da classe Pessoa
      public static void main(String[] args) {
        funcionario Paulo = new funcionario("Edner Paulo Severo Dias",41,3500,"Rua Taguai,210","Garçom" );
      	
      	  	Paulo.consultar();
      	  	Paulo.alterar();
      	  	Paulo.cadastrar();
      	  	Paulo.excluir();
      }

      
}
