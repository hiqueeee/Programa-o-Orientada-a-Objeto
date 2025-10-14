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
        System.out.println("9 Sair ");
        System.out.println(" Digite a opção desejada: ");
        opcao = teclado.nextInt();
        
    
        if(opcao == 1) {
            
            Professor prof = new Professor();
            prof.setCodigo( teclado.nextInt());
            prof.setNome( teclado.next());
            prof.setSalario( teclado.nextDouble());
            int genero = teclado.nextInt();
            if (genero == 1) {
                prof.setGenero(EnumGenero.Feminino);
            } else {
                prof.setGenero(EnumGenero.Masculino);
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
            System.out.println("Codigo: " + item.getCodigo());
            System.out.println("Nome: " + item.getNome());
            System.out.println("Salario: " + item.getSalario());
            System.out.println("Genero: " + item.setGenero());
        }
        
        } else if (opcao == 9) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Opção inválida");
        }
    
    
    }while (opcao != 9);


}

}
