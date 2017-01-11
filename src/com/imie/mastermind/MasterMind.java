package com.imie.mastermind;
import java.util.Random;
import java.util.Scanner;

public class MasterMind{

	//********* VARIABLES **********
	public int tabM;
	public int tabJ;
	public int nTent;
	public int maxTent = 20;	
	
	
	
	
	//******** CONSTRUCTEURS  ********
	
	//** constructeur pour toutes les donnees 
	public MasterMind(){
		saisirChiffre();
		
	}
	
	public MasterMind(boolean jeu){
		if (jeu){saisirChiffre();}
		else {random();}
	}
	
	
	
	//*********  METHODES  *********
	
		
	// Attribuer 5 chiffres en random - tableau nbr M
		public int[] random(){
		int[]tabM=new int[5];
		int i=0;
		
		while(i<5){
			tabM[i]=(int)(Math.random()*8)+1;
			i++;
			}
		
		return tabM;
		
	}
	
	// Demande de saissir 5 chiffres - tableau nbr J
	public void saisirChiffre(){
		
		int tabJ[] = new int [5];
		
		System.out.println("Veuillez saissir 5 chiffres entre 1 et 9 :");
		Scanner sc = new Scanner(System.in);
		tabJ[0]=sc.nextInt();
		tabJ[1]=sc.nextInt();
		tabJ[2]=sc.nextInt();
		tabJ[3]=sc.nextInt();
		tabJ[4]=sc.nextInt();
		
		
	}
	
	
	
	// Nombre d'occurence d'un chiffre dans le jeu mystere M et le jeu joueur J
	public Object occurence(){
		
		int tabOcc[]= new int [9];
		
		for(int a=1; a<10; a++){
			int nOcc=0;
			for(int i=0; i<5; i++){
				if(tab[i]==a){
					nOcc=nOcc+1;
				}
			}
			tabOcc[a-1]=nOcc;
		}
		return tabOcc;
	}
	
	// Nbr de hit tout confondu:
	public int maxHits(Object tab[]){
		int nHCas=0, nHTotal=0;
		
		for(int i=0; i<9; i++){
			nHCas=Math.min(Object.tabOccM[i], tabOccJ[i]);
			nHTotal=nHTotal+nHCas;
		}
		return nHTotal;
	}
	
	// Nombre de chiffres bien placés :
	public int chiffreBP(int tabM[], int tabJ[]){
		int nBP=0;
			
		for(int i=0; i<5; i++){
			if(tabM[i]==tabJ[i]){
				nBP=nBP+1;
			}
		}
	return nBP;
	}

	}	
}

























