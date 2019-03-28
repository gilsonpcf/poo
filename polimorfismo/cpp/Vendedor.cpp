// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Polimorfismo em C++
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

#include "Vendedor.hpp"
#include <iostream>

Vendedor::Vendedor()
{

}

float Vendedor::getSalarioBase()
{
    return salarioBase;
}

void Vendedor::setSalarioBase(float s)
{
    salarioBase = s;
}

float Vendedor::getComissao()
{
    return comissao;
}

void Vendedor::setComissao(float c)
{
    comissao = c;
}

float Vendedor::calcularSalarioFinal()
{
    return salarioBase + comissao;
}