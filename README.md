# Задание

Выбрать любой сервис для предоставления прогноза погоды, у которого есть REST API. 
Разработать сервис, который будет возвращать погоду для какого-либо места, проксируя вызовы к этому API. 

Разработанный сервис должен: 
1) Иметь REST API
2) Желательно иметь Swagger, чтобы через него можно было удобно обращаться к API
3) Кэшировать запросы в любое хранилище (Redis/база/e.t.c.) с TTL в 30 секунд
4) В качестве средства определения места для выдачи по нему погоды можно использовать адрес, координаты e.t.c. Тут можно опереться на API источник информации.
