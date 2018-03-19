package Random;

import java.math.*;
import java.util.Random;

public class Kelompok {
	
	int RandNama(){
		Random random = new Random();
		int kelompok = random.nextInt(24);
		return kelompok;
	}
	
	int cek(int k, int Name, int i, String[] Nama, String[] Done){
		for(k=0; k<24;k++){
			if(Nama[Name]==Done[k]){
				return 1;
			}
		}
		return 2;
	}
	
	public static void main(String[] args) {
		int k=0	,i = 0, j=0, l=0,m=1;
		String[] Done = new String[24];
		String[] Nama = {		   "Muhammad Afiyoga",
		                           "Norfateha Binti Mohammad",
		                           "Andreas Fandy D.N.",
		                           "Albi Revlin B",
		                           "Winda Mustikaningtyas",
		                           "Ega Yastira",
		                           "Regina Hanna Y.",
		                           "Adi Putra Bela Negara",
		                           "Ruby Abdullah",
		                           "Isaac Muhammad",
		                           "Riesz Riazy R.",
		                           "Arif Satria Mustaqim",
		                           "Abrar Fitrawan",
		                           "Fikri Hashfi Nashrullah",
		                           "Shafira Audreyna",
		                           "Imam Najibulloh HR",
		                           "Nurul Rofli Nasuha Binti Ramli",
		                           "Muhammad Farhan I.A.",
		                           "Muh Syahabudin Hylmi",
		                           "Alim Wicaksono H.P.",
		                           "Zulfikar Eka Sagata",
		                           "Nor Syamimi Binti Othman",
		                           "Hasna Zukruf",
		                           "Tajudda Adi Negara"
		};
		System.out.println("Aplikasi Pengacakan Kelompok by Fikri :\n");
		Kelompok kel = new Kelompok();
		int Name = kel.RandNama();
		String Jeneng = Nama[Name];
		Done[i] = Jeneng;
		System.out.println("Kelompok = "+m);
		for(int o=0;o<24;o++){
			if(l!=24){
				if(kel.cek(k, Name, i, Nama, Done)==1){
					o--;
					Name = kel.RandNama();
				}
				if(kel.cek(k, Name, i, Nama, Done)==2){
					if((j+1)==4){
						m++;
						System.out.println("\n"+"Kelompok = "+m);
						j=0;
					}
					System.out.println((j+1)+". "+Nama[Name]);
					Done[i++] = Nama[Name];
					j++;
					l++;
				}
			}
		}
	}

}
