# Задача №1. Только что

Социальные сети и мессенджеры показывают, когда ваш собеседник последний раз был онлайн.

## Какие правила стоит учесть

1. Если количество секунд от 0 до 60, используйте вариант с только что.
2. Если количество секунд от 61 до 60 * 60 (один час), вариант с x минут назад.
3. Если количество секунд от 60 * 60 + 1 до 24 * 60 * 60 (сутки), вариант с x часов назад.
4. Если количество секунд от суток до двух, вариант вчера.
5. Если количество секунд от двух суток до трёх, вариант позавчера.
6. Если количество секунд больше трёх суток, вариант давно. 