public class Professor extends Funcionario{
    private String disciplina;

   
    public Professor(String codigo, float salario, String disciplina){
        super(codigo, salario);
        this.disciplina = disciplina;

    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
