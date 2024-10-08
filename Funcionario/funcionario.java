package Funcionario;


	//classe 
public class funcionario{
	// atributos
	private String nome;
	private int idade;
	private double salario;
	private String endereco;
	private String funcao;
	
	//contructor
	public funcionario(String nome, int idade, double salario, String endereco, String funcao) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.endereco = endereco;
		this.funcao = funcao;
	}
	// setter e getter
	public String  getnome(){
        return nome ;
    }
    public void setnome(String nome) {
        this.nome = nome ;
    }
    public int getidade(){
        return idade;
    }
    public void setidade(int idade) {
        this.idade = idade ;
    }
    public double getsalario(){
        return salario;
    }
    public void setsalario(double salario) {
        this.salario = salario ;
    }
    public String getendereco(){
        return endereco;
    }
    public void setendereco(String endereco) {
        this.endereco = endereco ;
    }
    public String getfuncao(){
        return funcao;
    }
    public void setfuncao(String funcao) {
        this.funcao = funcao;
    }
    //Metodos
    public void cadastrar(){
        System.out.println(nome+ " foi cadastrado");
    }
    public void alterar(){
        System.out.println(nome+ " foi alterado");
    }
    public void excluir(){
        System.out.println(nome+ " foi excluido");
    }
    public void consultar(){
        System.out.println(nome+ " foi consultado");
        System.out.println( "Tem " +idade+ " anos");
        System.out.println("Ganha de salario: "+salario);
        System.out.println( "Mora na " +endereco);
        System.out.println("Exerce a função de " +funcao);
    }

           
}


