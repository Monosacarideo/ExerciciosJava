public class Principal {
    public static void main(String[] args) {

        Banco b = new Banco(); // porque queremos apenas um objeto banco

        int opcao;

        do {
            opcao = EntradaSaida.escolherOpcaoMenu();

            switch (opcao) {
                case 1:
                    Conta c = new Conta(); // sempre precisamos criar um novo objeto conta
                    c.setAgencia(EntradaSaida.solicitarDadoConta("a agência"));
                    c.setNumero(EntradaSaida.solicitarDadoConta("o número"));
                    Pessoa p = new Pessoa();
                    p.setCpf(EntradaSaida.solicitarCpf());
                    p.setDataNascimento(EntradaSaida.solicitarDadoTitular("a data de nascimento"));
                    p.setNome(EntradaSaida.solicitarDadoTitular("o nome completo"));
                    c.setTitular(p);
                    b.adicionarConta(c); // adicionando o objeto conta na lista do objeto banco

                    break;

                case 2:
                    if (b.listaDeContas.isEmpty()) {
                        EntradaSaida.mostrarAlerta("Não existe nenhuma conta criada!");
                    } else {
                        EntradaSaida.mostrarContas(b.listarContas());
                    }

                    break;

                case 3:
                    int agencia = EntradaSaida.solicitarDadoConta("a agência");
                    int numero = EntradaSaida.solicitarDadoConta("o número");

                    Conta conta = b.encontrarConta(agencia, numero);
                    if (conta != null) {
                        conta.depositar(EntradaSaida.solicitarValorOperacao("depósito"));
                    } else {
                        EntradaSaida.mostrarAlerta("A agência e número digitados não correspondem a nenhuma conta!");
                    }
                    break;

                case 4:
                    agencia = EntradaSaida.solicitarDadoConta("a agência");
                    numero = EntradaSaida.solicitarDadoConta("o número");

                    conta = b.encontrarConta(agencia, numero);
                    if (conta != null) {
                        conta.sacar(EntradaSaida.solicitarValorOperacao("saque"));
                    } else {
                        EntradaSaida.mostrarAlerta("A agência e número digitados não correspondem a nenhuma conta!");
                    }
                    break;

            }
        } while (opcao != 5);

    }
}