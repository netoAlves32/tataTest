# language: es
Característica: Filtrar imagenes de perros
  Como usuario web
  Quiero filtrar las imágenes
  Para ver fotos de perros

  Escenario: Filtrar perros
    Dado Usuario despliega pagina web
    Cuando Usuario filtra por Perro en petbook
    Entonces debe ver solo fotos de perro