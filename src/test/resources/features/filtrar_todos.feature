# language: es

Característica: Filtrar imagenes por Todos
  Como usuario web
  Quiero filtrar las imágenes
  Para ver todas las fotos tanto de perros como de gatos

  Escenario: Filtrar por todos
    Dado Usuario despliega pagina web
    Cuando Usuario filtra por All en petbook
    Entonces debe ver solo fotos de all