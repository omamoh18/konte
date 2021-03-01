# Oppgave 1 - Docker

## Oppgave A:

Her ble vi bedt om å lag en `Dockerfile` som skal et Docker container image av
Spring boot applikasjonen.

Dette imaget kan sensor nå finne under `oppgave1-docker modulen`.

Sensor kan nå bygge Docker container imaget ved å skrive inn kommandoen `docker build . --tag konte`


## Oppgave B:

### Kommando for å bygge et image:

Her blir vi bedt om å svare på hvilken kommando av `docker run...` sensor må skrive inn i terminaken for å
starte `latest`.

Kommandoen sensor må kjøre er `docker build -d --name test-image -p 8080:9999 konte_latest`

Dette vil starte en container av det siste docker imaget som da sensor kan nå på port 8080
på sin lokale maskin. Siden kan besøkes på `http://www.localhost:8080/`.


### 404 Not Found

I oppgaven ble vi bedt å finne ut hvorfor vi fikk `404 not found` når vi kjørte opp en
docker container.

Her la jeg fort merkte til at `index.html` kunne være årsaken til problemet, dette var
fordi docker ikke fant filen `index.html` siden den ikke var i docker.

Dette kan sikkert løses på mange ulike måter, men den letteste for meg var å sette
den inn i `Dockerfile` som dette: