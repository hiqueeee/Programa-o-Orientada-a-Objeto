public class Professor {
    //atributos
    private String nome;
    private int codigo;
    private double salario;
    private EnumGenero genero;
    
    
    
    //propriedades-metodos
    public void setGenero(EnumGenero sexo) {this.genero = sexo; }
    public EnumGenero setGenero() {return this.genero;}
                              
    public void setCodigo(int codigo) {
        if (codigo > 0) {
            System.out.println("Codigo invalido");
        } else {
            this.codigo = codigo;
        }
    }
public int getCodigo() {return this.codigo; }


public void setNome(String nome) {      
    if (nome == null ) {
        System.out.println("Nome não pode ser nulo");
    } else {
        if (nome.trim().length() == 0) {
            System.out.println("Nome não pode ser vazio");
        } else {
            this.nome = nome;
        }
        
        }           

    }

   public String getNome() {
     return this.nome; 
    }

    public void setSalario(double salario) {this.salario = salario; }
    public double getSalario() {return this.salario;}

    public void imprimir() {
        System.out.println(
            this.getCodigo() + " - " +
            this.getNome() + " - " +
            this.getSalario() + " - " +
            this.genero + " - "
        );
    }

}


