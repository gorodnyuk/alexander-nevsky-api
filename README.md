# Alexander Nevsky API

# API Александр Невский (Курицын)

Данный проект является аналогом пародийного ресурса с фактами о Чаке Норрисе https://api.chucknorris.io/,
только ориентированый на [Александра Невского -aka- Курицына](https://www.kinopoisk.ru/name/224576/).

В api представлены не факты, а вырезки из его многочисленных интервью, которые показались мне наиболее забавными
(а такое просто необходимо увековечить :)).

## Пример использования

```
$ curl --request GET \
       --url 'http://host:port/statements/random' \
       --header 'accept: application/json'
```

Пример ответа:

```json
{
  "valueRu": "Абсолютли!",
  "valueEn": "Absolutely!"
}
```

P.S. В проекте используется in-memory база данных H2, т.к. не предполагается, что будет использоваться что-то еще,
кроме получения ресурса, поэтому, если вдруг кому-нибудь захочеться добавить какое-нибудь высказывание, то
можно смело выставлять pull request прямо во второй changeset (`2-insert-some-statements.xml`). Ничего не поломается ;)
