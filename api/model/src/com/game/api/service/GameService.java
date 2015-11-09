package com.game.api.service;

import com.game.api.model.*;
import com.game.api.model.monster.Monster;

/**
 * Created by denis.selutin on 5/29/2015.
 */
public interface GameService {
    public com.game.api.model.Character getUserCharacter();
    public Monster[] getMonsters();
    public void calculateNextStep();
}
/* II вариант - игра. 
У нас есть монстры и персонаж. У каждого монстра есть свой тип, жизни, атака и прочее. 
То же ссамое есть и у персонажа.
Задача заключается в создании определенного колличества монстров и персонажа (то что будет у ва с мейне).
Далее все существа начинают двигаться в какомто направлении(пускай будет автоматически - мы не задаем направление). 
После передвижение находятся соседи с которыми существо может подратся и расчитывается исход боя. 
Задачи - реализовать игру на основе представленых интерфейсов.

Интерфейсы с примерами вы можете найти на гит-хабе
https://github.com/denis-selutin/Source-IT/tree/master/examples/ex6/src/com

Работая в комманде разделите обязанности: 
один человек создает модели и генератор, второй - делает вычисления. Или по вашему усмотрению.

Полезные ссылки:
http://easy-code.ru/lesson/java-nested-classes
http://www.quizful.net/post/inner-classes-java
http://habrahabr.ru/post/30444/

P.S. Разбиваться на пары - обязательно! На задание - месяц. 
P.P.S. Можно НЕ МНОГО переделать интерфейсы, но не так чтобы это стало итоговым :)

-- 
Best regards,
Denis
*/