// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Encapsulamento em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include <string>

using namespace std;

class Aluno
{
public:
    Aluno();
    void setNome(string n);
    string getNome();
    void setIdade(int i);
    int getIdade();
    string getTurma();
    string getDataMatricula();

private:
    string nome;
    int idade;
    string turma;
    string dataMatricula;
    void defineTurma();
};
