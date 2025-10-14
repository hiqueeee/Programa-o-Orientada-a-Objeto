import java.util.Scanner;

public class MenuProfessores {
    public void exibir() {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        ProfessorBanco bancoDados = new ProfessorBanco();
        Professor objProfessor = new Professor();
    do {
        System.out.println("");
        System.out.println(" PROFESSORES ");
        System.out.println("1 Adicionar ");
        System.out.println("2 Alterar ");
        System.out.println("3 Remover ");
        System.out.println("4 Pesquisar ");
        System.out.println("5 Imprimir ");
        System.out.println("9 Sair ");
        System.out.println(" Digite a opção desejada: ");
        opcao = teclado.nextInt();
        
    
        if(opcao == 1) {
            
            Professor objProfessor2 = new Professor();
            objProfessor = objProfessor2;
            objProfessor.setCodigo( teclado.nextInt());
            objProfessor.setNome( teclado.next());
            objProfessor.setSalario( teclado.nextDouble());
            int genero = teclado.nextInt();
            if (genero == 1) {
                objProfessor.setGenero(EnumGenero.Feminino);
            } else {
                objProfessor.setGenero(EnumGenero.Masculino);
            }
        
                bancoDados.adicionar(objProfessor);
        
        } else if (opcao == 2) {
        } else if (opcao == 3) {
        } else if (opcao == 4) {
            Professor item = null;
            int codigo = 0;;
        
        codigo = teclado.nextInt();
        item = bancoDados.getProfessor(codigo);
        
        
        
        if (item != null) {
            item.imprimir();
        
        } else {  
            System.out.println("Professor não localizado");
        }
        
        } else if (opcao == 5) {
          bancoDados.imprimirTodosProfessores();
        }    
    
    }while (opcao != 9);


}

}
