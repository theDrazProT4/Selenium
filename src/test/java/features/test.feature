@funcional
Feature: Categoria Comics
  Como usuario quiero leer comics

  @browser @slow
  Scenario: Ingresar a la Categoria Comics desde Home
    Given el usuario se encuentra en la pagina Home
    When hacen click en el boton
    Then debe redirigir a la pantalla comics

  @outline @fast
  Scenario Outline: Bebiendo
    Given Hay <cantIni> cervezas
    When Tomo <cantBebida> cervezas
    Then Deberian quedar <CantRest> cervezas
    @test1
    Examples:
      | cantIni | cantBebida | CantRest |
      | 10      | 5          | 5        |
      | 15      | 10         | 5        |
      | 10      | 1          | 9        |

  @docstring
  Scenario: Doc String
    Given Un blog "Random"
      """
      La teoría de la relatividad general propone
      que la propia geometría del espacio-tiempo
      se ve afectada por la presencia de materia.
      """


  @datatable
  Scenario: Data table
    Given Los siguientes usuarios existentes:
      | nombre | email           | twitter |
      | santi  | santi@gmail.com | @santi  |
      | orion  | ori@gmail.com   | @ori    |
