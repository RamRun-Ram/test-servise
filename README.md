# test-servise
1. 3 разных типа объектов, которые я бы разделил в отдельные классы(Test,Document,DictionaryValue)
2. Логика заключается в том, что можно проводить Проверку(Test) над Документами(Document) и Значениями слов(DictionaryValue).
3. Поле sortedOrder нам не требуется в связи с тем, что различные варианты сортировки уже есть в репозитории
4. Id не может быть null
5. Для временных дат существуют отдельные классы например LocalDate
6. Для поля DictionaryValueName лучше подойдет тип данных String
7. Для поля TestName нет смысла сразу присваивать значение и лучше его перенести в конструктор DTO класса, чтобы оно участвовал в создании объекта.
8. Нет смысла всем полям присваивать значение null
9. Поля id и testId скорее всего отвечают за одно и тоже.Одно поле нужно удалить