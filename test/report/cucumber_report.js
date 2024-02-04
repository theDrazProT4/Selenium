[
  {
    "line": 1,
    "elements": [
      {
        "before": [
          {
            "result": {
              "duration": 5926954400,
              "status": "passed"
            },
            "match": {
              "location": "Hooks.setUp()"
            }
          }
        ],
        "line": 4,
        "name": "Ingresar a la Categoria Comics desde Home",
        "description": "",
        "id": "categoria-comics;ingresar-a-la-categoria-comics-desde-home",
        "after": [
          {
            "result": {
              "duration": 744018100,
              "status": "passed"
            },
            "match": {
              "location": "Hooks.tearDown()"
            }
          }
        ],
        "type": "scenario",
        "keyword": "Scenario",
        "steps": [
          {
            "result": {
              "duration": 307776000,
              "status": "passed"
            },
            "line": 5,
            "name": "el usuario se encuentra en la pagina Home",
            "match": {
              "location": "Test.el_usuario_se_encuentra_en_la_pagina_Home()"
            },
            "keyword": "Given "
          },
          {
            "result": {
              "duration": 1045621300,
              "status": "passed"
            },
            "line": 6,
            "name": "hacen click en el boton",
            "match": {
              "location": "Test.hacen_click_en_el_boton()"
            },
            "keyword": "When "
          },
          {
            "result": {
              "duration": 119739000,
              "status": "passed"
            },
            "line": 7,
            "name": "debe redirigir a la pantalla comics",
            "match": {
              "location": "Test.debe_redirigir_a_la_pantalla_comics()"
            },
            "keyword": "Then "
          }
        ]
      }
    ],
    "name": "Categoria Comics",
    "description": "Como usuario quiero leer comics",
    "id": "categoria-comics",
    "keyword": "Feature",
    "uri": "test.feature"
  }
]