# Alexander Nevsky API  
# API Александр Невский (Курицын)  
____
Данный проект является аналогом пародии ресурса с фактами о Чаке Норрисе https://api.chucknorris.io/, 
только ориентированый на (Александра Невского aka Курицына)[https://www.kinopoisk.ru/name/224576/].  

В api представлены не факты, а вырезки из его многочисленных интервью, которые показались мне наиболее забавными 
(а такое просто необходимо увековечить :)).

____
## Пример использования

```
$ curl --request GET \
       --url 'https://host:port/statements/random' \
       --header 'accept: application/json'
```

Пример ответа:

```json
{
  "valueRu": "Абсолютли!",
  "valueEn": "Absolutely!"
}
```