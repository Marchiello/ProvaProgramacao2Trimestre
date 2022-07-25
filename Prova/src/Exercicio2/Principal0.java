// Código feito posteriormente(funcionando 100%)

package EstudoFérias.src.SegundoTrimestre.Prova.src.Exercicio2;
import java.util.Scanner;

public class Principal0 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        Contato[] agenda = new Contato[1000];
        int controle = 1;

        while(controle == 1){

            System.out.println("============================[Agenda Eletrônica]=========================[]\n");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato por Número");
            System.out.println("3 - Remover Contato por Número");
            System.out.println("4 - Editar Contato");
            System.out.println("5 - Sair\n");
            System.out.println("========================================================================[]\n");

            int opcao = input.nextInt();

            switch(opcao){

                //------------------------------------------------------------------[]
                case 1:

                    for (int i = 0; i < agenda.length; i++) {
                        if(agenda[i] == null){

                            agenda[i] = new Contato();

                            System.out.println("Insira um código para o contato: ");
                            int cod = input.nextInt();
                            agenda[i].setCodigo(cod);

                            System.out.println("Insira um nome para o contato: ");
                            String name = input.next();
                            agenda[i].setNome(name);
                            System.out.println();

                            System.out.println("Insira o telefone do contato: ");
                            int phone = input.nextInt();
                            agenda[i].setTelefone(phone);
                            System.out.println();

                            System.out.println("Insira um email para o contato: ");
                            String email = input.next();
                            agenda[i].setEmail(email);
                            System.out.println();

                            i = agenda.length;

                        }
                    }

                    break;

                //----------------------------------------------------------------------

                case 2:

                    System.out.println("Insira o numero do contato: ");
                    int cod = input.nextInt();
                    System.out.println();

                    for (int i = 0; i < agenda.length; i++) {

                        if(agenda[i] != null){
                            if(agenda[i].getTelefone() == cod){
                                System.out.println();
                                System.out.println(agenda[i].toString());
                                i = agenda.length;
                            }
                        }else if(i == agenda.length -1){
                            System.out.println("Numero Inexistente");
                        }
                    }

                    break;

                //----------------------------------------------------------------------


                //----------------------------------------------------------------------

                case 3:
                    System.out.println();
                    System.out.println("Insira o numero do contato: ");
                    int phone = input.nextInt();

                    for (int i = 0; i < agenda.length; i++) {
                        if(agenda[i] != null && agenda[i].getTelefone() == phone){

                            agenda[i] = null;
                            i = agenda.length;

                        }else if(i == agenda.length - 1){
                            System.out.println("Numero Inexistente");
                        }
                    }

                    break;

                //----------------------------------------------------------------------

                //----------------------------------------------------------------------
                case 4:

                    System.out.println();
                    System.out.println("Insira o código do contato: ");
                    cod = input.nextInt();

                    for (int i = 0; i < agenda.length; i++) {
                        if(agenda[i] != null && agenda[i].getCodigo() == cod){

                            System.out.println("Insira o novo nome do contato: ");
                            System.out.println();
                            String nome = input.next();
                            agenda[i].setNome(nome);

                            System.out.println("Insira o novo telefone do contato: ");
                            System.out.println();
                            phone = input.nextInt();
                            agenda[i].setTelefone(phone);

                            System.out.println("Insira o novo email do contato: ");
                            System.out.println();
                            String email = input.next();
                            agenda[i].setEmail(email);

                            i = agenda.length;

                        }else if(i == agenda.length - 1){

                            System.out.println("Código inexistente!");

                        }
                    }

                    break;
                //----------------------------------------------------------------------

                //----------------------------------------------------------------------
                case 5:
                    System.out.println("Adeus");
                    controle = 0;
                    break;

                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        }

        input.close();

    }
}
