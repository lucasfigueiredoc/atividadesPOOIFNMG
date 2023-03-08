public class Coordenador extends Funcionario {
    private String curso;

    public Coordenador(String codigo, float salario, String curso){
        super(codigo,salario,curso);
        this.curso = curso;
    }

    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String cursoFora){
        this.curso = cursoFora;
    }
    
}
