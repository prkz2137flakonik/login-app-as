# porownanie linearlayout i constraintlayout

## liczba linii
- activity_main.xml (linearlayout): okolo 70-80 linii
- activity_main_constraint.xml (constraintlayout): okolo 95-110 linii

constraintlayout ma wiecej linii bo kazdy element potrzebuje kilku powiazan.

## ktory byl szybszy
linearlayout byl szybszy.
wystarczylo ustawic orientation vertical i dodawac elementy jeden pod drugim.
w constraintlayout trzeba bylo wiazac kazdy element z poprzednim i z krawedziami.

## ktory latwiej zmienic
linearlayout jest latwiejszy.
wstawiasz nowy element w odpowiednie miejsce i reszta sama sie przesuwa.

w constraintlayout trzeba:
1. dodac nowy element
2. przepiac powiazania sasiadow
3. sprawdzic czy nic sie nie rozjechalo

przy prostym formularzu linearlayout jest lepszy.