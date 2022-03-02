package lap11_tank;
interface  ClassicTank{
	public abstract void getHP();
	public abstract void attank();
}

public class main {
	public static void main(String[] atgs) {
		class normalTankA implements ClassicTank{
				int HP = 200;
				int Str = 12;
				int Vit = 9;
				int BaseDamage = 11;
			
			public void getHP() {
				System.out.println("|-- Tank A --|");
				System.out.println(" HP : " + HP);
				System.out.println(" Str : " + Str);
				System.out.println(" Vit : " + Vit);
				System.out.println(" BaseDamage : "+ BaseDamage);
			}
			public void attank(   ) {
				double min = 0.7 ;
				double max = 0.9 ;
				double number = (double)(Math.random()*(max-min+1)+min);
				double DamagePoint = BaseDamage *( 1.3 ) * number;
				System.out.println(" DamagePoint_tankA : "+DamagePoint);
				
			}
		}
		class normalTankB implements ClassicTank{
				int HP = 250;
				int Str = 8;
				int Vit = 10;
				int BaseDamage = 10;
			public void getHP() {
				System.out.println("|-- Tank B --|");
				System.out.println(" HP : "+HP);
				System.out.println(" Str : "+Str);
				System.out.println(" Vit : "+Vit);
				System.out.println(" BaseDamage : "+ BaseDamage);
			}
			public void attank() {
				float min = (float) 0.7 ;
				float max = (float) 0.9 ;
				float number = (float)(Math.random()*(max-min+0.1)+min);
				double DamagePoint = BaseDamage *( 0.8 ) * number;
				System.out.println(" DamagePoint_tankB : "+ DamagePoint);
				
				
			}
		}
		
		normalTankA tankA = new normalTankA();
		normalTankB tankB = new normalTankB();
		
		
		tankA.getHP();
		System.out.println("-------------------------------------------------------------");
		
		tankB.getHP();
		System.out.println("-------------- ROUND 1 ---------------");
		tankA.attank();
		tankB.attank();
		tankA.getHP();
		tankB.getHP();
		System.out.println("-------------- ROUND 2 ---------------");
		tankA.attank();
		tankB.attank();
		tankA.getHP();
		tankB.getHP();
	}
}

