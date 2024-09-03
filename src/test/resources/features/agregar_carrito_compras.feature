# language: es

Característica: GAgregar 2 cantidades de un producto / Agregar 3 cantidades de un producto

  @AgregarDosCantidades
  Escenario: Agregar 2 cantridades de un producto
    Dado Un cliente ingresa a la pagina floristearia mundo flor
    Cuando Seleccione el producto y agregue una cantidad de dos para un producto
    Entonces podra visualizar el mensaje con nombre del producto y su cantidad


  @AgregarTresCantidades
  Escenario: Agregar 3 cantridades de un producto
    Dado Un cliente ingresa a la pagina floristearia mundo flor
    Cuando Seleccione el producto y agregue una cantidad de tres para un producto
    Entonces podra visualizar el mensaje con nombre del producto y su cantidad