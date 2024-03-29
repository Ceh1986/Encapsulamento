package pacote02;

public class funcoesCarro {

  public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
        boolean i=true;
        
        carro meuCarro = new carro();
        
        System.out.println("Digite a marca do seu carro: ");
		String marca = scan.nextLine();
		meuCarro.setMarca(marca);
 
		System.out.println("Digite o modelo do seu carro: ");
		String modelo = scan.nextLine();
		meuCarro.setModelo(modelo);

		System.out.println("informe a placa do seu carro: ");
		String placa = scan.nextLine();
		meuCarro.setMarca(placa);
		
 
        while(i){
            String menu = """
                    ***************************
                    O que quer fazer com o carro:                
                    1 - Ligar
                    2 - Acelerar
                    3 - Frear
                    4 - Abastecer o carro
                    5 - Desligar
                    6 - Sair
                    ***************************
                    """;
 
            System.out.println(menu);
            int comando = scan.nextInt();
 
            switch(comando){
                case 1:
                    meuCarro.ligar();
                    break;
 
                case 2:
                    System.out.println("Quanto de aceleração?");
                    double x = scan.nextDouble();
                    meuCarro.acelerar(x);
                    break;
 
                case 3:
                    System.out.println("Quanto de frenagem?");
                    double y = scan.nextDouble();
                    break;
 
                case 4:
                	
                	System.out.println("Qual o valor atual da gasolina?");
                    double valorGasolina = scan.nextDouble();
                    double valorTotal = meuCarro.calcularValorTotal(valorGasolina);
                    System.out.println("O valor total para encher o tanque é: " + valorTotal);
                    break;
 
                case 5:
                    meuCarro.desligar();
                    break;
 
                case 6:
                    System.out.println("Saindo...");
                    i = false;
                    break;
 
                default:
                    System.out.println("Comando inválido. Por favor, tente novamente.");
                    break;
            }
            
            scan.close();
     

		}

	}

}
