# Autor: Jose
# language: en
@stories
Feature: History Test
  Un usuario quiere aprender a ser un tester automatizador
  @scenario1
  Scenario: Buscar curso en la web
    Given Juan quiere aprender a ser un tester automatizador
    | strUser              | strPassword             |
    | IngresarUserDeUTest  | IngresarPasswordDeUTest |
    When Buscar el curso en el sitio web
    | strCourse                         |
    | Introduction to Gambling Testing  |
    Then Elegir el curso
    | strCourse                         |
    | Introduction to Gambling Testing  |