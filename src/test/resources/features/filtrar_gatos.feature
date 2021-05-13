# language: es
Característica: Filtrar imagenes de gatos
  Como usuario web
  Quiero filtrar las imágenes
  Para ver fotos de gatos

  Escenario: Filtrar gatos
    Dado Usuario despliega pagina web
    Cuando Usuario filtra por Gato en petbook
    Entonces debe ver solo fotos de gato