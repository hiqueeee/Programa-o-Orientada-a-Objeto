import java.util.ArrayList;
import java.util.List;    


public class ProfessorBanco {
    private List<Professor> banco = new ArrayList<Professor>();

public void adicionar(Professor professor) {
    Professor localizar = getProfessor(professor.getCodigo());   
    
    if (localizar != null) {
        System.out.println("Já existe professor cadastrado com esse código!");
        return;
    }
    
    banco.add(professor);
    System.out.println("Professor adicionado com sucesso!");
}

    public void remover(int codigo) {
        Professor localizado = null;
    
        for (Professor professor : banco) {
            if (professor.getCodigo() == codigo) {
                localizado = professor;
                break;
        }
    }
    
    if (localizado == null) {
        System.out.println("Professor não localizado!");
        } else {
            banco.remove(localizado);
            System.out.println("Professor removido com sucesso");
        }
    }

    public void remover(Professor professor) {
        boolean localizado = false;
    
        for (Professor item : banco) {
            if (item == professor) {
                localizado = true;
                banco.remove(professor);
                break;
            }
        }

        if (localizado == false) {
            System.out.println("Professor não localizado!");
        } else {
            System.out.println("Professor removido com sucesso");
        }
    }   

    public Professor getProfessor(int codigo) {
        Professor localizado = null;
    
        for (Professor item : banco) {
            if (item.getCodigo() == codigo) {
                localizado = item;
                break;
            }
        }
    
        if (localizado == null) {
            System.out.println("Professor não localizado!");
            return null;
        } else {
            System.out.println("Professor localizado com sucesso");
            return localizado;
        }
                        
    }


    public int getNumerosProfessores() {
        int cont = 0;

        for (Professor item : banco) {
            if (item != null) {
                cont = cont + 1;
            }
        }
        
        return cont;
    
    
    }

    public void imprimirTodosProfessores() {
        for (Professor item : banco) {
            if (item != null) {
                item.imprimir();
            }
        }
    }

}