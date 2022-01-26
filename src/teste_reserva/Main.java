package teste_reserva;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		final int saldoInicial = 330;
				
		//Variáveis//
				int opcao, notaDe100 = 100, notaDe50 = 50, notaDe20 = 20, notaDe10 = 10;
				float depositar, saldoDisponivel = 330, saque;
				
				
				//MENU inicial do sistema//
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Caixa Eletronico: \n" 
						+ "1 - Depositar \n"
						+ "2 - Sacar \n"
						+ "3 - Sair\n"
						+ "Saldo atual R$: " + saldoInicial  ));
				
				//Swith com Opções//
				switch(opcao){
				
				//Priemria opção do switch//
				case 1: depositar = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja depositar quanto? "));
						saldoDisponivel = saldoInicial + depositar; 
						JOptionPane.showMessageDialog(null, "Seu saldo é: " + saldoDisponivel);	
						
					while (opcao != 3) {
					opcao = Integer.parseInt(JOptionPane.showInputDialog("Caixa Eletronico: \n" 
							+ "1 - Depositar \n"
							+ "2 - Sacar \n"
							+ "3 - Sair \n"
							+ "Saldo atual R$: " + saldoDisponivel  ));
					//Opção de Depósito 	
					if (opcao == 1) {	depositar = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja depositar quanto? "));
						saldoDisponivel = saldoDisponivel + depositar; 
						JOptionPane.showMessageDialog(null, "Seu saldo é: " + saldoDisponivel);	
					} else if (opcao == 2) {
						
						saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja sacar quanto? ")); 
						if(saque > saldoDisponivel) {
							JOptionPane.showMessageDialog(null, "Valor indisponível para saque ");
						}else if (saque <= 9) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=11) && (saque <=19)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=21) && (saque <=29)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");	
						}else if ((saque >=31) && (saque <=39)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=41) && (saque <=49)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=51) && (saque <=59)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=61) && (saque <=69)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=71) && (saque <=79)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=81) && (saque <=89)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=91) && (saque <=99)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=101) && (saque <=109)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=111) && (saque <=119)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=121) && (saque <=129)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=131) && (saque <=139)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=141) && (saque <=149)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=151) && (saque <=159)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=161) && (saque <=169)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=171) && (saque <=179)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=181) && (saque <=189)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=191) && (saque <=199)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=201) && (saque <=209)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=211) && (saque <=219)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=221) && (saque <=229)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=231) && (saque <=239)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=241) && (saque <=249)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=251) && (saque <=259)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=261) && (saque <=269)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=271) && (saque <=279)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=281) && (saque <=289)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");	
						}else if ((saque >=291) && (saque <= 299)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");	
						}else if (saque >= 301) {
						JOptionPane.showMessageDialog(null, "Saque máximo R$: 300");	
						}
						
						else {
						saldoDisponivel = saldoDisponivel - saque;
						if (saque == 10) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$: " + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe10 + (" (1x)")));
						} else if (saque == 20) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$: " + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe20 + (" (1x)")));	
						} else if (saque == 30){
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe20 + (" (1x) e R$: " + notaDe10 + " (1x)")));	
						} else if (saque == 40) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe20 + (" (2x)")));
						} else if (saque == 50) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x)")));
						} else if (saque == 60) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x) e R$: " + notaDe10 + " (1x)")));	
						} else if (saque == 70) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x) e R$: " + notaDe20 + " (1x)")));	
						} else if (saque == 80) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x), R$: " + notaDe20 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));	
						} else if (saque == 90) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x) e R$: " + notaDe20 + " (2x)")));
						} else if (saque == 100) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x)")));
						} else if (saque == 110) {
						    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe10 + " (1x)")));
						} else if (saque == 120) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe20 + " (1x)")));
						} else if (saque == 130 ) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe20 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));	
						} else if (saque == 140) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe20 + " (2x)")));
						} else if (saque == 150) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe50 + " (1x)")));
						} else if (saque == 160) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));
						} else if (saque == 170) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe20 + " (1x)")));
						} else if (saque == 180) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) , R$: " 
							+ notaDe20 + " (1x) e R$: " + notaDe10 + " (1x)")));
						} else if (saque == 190) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe20 + " (2x)")));
						} else if (saque == 200) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x)")));
						} else if (saque == 210) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe10 + " (1x)")));
						} else if (saque == 220) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe20 + " (1x)")));
						} else if (saque == 230) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe20 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));
						} else if (saque == 240 ) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe20 + " (2x)")));
						} else if (saque == 250 ) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe50 + " (1x)")));
						} else if (saque == 260) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));
						} else if (saque == 270) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe20 + " (1x)")));
						} else if (saque == 280) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) , R$: " 
							+ notaDe20 + " (1x) e R$: " + notaDe10 + " (1x)")));
						} else if (saque == 290) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe20 + " (2x)")));
						} else if (saque == 300) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (3x)")));
						}
						}	
						
					}else {
						JOptionPane.showMessageDialog(null, "Você saiu \nSaldo total R$: " + saldoDisponivel);
					}
						}
					break;
					//Fim do sistema selecionado a opção 1 //
					
				//Opção 2 para começar o sistema optando por Saque //
				case 2: saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja sacar quanto? ")); 
				if(saque > saldoInicial) {
					JOptionPane.showMessageDialog(null, "Valor indisponível para saque!");
				}else if (saque <= 9) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=11) && (saque <=19)){
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=21) && (saque <=29)){
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");	
					}else if ((saque >=31) && (saque <=39)){
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=41) && (saque <=49)){
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=51) && (saque <=59)){
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=61) && (saque <=69)){
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=71) && (saque <=79)){
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=81) && (saque <=89)){
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=91) && (saque <=99)){
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=101) && (saque <=109)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=111) && (saque <=119)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=121) && (saque <=129)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=131) && (saque <=139)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=141) && (saque <=149)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=151) && (saque <=159)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=161) && (saque <=169)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=171) && (saque <=179)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=181) && (saque <=189)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=191) && (saque <=199)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=201) && (saque <=209)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=211) && (saque <=219)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=221) && (saque <=229)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=231) && (saque <=239)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=241) && (saque <=249)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=251) && (saque <=259)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=261) && (saque <=269)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=271) && (saque <=279)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
					}else if ((saque >=281) && (saque <=289)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");	
					}else if ((saque >=291) && (saque <= 299)) {
					 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");	
					} else if (saque >= 301) {
					JOptionPane.showMessageDialog(null, "Saque máximo R$: 300");	
					}
				
				
				
				
				else {
					saldoDisponivel = saldoDisponivel - saque;
					if (saque == 10) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$: " + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe10 + (" (1x)")));
					} else if (saque == 20) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$: " + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe20 + (" (1x)")));	
					} else if (saque == 30){
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe20 + (" (1x) e R$: " + notaDe10 + " (1x)")));	
					} else if (saque == 40) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe20 + (" (2x)")));
					} else if (saque == 50) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x)")));
					} else if (saque == 60) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x) e R$: " + notaDe10 + " (1x)")));	
					} else if (saque == 70) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x) e R$: " + notaDe20 + " (1x)")));	
					} else if (saque == 80) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x), R$: " + notaDe20 + " (1x) e R$: " 
						+ notaDe10 + " (1x)")));	
					} else if (saque == 90) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x) e R$: " + notaDe20 + " (2x)")));
					} else if (saque == 100) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x)")));
					} else if (saque == 110) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe10 + " (1x)")));
					} else if (saque == 120) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe20 + " (1x)")));
					} else if (saque == 130 ) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe20 + " (1x) e R$: " 
						+ notaDe10 + " (1x)")));	
					} else if (saque == 140) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe20 + " (2x)")));
					} else if (saque == 150) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe50 + " (1x)")));
					} else if (saque == 160) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) e R$: " 
						+ notaDe10 + " (1x)")));
					} else if (saque == 170) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) e R$: " 
						+ notaDe20 + " (1x)")));
					} else if (saque == 180) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) , R$: " 
						+ notaDe20 + " (1x) e R$: " + notaDe10 + " (1x)")));
					} else if (saque == 190) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) e R$: " 
						+ notaDe20 + " (2x)")));
					} else if (saque == 200) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x)")));
					} else if (saque == 210) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe10 + " (1x)")));
					} else if (saque == 220) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe20 + " (1x)")));
					} else if (saque == 230) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe20 + " (1x) e R$: " 
						+ notaDe10 + " (1x)")));
					} else if (saque == 240 ) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe20 + " (2x)")));
					} else if (saque == 250 ) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe50 + " (1x)")));
					} else if (saque == 260) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) e R$: " 
						+ notaDe10 + " (1x)")));
					} else if (saque == 270) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) e R$: " 
						+ notaDe20 + " (1x)")));
					} else if (saque == 280) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) , R$: " 
						+ notaDe20 + " (1x) e R$: " + notaDe10 + " (1x)")));
					} else if (saque == 290) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) e R$: " 
						+ notaDe20 + " (2x)")));
					} else if (saque == 300) {
						JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
						("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (3x)")));
					}
			        }	
			
				while (opcao != 3) {
					opcao = Integer.parseInt(JOptionPane.showInputDialog("Caixa Eletronico: \n" 
							+ "1 - Depositar \n"
							+ "2 - Sacar \n"
							+ "3 - Sair \n"
							+ "Saldo atual R$: " + saldoDisponivel  ));
				
					if (opcao == 1) {	depositar = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja depositar quanto? "));
					saldoDisponivel = saldoDisponivel + depositar; 
					JOptionPane.showMessageDialog(null, "Seu saldo é: " + saldoDisponivel);	
				} else if (opcao == 2) {
					
					saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Deseja sacar quanto? ")); 
					if(saque > saldoDisponivel) {
						JOptionPane.showMessageDialog(null, "Valor indisponível para saque ");
					} else if (saque <= 9) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=11) && (saque <=19)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=21) && (saque <=29)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");	
						}else if ((saque >=31) && (saque <=39)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=41) && (saque <=49)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=51) && (saque <=59)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=61) && (saque <=69)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=71) && (saque <=79)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=81) && (saque <=89)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=91) && (saque <=99)){
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=101) && (saque <=109)) {
							 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=111) && (saque <=119)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=121) && (saque <=129)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=131) && (saque <=139)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=141) && (saque <=149)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=151) && (saque <=159)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=161) && (saque <=169)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=171) && (saque <=179)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=181) && (saque <=189)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=191) && (saque <=199)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=201) && (saque <=209)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=211) && (saque <=219)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=221) && (saque <=229)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=231) && (saque <=239)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=241) && (saque <=249)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=251) && (saque <=259)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=261) && (saque <=269)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=271) && (saque <=279)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");
						}else if ((saque >=281) && (saque <=289)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");	
						}else if ((saque >=291) && (saque <= 299)) {
						 JOptionPane.showMessageDialog(null, "Cédulas indisponíveis para saque!");	
						} else if (saque >= 301) {
						JOptionPane.showMessageDialog(null, "Saque máximo R$: 300");	
						}
					
					
					
					else {
						saldoDisponivel = saldoDisponivel - saque;
						if (saque == 10) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$: " + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe10 + (" (1x)")));
						} else if (saque == 20) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$: " + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe20 + (" (1x)")));	
						} else if (saque == 30){
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe20 + (" (1x) e R$: " + notaDe10 + " (1x)")));	
						} else if (saque == 40) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe20 + (" (2x)")));
						} else if (saque == 50) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x)")));
						} else if (saque == 60) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x) e R$: " + notaDe10 + " (1x)")));	
						} else if (saque == 70) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x) e R$: " + notaDe20 + " (1x)")));	
						} else if (saque == 80) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x), R$: " + notaDe20 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));	
						} else if (saque == 90) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe50 + (" (1x) e R$: " + notaDe20 + " (2x)")));
						} else if (saque == 100) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x)")));
						} else if (saque == 110) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe10 + " (1x)")));
						} else if (saque == 120) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe20 + " (1x)")));
						} else if (saque == 130 ) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe20 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));	
						} else if (saque == 140) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe20 + " (2x)")));
						} else if (saque == 150) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x) e R$: " + notaDe50 + " (1x)")));
						} else if (saque == 160) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));
						} else if (saque == 170) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe20 + " (1x)")));
						} else if (saque == 180) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) , R$: " 
							+ notaDe20 + " (1x) e R$: " + notaDe10 + " (1x)")));
						} else if (saque == 190) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (1x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe20 + " (2x)")));
						} else if (saque == 200) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x)")));
						} else if (saque == 210) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe10 + " (1x)")));
						} else if (saque == 220) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe20 + " (1x)")));
						} else if (saque == 230) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe20 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));
						} else if (saque == 240 ) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe20 + " (2x)")));
						} else if (saque == 250 ) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x) e R$: " + notaDe50 + " (1x)")));
						} else if (saque == 260) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe10 + " (1x)")));
						} else if (saque == 270) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe20 + " (1x)")));
						} else if (saque == 280) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) , R$: " 
							+ notaDe20 + " (1x) e R$: " + notaDe10 + " (1x)")));
						} else if (saque == 290) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (2x), R$: " + notaDe50 + " (1x) e R$: " 
							+ notaDe20 + " (2x)")));
						} else if (saque == 300) {
							JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! \nSaldo atual R$:" + saldoDisponivel + 
							("\nSaque total R$: "+ saque + "\nTotal de cédulas R$: "+ notaDe100 + (" (3x)")));
						}
						}	
					}else {
					JOptionPane.showMessageDialog(null, "Você saiu \nSaldo total R$: " + saldoDisponivel);	
					}
					}
					break;
				
				
				//Opção 3 para sair do sistema //
				case 3: JOptionPane.showMessageDialog(null, "Você saiu. \nSaldo atual R$: " + saldoInicial);
				break;	
				default: JOptionPane.showMessageDialog(null, "Opção selecionada não existente");	
				}

	}

}
