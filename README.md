![Language badge](https://img.shields.io/badge/Language-Kotlin-blue?style=flat=appveyor)

# Language
1. [Русский](#русский)
2. [English](#english)

# Русский
1. [О приложении](#о-приложении)
2. [Стек](#стек)
   1. [Фичи](#фичи)
3. [Ошибки и проблемы](#ошибки-и-проблемы)
4. [Дальнейшее развитие](#дальнейшее-развитие)
5. [Поддержка разработчика](#поддержка-разработчика)

## О приложении
В начальной стадии приложение представляет из себя простейший планировщик дня с приятным интерфейсом (который ещё и соответствует [Material3](https://m3.material.io/), но это не точно).
### Фичи
- Добавить, удалть и редактировать задания ~~**Вау! Это же так необычно!**~~
- Поставить или изменить время пробуждения и отхода ко сну (**опционально!**)
- И, ~~кто бы сомневался~~, посмотреть информацию о разработчике
Конечно же, всё будет дополняться, но базовый функционал перечислен выше.
## Стек
- [Kotlin](https://kotlinlang.org/)
- MVVM/MVI (открыт вопрос о использовании стейтов и эвентов с бойлерплейтом)
- [Room](https://developer.android.com/training/data-storage/room), [SharedPreferences](https://developer.android.com/training/data-storage/shared-preferences), LiveData/Flow (возможно LiveData -> Flow)
- [Coroutines](https://developer.android.com/kotlin/coroutines) (~~Куда же без них!~~)
- Jetpack navigation/Odyssey (что смогу, то и сделаю)
- [Jetpack Compose](https://developer.android.com/jetpack/compose) (~~Вау, он собрал весь смузи-стек!~~) + Material3(https://m3.material.io/)
- Dagger2/Hilt
- И, конечно же, [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html) + [bonus](https://habr.com/ru/company/mobileup/blog/335382/) (~~**но зачем все эти датасорсы и юзкейсы в одностраничном приложении?**~~)

## Ошибки и проблемы
- [X] [Дизайн](https://www.figma.com/file/Y8fhIDy9Dp7zIQ9MgVFYBG/%D0%9F%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5?node-id=0%3A1)
- [X] Проект создан
- [ ] Figma design -> Compose
- [ ] Реализация Domain Layer
- [ ] Реализация Data Layer
- [ ] Определиться с использованием DI, LiveData/Flow, MVI/MVVM

## Дальнейшее развитие
В текущих условия рано планировать развитие, однако есть нацеленность на добавление блока заметок.

## Поддержка разработчика
~~Подписывайтесь на бусти:smile:~~
Я ещё не придумал, да и приложение не началось создаваться. Ещё рано...:smirk:

# English
Coming soon... :weary:
