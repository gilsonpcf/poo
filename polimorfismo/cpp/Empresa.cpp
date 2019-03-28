// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Polimorfismo em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "Funcionario.hpp"
#include "Vendedor.hpp"
#include "FreeLancer.hpp"
//#include <string>
#include <iostream>

using namespace std;

float obterSalarioDoFuncionario(Funcionario *funcionario)
{
    float resposta = funcionario->calcularSalarioFinal();

    return resposta;
}

int main()
{
    Vendedor v;
    FreeLancer f;

    v.setNome("Carlos");
    v.setSalarioBase(2000);
    v.setComissao(3000);

    cout << "Salario do vendedor: " << obterSalarioDoFuncionario(&v);

    f.setNome("Clara");
    f.setDiasTrabalhados(20);
    f.setValorDia(150);

    cout << "\nSalario do free lancer: " << obterSalarioDoFuncionario(&f);

    return 0;
}