# language: es

Característica: Filtrar imagenes por ninguno
  Como usuario web
  Quiero filtrar las imágenes
  Para no ver fotos ni de perros ni de gatos

  Escenario: Filtrar por ninguno
    Dado Usuario despliega pagina web
    Cuando Usuario filtra por None en petbook
    Entonces debe ver solo fotos de none

