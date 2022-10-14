//Lucas Ronchi e Marcos Antunes
//3-52

import java.util.Scanner; //Importar Scanner

public class consulta {
 public static void main(String[] args){
  String Ver_Vacina; //Variáveis
  float Ver_Temperatura, V_Vacina, V_Trat_Temp, V_Consulta; 
  
  Scanner ler = new Scanner(System.in); //Criar Scanner
   
  veterinario Veterinario_1 = new veterinario(); //Veterinário
    Veterinario_1.Nome = "Cuca Beludo";
    Veterinario_1.CPF = 1234567891;
    Veterinario_1.CRV = 123456;
    V_Consulta = 156;

  felino Felino_1 = new felino(); //Felino
    Felino_1.Nome = "Cuquinha";
    Felino_1.Raca = "Cuca";
    Felino_1.Dono = "Cuca Beludo";
    Felino_1.Contato = 12345678;

  System.out.print("O felino está com as vacinas em dia?"); //Verificar vacina
    Ver_Vacina = ler.next();
  if (Ver_Vacina != "Sim"){
    Runtime.getRuntime().exec("cls");
    System.out.print("Vacina recomendada: Rinotraqueíte (FHV-1)");
    System.out.print("Digite o valor da vacina: ");
      V_Vacina = ler.nextInt();
  }
    
  Runtime.getRuntime().exec("cls");
  System.out.print("Digite a temperatura do felino: "); //Verificar temperatura
    Ver_Temperatura = ler.nextFloat();
  if (Ver_Temperatura >= 38.1 && Ver_Temperatura <= 39.2){
    System.out.print("Tratamento recomendado: Dipirona");
    System.out.print("Digite o valor do remédio: ");
      V_Trat_Temp = ler.nextFloat();
  }
   
    

    ler.close(); //Fechar Scanner
 }
}