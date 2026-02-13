public class Teste {
    public static void main(String[] args) {

        Ano ano1 = new Ano(2023);

        // Acessa o array de meses do objeto ano1 e atribui um novo objeto Mes na posição desejada
        ano1.getMeses()[0] = new Mes("Janeiro", 24.5);
        ano1.getMeses()[1] = new Mes("Fevereiro", 23.6);
        ano1.getMeses()[2] = new Mes ("Março", 26.7);
        ano1.getMeses()[3] = new Mes ("Abril", 27.0);
        ano1.getMeses()[4] = new Mes ("Maio", 27.8);
        ano1.getMeses()[5] = new Mes ("Junho", 26);
        ano1.getMeses()[6] = new Mes ("Julho", 21.9);
        ano1.getMeses()[7] = new Mes ("Agosto", 22.5);
        ano1.getMeses()[8] = new Mes ("Setembro", 24);
        ano1.getMeses()[9] = new Mes ("Outubro" , 20.9);
        ano1.getMeses()[10] = new Mes ("Novembro", 23);
        ano1.getMeses()[11] = new Mes ("Dezembro", 25.0);

        Ano ano2 = new Ano(2024);
        ano2.getMeses()[0] = new Mes("Janeiro", 25.2);
        ano2.getMeses()[1] = new Mes("Fevereiro", 24.1);
        ano2.getMeses()[2] = new Mes("Março", 27.3);
        ano2.getMeses()[3] = new Mes("Abril", 27.8);
        ano2.getMeses()[4] = new Mes("Maio", 28.4);
        ano2.getMeses()[5] = new Mes("Junho", 26.8);
        ano2.getMeses()[6] = new Mes("Julho", 22.3);
        ano2.getMeses()[7] = new Mes("Agosto", 23.0);
        ano2.getMeses()[8] = new Mes("Setembro", 24.7);
        ano2.getMeses()[9] = new Mes("Outubro", 21.5);
        ano2.getMeses()[10] = new Mes("Novembro", 23.6);
        ano2.getMeses()[11] = new Mes("Dezembro", 25.9);

        Ano ano3 = new Ano(2025);
        ano3.getMeses()[0] = new Mes("Janeiro", 23.9);
        ano3.getMeses()[1] = new Mes("Fevereiro", 22.8);
        ano3.getMeses()[2] = new Mes("Março", 26.1);
        ano3.getMeses()[3] = new Mes("Abril", 26.5);
        ano3.getMeses()[4] = new Mes("Maio", 27.2);
        ano3.getMeses()[5] = new Mes("Junho", 25.4);
        ano3.getMeses()[6] = new Mes("Julho", 21.2);
        ano3.getMeses()[7] = new Mes("Agosto", 21.9);
        ano3.getMeses()[8] = new Mes("Setembro", 23.5);
        ano3.getMeses()[9] = new Mes("Outubro", 20.1);
        ano3.getMeses()[10] = new Mes("Novembro", 22.4);
        ano3.getMeses()[11] = new Mes("Dezembro", 24.3);

        //Previsoes para os proximos 3 anos
        //Array para armazenar os anos e poder calcular
        Ano [] anosBase= new Ano[]{ano1, ano2, ano3};

        //Percorrer o array de anos base e calcula o próximo ano
        for(int j = 0; j < 3; j++) {
            // Armazena o ano base atual
            Ano anobase = anosBase[j];
            int proxAno = anobase.getValor() + 3;

            Ano novoAno = new Ano(proxAno);
            System.out.println("\n------------------------------------------\n");
            System.out.println("PREVISÃO PARA O ANO DE " + novoAno.getValor());

            for(int i = 0; i < 12; i++){
                double anterior, atual, sucessor;

                if(i == 0 ){
                    atual = anobase.getMeses()[0].getTemperatura();
                    sucessor = anobase.getMeses()[1].getTemperatura();
                    anterior = anobase.getMeses()[0].getTemperatura();

                }else if(i == 11){
                    atual = anobase.getMeses()[11].getTemperatura();
                    sucessor = anobase.getMeses()[11].getTemperatura();
                    anterior = anobase.getMeses()[10].getTemperatura();
                } else{
                    atual = anobase.getMeses()[i].getTemperatura();
                    sucessor = anobase.getMeses()[i + 1].getTemperatura();
                    anterior = anobase.getMeses()[i - 1].getTemperatura();

                }
                double media = (atual + anterior + sucessor) / 3;
                double previsao = media + (0.13 * 3);

                String[] nomesMeses = {
                        "Janeiro", "Fevereiro", "Março", "Abril",
                        "Maio", "Junho", "Julho", "Agosto",
                        "Setembro", "Outubro", "Novembro", "Dezembro"
                };
                    System.out.printf(nomesMeses[i] + " - %.2f \n", previsao);


            }
        }
        }}

