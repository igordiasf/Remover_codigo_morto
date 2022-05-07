package Refatorado;

public class RH {
    public String contratarfuncionario(Funcionario funcionario){
        return "O funcionario " + funcionario.getNome() + " Foi contratado";
    }
    public String demitirfuncionario(Funcionario funcionario){
        return "O funcionario " + funcionario.getNome() + " Foi demitido";
    }
}
