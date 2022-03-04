package aula01fev;

public class TestaAnCachCavaPreExe01 {

	public static void main(String[] args) {
		
		Cachorro dogA = new Cachorro();
		Cavalo cavB = new Cavalo();
		Preguiça preC = new Preguiça();
		
		dogA.setNome("Quardião do Trovão");
		dogA.setIdade(7);
		dogA.setSom("O cão latiu... AUAUAU");
		dogA.setCorrer("O cão correu muito veloz...");
		
		cavB.setNome("Trovão");
		cavB.setIdade(6);
		cavB.setSom("O cavalo relinchou... hihihhh");
		cavB.setCorrer("O cavalo correu bem longe...");
		
		preC.setNome("Filomena");
		preC.setIdade(10);
		preC.setSom("A preguiça AHHHHH ");
		preC.setSubirEmArvore("A preguiça subiu lentamentnte a arvóre...");
		
		
		System.out.println("O nome do dog é: " + dogA.getNome());
		System.out.println("A  idade do cão é: " + dogA.getIdade());
		System.out.println("O cão latiu " + dogA.getSom());
		System.out.println("O cão correu para longe " + dogA.getCorrer());
		System.out.println();
		
		System.out.println("O nome do cavalo é: " + cavB.getNome());
		System.out.println("A idade  do cão é: " + cavB.getIdade());
		System.out.println("O cavalo relinchou: " + cavB.getSom());
		System.out.println("O cavalo correu: " + cavB.getCorrer());
		System.out.println();
		
		System.out.println("O nome da preguiça é: "+ preC.getNome());
		System.out.println("A idade é: "+ preC.getIdade());
		System.out.println("A som da preguiça é: "+ preC.getSom());
		System.out.println("A preguiça escalou a arvóre: "+ preC.getSubirEmArvore());

	}

}
