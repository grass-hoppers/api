## API
http://51.250.90.109:8080/news/DIRECTOR
http://51.250.90.109:8080/news/ACCOUNTANT
#### `Get:(news/{ROLE})` Получить топ 10 новостей для роли {ROLE}
```
[
    {
        "id": 411,
        "header": "заголовок",
        "link": "https://...",
        "date": 1665077400
    }
]
```
http://51.250.90.109:8080/insights
#### `Get:(news/{ROLE})` Получить список инсайдов
```
[
    {
        "id": 1,
        "insight": "Благоприятная возможность взять кредит для бизнеса"
    }
]
```

http://51.250.90.109:8080/insights
#### `Get:(news/{ROLE})` Получить список трендов
```
[
    {
        "trend": "Text"
    }
]
```
## Локальный запуск
### Вариант 1) Собрать и запустить контейнер через `./gradlew bootBuildImage --imageName=$IMAGE_NAM`
### Вариант 2) Запустить ApiNewsApplication.class
### В обоих случаях указать в параметрах окружения данные для доступа к бд\\
```
spring.datasource.url=${datasource.url}
spring.datasource.username=${datasource.user}
spring.datasource.password=${datasource.password}
```
