# Esercizio - Spring Boot - Repository Spring 1
* scrivere un'applicazione Spring Boot con le dipendenze necessarie che:
  * utilizza `Rest Repositories HAL Explorer`
  * si connette a un db MySQL locale
  * rilascia lo schema alla fine della sessione
  * definisce una tabella di auto, dove ogni `Auto` ha:
    * una chiave primaria
    * un `modelName` non nullo
    * un `serialNumber` non nullo
    * un `currentPrice` che può essere nullo
  * definisce un repository per le auto, in modo che sia possibile utilizzare `HAL Explorer` per esplorare i dati
* usa `HAL Explorer` per aggiungere 2 auto nel database
* usa `HAL Explorer` per elencare tutte le auto nel database
* **nota per i revisori**: esempi di richieste di post HAL possono essere trovati in `HAL-REQUESTS.md`

# Exercise - Spring Boot - Spring Repositories 1
* write a Spring Boot application with the necessary dependencies that:
  * uses `Rest Repositories HAL Explorer`
  * connects to a local MySQL db
  * drops the schema at the end of the session
  * defines a table of cars, where each `Car` has:
    * a primary key
    * a `modelName` not null
    * a `serialNumber` not null
    * a `currentPrice` that can be null
  * defines a repository for the cars, so that it's possible to use `HAL Explorer` to explore the data
* use the `HAL Explorer` to add 2 cars in the database
* use the `HAL Explorer` to list all the cars in the database
* **note for reviewers**: examples of HAL post requests can be found in `HAL-REQUESTS.md`
