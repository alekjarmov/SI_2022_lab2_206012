## Алек Јармов, бр. на индекс 206012

###  Control Flow Graph

![si](https://user-images.githubusercontent.com/6871971/170355569-1e60b811-b24d-45f1-93d6-d4a8fa59184b.png)

### Цикломатска комплексност

Цикломатската комплексност е 9. Ја имам пресметано со формулата |E|-|V|+2
каде што |Е| е бројот на ребра во CFG, а |V| e бројот на темиња. Бидјќи имам 22 темиња и 29 ребра се добива
|E|-|V|+2=29-22+2=9

### Тест случаи според критериумот  Every statement 

![image](https://user-images.githubusercontent.com/6871971/170370665-66d724cf-c95b-4037-bf99-e2cdfcf0fef1.png)

Јасно јазелот А се опфаќа со било која вредност за list.
Со првиот тест пример се опфаќа јазелот B за кој што единствен начин да се опфати е влезен аргумент да биде празна низа.

Со вториот тест пример се опфаќа јазелот C и  јазелот D кој може да се опфати само со низа која што има барем еден елемент и бројот на елементи во низата не е полн квадрат.

Сега доколку ставиме листа која што е полн квадрат мора да има барем една "#" за да стигне до Q. 
Јазлите Е, F.1 ,  F.2, F.3 и R ќе ги опфатиме со секоја која има број на елементи кој што е полн квадрат. 
За да го помине јазелот H јасно мора да има и барем една "0". Нека n = големината ла листата од сега ќе ја користам терминологијата i-тиот ред што би ми означувал листа со (k=корен од n) елемети која ги содржи елементите list[(i-1)*k], list[(i-1)*k+1],list[(i-1)*k+2]..list[(i-1)*k+k-1].За да влеземе во јазелот I мора да имаме една редица каде што има барем една "#" и една "0".Додека пак за да влеземе во Ј мора да има редица каде што има "0" што не е на прво или на последно место и пред неа и после неа има барем една бомба за таа цел првата редица е од облик ["#","0","#"], додека пак за да влеземе во К мора да има редица каде што до "0" има точно една "#" затоа втората редица е од облик ["0","0","#"].Од графот може да се види дека доколку е опфатен H тогаш е сигурно опфатен и L, a доколку е опфатен L сигурно е опфатен и N и слично доколку е опфатен N ќе биде опдатен и P, па сега останува да се опфататат јазлите М и О. Да речеме дека сме на j-тиот индекс од  редица-r, за да се опфати М треба треба на (r-1)вата редица да има "#"  на ј-тиот индекс, додека пак за да се опфати јазелот О треба на (r-1)вата редица да има "#"  на ј-тиот индекс.Затоа третата редица ќе ми биде ["#","#","#"] за првата "0" во втората редица да ги исполни критериумите за М и О.Со овие 3 теста сега сум осигуран дека се посетени сите јазли

### Тест случаи според критериумот Every branch
![image](https://user-images.githubusercontent.com/6871971/170381075-741e07ff-661b-461d-8062-8c92c615a7ff.png)

Со every-branch методата треба да се осигураме дека ќе ги посетуваме двата исходи кај јазлите на одлука. Јазли на одлука се: А, C, F.2, G, H, I, L, N 
Првиот тест пример е празна листа затоа што само празна листа би го опфатила јазолот A-B.

Со вториот тест пример се опфаќа гранката A-C и гранката C-D кој може да се опфати само со низа која што има барем еден елемент и бројот на елементи во низата не е полн квадрат. Со ова се опфатени сите исходи кај јазолот А.

Со третиот тест пример ќе се опфатат останатите ребра. 
Нека n = големината ла листата. Од сега ќе ја користам следнава терминологија: i-тиот ред би ми означувал листа со (k=корен од n) елемети која ги содржи елементите list[(i-1)*k], list[(i-1)*k+1],list[(i-1)*k+2]..list[(i-1)*k+k-1]. Исто така како соседи во една ред дефинирам 2 елементи со индекси i и j така што |i-j|=1, додека пак ако за елемент со индекс ј од редица i кажам елементот над него мислам на елеметот со индекс ј од редицата (i-1). Слично за елемент со индекс ј од редица i доколку кажам под него се мисли на елементот со индекс ј од редица (i+1).
Доколку ставиме листа која што има барем еден елемент и n e полн квадрат тогаш ќе го опфатиме реброто C-E со што се поминати сите исходи кај јазелот C исто така кај F.2 ќе ги поминеме F.2-G и F.2-R со што сме ги поминале и сите исходи кај јазолот F.2. За да ги поминеме сите исходи кај јазелот G мора да има барем една "#" и барем една "0" во листата. Остануваат јазлите на одлука L, H, и I. За да се исполнат сите исходи кај H мора да има една редица каде што "0" има соседна "#" и редица каде што "0" нема соседна "#" затоа првата редица ќе биде ["0","0","#"], таа ги исполнува овие 2 услови и со тоа се посетени двата јазли на одлука кај H. За да се исполнат двата исхода кај јазелот I треба да постои редица со "0" што има една соседна "#" што е првата редица  и редица со "0" што има 2 соседни "#" па затоа втората редица ми е  ["#","0","#"] со ова се посетени двата јазли кај I. За да се посетат двата јазли кај L треба да има "0" која што има "#" над нејзе и "0" која што нема "#" над нејзе додека пак за да се посетат двата јазли кај Ј потребно е да има "0" која што има "#" под неа и "0" која што нема "#" под нејзе затоа третата редициа ќе ми биде ["0","0","0"] со ова сме осигурани дека кај секој јазел на одлука се поминати двата исходи.

 

### Објаснување на напишаните unit tests

...
...
