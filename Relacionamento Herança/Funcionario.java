public class Funcionario extends Pessoa {
    protected String codigo;
    protected float salario;

    public Funcionario(String nome, String cpf, String endereco, String codigo, float salario){
        super(nome,cpf,endereco);
        this.codigo = codigo;
        this.salario = salario;

    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
