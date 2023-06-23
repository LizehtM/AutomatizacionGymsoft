@author:LizehtMuñoz

Feature: automatizar la pgina de gymsoft
  El usuario podra ingresar a la pagina de
  gymsoft y podra hacer uso de todo el aplicativo

  Background: cargar la pagina de gymsoft
    Given el usuario ingresa a la pagina de gymsoft

  Scenario: el usuario inicia sesion
    When el usuario ingresa las credenciales
      | user        | password     |
      | gerentesibo | S1b0g1m*2020 |

    And el usuario selecciona ciudad "bello" y sucursal "Sibo"


    Then el usuario se encuentra en la pagina de inicio

