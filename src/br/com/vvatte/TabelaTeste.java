package br.com.vvatte;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TabelaTeste {

    public static void main(String[] args) {
        executeLeituraAnotacao();
    }

    private static void executeLeituraAnotacao() {
        Pessoa pessoa = new Pessoa();
        for (Field field : pessoa.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Tabela.class)){
                Tabela anotacao = field.getAnnotation(Tabela.class);
                System.out.println("Nome da anotação: " + anotacao.toString());
                System.out.println("Valor da anotação: " + anotacao.value());
                System.out.println("Tipo de anotação: "+ anotacao.annotationType());
            }
        }
    }
}
