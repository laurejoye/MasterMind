import java.util.Random;
import java.util.Scanner;


public class MasterMind2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=1;	
		
		if(a==1){
			int tabM[]= new int [5];
			tabM = random();
				
			int tabOccM[]= new int [9];
			tabOccM = occurence(tabM);
		
			int nT=0;
			while(nT<11);
				int tabJ[]= new int [5];
				tabJ = saisirChiffre(tabJ);
		
				int tabOccJ[]= new int [9];
				tabOccJ = occurence(tabJ);
		
				int nHTotal;
				nHTotal = maxHits(tabOccM, tabOccJ);
		
				int nBP = 0;
				chiffreBP(nBP);
			
				if(nBP<5){
					System.out.println("Vous avez "+nBP+" chiffres bien placés et "+(nHTotal-nBP)+" chiffres mal placés.");
					System.out.println("Tapez 1 pour continuer sinon tapez tout autre chiffre pour quitter.");
					Scanner sc = new Scanner(System.in);
					a = sc.nextInt();
			
					if(a==1){
						nT++;
					}
					else{
						System.out.println("Au revoir.");
						return;
						
					}
				}
				if(nBP==5){
					System.out.println("Vous avez trouvé la solution, bravo.");
					System.out.println("Voulez-vous rejouer? Tapez 1 pour rejouer sinon tapez tout autre chiffrepour quitter.");
					Scanner sc = new Scanner(System.in);
					a = sc.nextInt();
						
					if(a==1){
						nT = 11;
					}
					else{
						System.out.println("Au revoir.");
						return;
						
					}
				}
		
				System.out.println("Vous avez épuisé toutes vos tentatives.");
				System.out.println("Voulez-vous rejouer? Tapez 1 pour rejouer sinon tapez tout autre chiffrepour quitter.");
				Scanner sc = new Scanner(System.in);
				a = sc.nextInt();
		}
		System.out.println("Au revoir.");
		return;
		
	}

	// Attribuer 5 chiffres en random - tableau nbr M
	public static int[] random(){
		int[]tabM=new int[5];
		int i=0;
		
		while(i<5){
			tabM[i]=(int)(Math.random()*8)+1;
			i++;
			}
		
		return tabM;
		
	}
	
	// Demande de saissir 5 chiffres - tableau nbr J
	public static int[] saisirChiffre(int tab[]){
		int tabJ[] = new int [5];
		
		System.out.println("Veuillez saissir 5 chiffres entre 1 et 9 :");
		Scanner sc = new Scanner(System.in);
		tabJ[0]=sc.nextInt();
		tabJ[1]=sc.nextInt();
		tabJ[2]=sc.nextInt();
		tabJ[3]=sc.nextInt();
		tabJ[4]=sc.nextInt();
		return tabJ;
		
	}
	
	public static void tentative(){	
		int nTent = 0;
		if(nTent>10){
			System.out.println("Vous avez épuisé le nombre de tentatives.");
			System.out.println("Pour un nouveau jeu tapez y.");
			System.out.println("Pour quitter tapez q.");
		}
	}
	
	// Nombre d'occurence d'un chiffre dans le jeu mystere M et le jeu joueur J
	public static int[] occurence(int tab[]){
		
		int tabOcc[]= new int [9];
		
		for(int a=1; a<10;a++){
			int nM=0;
			for(int m=0; m<5; m++){
				if(tab[m]==a){
					nM=nM+1;
				}
			}
			tabOcc[a-1]=nM;
		}
		return tabOcc;
	}
	
	// Nbr de hit tout confondu:
	public static int maxHits(int [] tabOccM, int [] tabOccJ){
		int nHCas=0, nHTotal=0;
		
		for(int i=0; i<9; i++){
			nHCas=Math.min(tabOccM[i], tabOccJ[i]);
			nHTotal=nHTotal+nHCas;
		}
		return nHTotal;
			
	}

	// Nombre de chiffres bien placés :
	public static int chiffreBP(int nBP){
		int nBP=0;
			
		for(int i=0; i<5; i++){
			if(tabM[i]==tabJ[i]){
				nBP=nBP+1;
			}
		}
	}
		
}