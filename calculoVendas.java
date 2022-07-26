import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculoVendas{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); String prod = "";
        Scanner scanproduto = new Scanner(System.in); int quant = 0;
        double ProdT = 0;
        double Preco = 0;
        double total =0;
        int dia = 0;
        String mes = "";
        Scanner mesprod = new Scanner (System.in);
        int ano = 0;
        
        System.out.print("CONTROLE DE VENDAS\n");
    
        System.out.println(" Digite Fim para terminar o lançamento.");
        while (!prod.equals("Fim")) {

            System.out.print("Digite o nome do produto: \n");
            prod = scanproduto.nextLine();
            System.out.print("Informe o preço: \n");
            Preco = input.nextDouble();
            System.out.print("Informe a quantidade de produtos vendidos: \n");
            quant = input.nextInt();
            System.out.println("Informe o dia da venda: \n");
            dia = input.nextInt();
            System.out.println("Informe o mes da venda: \n");
            mes = mesprod.nextLine();
            System.out.println("Informe o ano da venda: \n");
            ano = input.nextInt();
            




            ProdT = (quant * Preco);
            System.out.println("Produto:" + prod);
            System.out.println("Preço unitário:" + Preco);
            System.out.println("Quantidade vendida:" + quant);
            System.out.println("Valor total do produto:\n" + ProdT);
            System.out.println(dia+ "/"+ " " + mes + " " +"/" + ano);
            
            total = total + ProdT;
            
            
      }
    
      
        System.out.println("R$ " + total);
    }
}