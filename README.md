

ekran rejestracji

- Java
- Android SDK
- LinearLayout (pionowy)



-  naglowek na cala szerokosc
- pola e-mail i hasla
-  wysrodkowany przycisk i etykieta wyniku
-  wszystkie teksty w strings.xml

Autor

Jakub Perkowski

## zadanie 2 – klkulator

## poziomy zagniezdzenia
Uklad ma 2 poziomy zagniezdzenia:
1. glowny pionowy LinearLayout (kontener)
2. poziome LinearLayouty (rzedy przyciskow) wewnaatrz niego

## wagi w ostatnim rzedzie
- "0` → weight = 1
- `,` → weight = 1
- `=` → weight = 2

dzieki temu `=` zajmuje dwa razy wiecej miejsca niz pozostale przyciski.


## pytanie o etapy refaktoryzacji

gdyby wyswietlacz mial pokazywac maksymalnie 10 znakow:

- po etapie 1 (osobna metoda na kazda cyfre): trzeba poprawic -10 miejsc- (kazda metode `append7`, `append8` itd.).
- po etapie 3(wspolny listener): trzeba poprawic -1 miejsce- – tylko metode `appendSymbol`.