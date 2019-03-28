// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Polimorfismo em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "FreeLancer.hpp"
#include <iostream>

FreeLancer::FreeLancer()
{

}

int FreeLancer::getDiasTrabalhados()
{
    return diasTrabalhados;
}

void FreeLancer::setDiasTrabalhados(int d)
{
    diasTrabalhados = d;
}

float FreeLancer::getValorDia()
{
    return valorDia;
}

void FreeLancer::setValorDia(float v)
{
    valorDia = v;
}

float FreeLancer::calcularSalarioFinal()
{
    return diasTrabalhados * valorDia;
}