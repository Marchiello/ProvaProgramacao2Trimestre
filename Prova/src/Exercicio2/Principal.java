// Código feito em prova(Não funcional)

package EstudoFérias.src.SegundoTrimestre.Prova.src.Exercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int controle = 1;

        while(controle == 1){

            System.out.println("============================[Agenda Eletrônica]=========================[]\n");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato por Número");
            System.out.println("3 - Remover Contato por Número");
            System.out.println("4 - Editar Contato");
            System.out.println("5 - Sair\n");
            System.out.println("========================================================================[]\n");

            System.out.println("Selecione uma opção:");
            int opcao = entrada.nextInt();

            Contato[] agenda = new Contato[100];

            switch (opcao) {
                case 1:

                    int i = 0;

                    int j = 0;

                    while(i != 1){
                        if(agenda[j] == null){
                            System.out.println("Insira um código para o contato: ");
                            int codigo = entrada.nextInt();
                            System.out.println("Insira o nome do contato: ");
                            String nome = entrada.next();
                            System.out.println("Agora, insira o telefone do contato: ");
                            int telefone = entrada.nextInt();
                            System.out.println("Agora, insira o email do contato");
                            String email = entrada.next();

                            agenda[j] = new Contato(codigo, nome, telefone, email);
                            
                            i = 1;

                        }else{
                            j = j + 1;
                        }
                        
                    }
                    break;
                case 2:
                    System.out.println("Insira o número do contato");
                    int numero = entrada.nextInt();

                    int numberSearch = 0;
                    
                    while(numberSearch <= 99 ){

                        if(agenda[numberSearch] != null && agenda[numberSearch].getTelefone() == numero){
                            System.out.println(agenda[numberSearch].toString());
                            numberSearch = 99;
                        }else{
                            numberSearch = numberSearch + 1;
                        }

                    }

                    
                    break;
                case 3:
                    System.out.println("Insira o número do contato");
                    numero = entrada.nextInt();

                    numberSearch = 0;
                    
                    while(numberSearch < 99 ){

                        if(agenda[numberSearch].getTelefone() == numero){
                            agenda[numberSearch] = null;
                            numberSearch = 99;
                        }else{
                            numberSearch = numberSearch + 1;
                        }

                    }

                        
                    break;
                case 4:

                    System.out.println("Insira o nome do contato: ");
                    String nome = entrada.next();


                    numberSearch = 0;
                        
                    while(numberSearch < 99 ){

                        if(agenda[numberSearch].getNome() == nome){

                            System.out.println("Insira um código para o contato: ");
                            int codigo = entrada.nextInt();
                            agenda[numberSearch].setCodigo(codigo);
                            System.out.println("Agora, insira um nome para o contato");
                            String nomeContato = entrada.next();
                            agenda[numberSearch].setNome(nomeContato);
                            System.out.println("Insira um telefone para o contato");
                            int telefone = entrada.nextInt();
                            agenda[numberSearch].setTelefone(telefone);
                            System.out.println("Por fim, adicione o email do contato:");
                            String email = entrada.next();
                            agenda[numberSearch].setEmail(email);
                            numberSearch = 99;


                        }else{
                            numberSearch = numberSearch + 1;
                        }

                    }

                    break;
                case 5:
                    System.out.println("Adeus!");
                    controle = 0;
                    break;
            
                default:
                    System.out.println("Comando Inválido!");
                    break;
            }


            }

        

            entrada.close();

    }

}
