// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Herança em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "Pessoa.hpp"
#include "Aluno.hpp"
#include "Funcionario.hpp"
//#include <string>
#include <iostream>

using namespace std;

int main()
{
    cout << "Iniciando o processo de criacao de um objeto Pessoa";
    Pessoa p;

    cout << "\n\nIniciando o processo de criacao de um objeto Aluno";
    Aluno a;

    cout << "\n\nIniciando o processo de criacao de um objeto Funcionario";
    Funcionario f;

    p.setNome("Vanderlei");
    p.setEndereco("Rua 15 de novembro, 345");
    p.setDataNascimento("12/05/1960");

    a.setNome("Maria");
    a.setEndereco("Rua 26 de agosto, 1874");
    a.setDataNascimento("31/01/1990");
    a.setCurso("Ciencia da Computacao");
    a.setSemestre("4o");

    f.setNome("Pedro");
    f.setEndereco("Rua 7 de setembro, 3875");
    f.setDataNascimento("27/10/1980");
    f.setCargo("Arquiteto de software");
    f.setSalario(10000);

    cout << "\n\nDados cadastrados no objeto p - do tipo Pessoa";
    cout << "\nNome: " << p.getNome();
    cout << "\nEndereco: " << p.getEndereco();
    cout << "\nData de nascimento: " << p.getDataNascimento();

    cout << "\n\nDados cadastrados no objeto a - do tipo Aluno";
    cout << "\nNome: " << a.getNome();
    cout << "\nEndereco: " << a.getEndereco();
    cout << "\nData de nascimento: " << a.getDataNascimento();
    cout << "\nCurso: " << a.getCurso();
    cout << "\nSemestre: " << a.getSemestre();

    cout << "\n\nDados cadastrados no objeto f - do tipo Funcionario";
    cout << "\nNome: " << f.getNome();
    cout << "\nEndereco: " << f.getEndereco();
    cout << "\nData de nascimento: " << f.getDataNascimento();
    cout << "\nCargo: " << f.getCargo();
    cout << "\nSalario: " << f.getSalario();

    return 0;
}