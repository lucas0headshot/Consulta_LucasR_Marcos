//Lucas Ronchi e Marcos Antunes
//3-52

import java.util.Scanner; //Importar Scanner

public class consulta {
 public static void main(String[] args){
  String Ver_Vacina; //Variáveis
  float Ver_Temperatura, V_Vacina, V_Trat_Temp, V_Consulta, V_Total;
  
  V_Vacina = 0;
  V_Trat_Temp = 0;
  V_Consulta = 100;
  
  Scanner ler = new Scanner(System.in); //Criar Scanner
   
  veterinario Veterinario_1 = new veterinario(); //Veterinário
    Veterinario_1.Nome = "Cuca Beludo";
    Veterinario_1.CPF = 1234567891;
    Veterinario_1.CRMV = 123456;
    V_Consulta = 156;

  felino Felino_1 = new felino(); //Felino
    Felino_1.Nome = "Cuquinha";
    Felino_1.Raca = "Cuca";
    Felino_1.Dono = "Cuca Beludo";
    Felino_1.Contato = 12345678;

  System.out.print("O felino está com as vacinas em dia?(Sim/Não) "); //Verificar vacina
    Ver_Vacina = ler.next();
  if (Ver_Vacina == "Não"){
    System.out.println("Vacina recomendada: Rinotraqueíte (FHV-1)");
    System.out.print("Digite o valor da vacina: ");
      V_Vacina = ler.nextInt();
  }
    
  System.out.print("Digite a temperatura do felino: "); //Verificar temperatura
    Ver_Temperatura = ler.nextFloat();
  if (Ver_Temperatura >= 38.1 && Ver_Temperatura <= 39.2 || Ver_Temperatura > 39.2){
    System.out.println("Felino está com febre!");
    System.out.println("Tratamento recomendado: Dipirona");
    System.out.print("Digite o valor do remédio:  ");
      V_Trat_Temp = ler.nextFloat();
  }

  V_Total = (V_Vacina + V_Trat_Temp); //Calcular valor da consulta

  System.out.println("--- Diagnóstico ---");//Diagnóstico
  if (Ver_Vacina == "Não"){
    System.out.println("Vacina realizada: Rinotraqueíte (FHV-1)");
    System.out.print("Valor: " + V_Vacina);
  } else {
    System.out.println("Nenhum vacina realizada!");
  }
  if (Ver_Temperatura >= 38.1 && Ver_Temperatura <= 39.2 || Ver_Temperatura > 39.2){  
    System.out.println("Felino com febre! Temperatura: " +  Ver_Temperatura);
    System.out.print("Valor do tratamento: " + V_Trat_Temp);
  } else{
    System.out.println("Nenhum tratamento realizado!");
  }

  System.out.println("           CENTRO VETERINÁRIO CEDUP"); //Impressão da NF
  System.out.println("      AV CRISTOVÃO COLOMBO, 67 - SAVASSI");
  System.out.println("     CEP: 30140-140 - BELO HORIZONTE - MG");
  System.out.println("CNPJ: 222.222.222-22");
  System.out.println("IE: 003.044314.0006");
  System.out.println("IM: 1.046.973/001-0");
  System.out.println("---------------------------------------------------");
  System.out.println("Veterinário: " + Veterinario_1.Nome);
  System.out.println("  CPF: " + Veterinario_1.CPF);
  System.out.println("  CRMV: " + Veterinario_1.CRMV);
  System.out.println("---------------------------------------------------");
  System.out.println("Felino: " + Felino_1.Nome);
  System.out.println("  Raça: " + Felino_1.Raca);
  System.out.println("  Dono: " + Felino_1.Dono);
  System.out.println("  Contato: " + Felino_1.Contato);
  System.out.println("---------------------------------------------------");
  System.out.println("14/10/2022  11:28:54   CCF: 057672     COO: 061646");
  System.out.println("                  CUPOM FISCAL");
  System.out.println("ITEM CÓDIGO              DESCRIÇÃO");
  System.out.println("QTD UN. VL UNIT(R$)      ST            VL ITEM(R$)");
  System.out.println("---------------------------------------------------");
  System.out.println("001     00000000000109                   ANEL" + V_Consulta);
  System.out.println("         1 VACINA X " + V_Vacina + " 02T18;00%  " + V_Vacina);
  System.out.println("         1 REMÉDIO X " + V_Trat_Temp + " 02T18;00%  " + V_Trat_Temp);
  System.out.println("TOTAL R$                              -------------");
  System.out.println("Ct Crédito                                     " + V_Total);
  System.out.println("T2=02T18;00%");
  System.out.println("MD-5:E7B70BBEC831D240FF6D8C0DDC642AC1");
  System.out.println("MINAS LEGAL: 28663093000153  10072019  600");
  System.out.println("Valor aproximado dos tributos deste cupom(Conforme");
  System.out.println("Lei Fed. 12 741/2012) R$1.42");
  System.out.println("---------------------------------------------------");
  System.out.println("CONTROLE: 02066054");
  System.out.println("---------------------------------------------------");
  System.out.println("Aplicativo: LUCASR_MARCOS - CEDUP SISTEMAS (156)");
  System.out.println("3721-5251");
  System.out.println("---------------------------------------------------");
  System.out.println("AKILOR4 OBWMGR9U BLL%GOUM AEHIH4P3 N7NDBE707FGQ");
  System.out.println("CEDUPTECH MP-4000 TH FI ECF-IF");
  System.out.println("VERSÃO: 01.00.02 ECF: 001 LJ: 0001");
  System.out.println("QQQQQQQQQEPRTUWRYW  07/10/2022 10:55:34");
  System.out.println("FAB: BE091710100011211499                        RR");

  ler.close(); //Fechar Scanner
 }
}