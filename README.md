# demo21

## MyBatis Dynamic
- 配合mybatis generator,產生Table的dao與entity
- 每個database對應一個generator的xml
- informix最少需在11版以上才能使用generator
- [mybatis dynamic官網](https://mybatis.org/mybatis-dynamic-sql/docs/introduction.html)

## 配合bean-searcher套件,製作可以前端作為查詢資料的API
- 下列後修改資料庫連結字串即可使用
- 複製informix Dailect, override原套件預設支援MySQL
- 套件相關內容, 可查看 [Bean Searcher介紹](https://searcher.ejlchina.com/guide/latest/introduction.html)
