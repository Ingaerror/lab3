package models;
import models.Interfaces.ToFind;

public class Action {
    public Character louis;
    public Action(Character louis) {
        this.louis= louis;
    }
    public void secondAction() {
        this.landedOn();
        System.out.print(", но ");
        this.couldNotResist();
        System.out.print(" и ");
        this.overturned();
        System.out.println(".");
    }
    private void overturned() {
        System.out.print("опрокинулся на " + this.louis.findByNameBodyParts(this.louis.bodyParts, "спину").getBodyPart());
    }
    private void couldNotResist() {
        if (this.louis.isClumsy) {
            System.out.print("не удержался");
        }
    }
    private void landedOn() {
        System.out.print(this.louis.name + " приземлился на " + this.louis.findByNameBodyParts(this.louis.bodyParts, "носки").getBodyPart());
    }
    public void thirdAction(Item grass) {
        this.rise();
        System.out.print(", ");
        this.wentDown();
        System.out.print(" и ");
        this.startedDigging(grass);
        System.out.println(".");
    }
    private void startedDigging(Item grass) {
        System.out.print("стал рыться в " + grass.name);
    }
    private void wentDown() {
        System.out.print(this.louis.name + " спустился вниз");
    }
    private void rise() {
        System.out.print("Поднявшись");
    }
    public void fourthAction(Item shovel, Item treeCrowns, Light light) {
        this.find(shovel);
        System.out.print(" - ");
        this.glow(shovel, light);
        System.out.print(", ");
        this.wadingThrough(treeCrowns);
        System.out.println(".");
    }
    private void wadingThrough(ToFind treeCrowns) {
        this.louis.location.setLocation(treeCrowns);
        System.out.print("пробивающемся сквозь " + treeCrowns.getName());
    }
    private void glow(Item shovel, Light light) {
        System.out.print(shovel.name + " отсвечивала в " + light.adjective + " " + light.name);
    }
    private void find(Item shovel) {
        this.louis.give(shovel);
        System.out.print(shovel.name + " " + this.louis.name + " нашел" + " сразу");
    }
    public void fifthAction(Flashlight flashlight, Item grass) {
        this.cantFind(flashlight);
        System.out.print(" - ");
        this.mightRollOff(flashlight, grass);
        System.out.println("?");
    }
    private void mightRollOff(Flashlight flashlight, Item grass) {
        System.out.print("куда " + flashlight.name + " мог укатиться в этой" + grass.adjective + " " + grass.name);
    }
    private void cantFind(Flashlight flashlight) {
        System.out.print(Times.fewMinutes.getTime() + " " + this.louis.name + " не мог отыскать " + flashlight.name);
    }
    public void sixthAction() {
        this.standOn();
        System.out.print(", ");
        this.feel();
        System.out.print(", ");
        this.reverberate();
        System.out.println(".");
        System.out.println();
    }
    private void reverberate() {
        System.out.print("как в " + this.louis.findByNameBodyParts(this.louis.bodyParts, "груди").getBodyPart() + " отдаются " + this.louis.findByNameBodyParts(this.louis.bodyParts, "удары сердца").getBodyPart());
    }
    private void feel() {
        System.out.print("чувствуя");
    }
    private void standOn() {
        System.out.print(this.louis.name + " стал на " + this.louis.findByNameBodyParts(this.louis.bodyParts, "четвереньки").getBodyPart());
    }
    public void seventhAction(Flashlight flashlight, Flashlight shadow) {
        this.finallySee(flashlight);
        System.out.print(", ");
        this.louis.location.x = 8;
        flashlight.location.x = 13;
        this.getAppearance(shadow, flashlight);
        System.out.print(", ");
        this.expectedToFind(flashlight);
        System.out.println(".");
    }
    private void getAppearance(Flashlight shadow, Flashlight flashlight) {
        System.out.print(shadow.adjective + " " + shadow.name + " в " + this.louis.location.getDistance(flashlight) + " " + Measures.feet.getMeasure() + " от места");
    }
    private void expectedToFind(Flashlight flashlight) {
        System.out.print("где" + " ожидал найти " + flashlight.name);
    }
    private void finallySee(Flashlight flashlight) {
        System.out.print("Наконец " + this.louis.name + " увидел " + flashlight.name);
    }
    public void eighthAction(Flashlight flashlight, Button button) {
        this.grab(flashlight);
        System.out.print(" и ");
        this.press(button);
        System.out.print(", ");
        this.trying();
        System.out.print(", ");
        this.didntBreak(flashlight);
        System.out.println(".");
    }
    private void didntBreak(Flashlight flashlight) {
        System.out.print("не сломался ли " + flashlight.name);
    }
    private void trying() {
        System.out.print("пробуя");
    }
    private void press(Button button) {
        System.out.print(button.press());
    }
    private void grab(Flashlight flashlight) {
        this.louis.give(flashlight);
        System.out.print(this.louis.name + " схватил " + flashlight.name);
    }
    public void ninthAction(Item leaf, Flashlight beam, Flashlight flashlight) {
        this.flew(beam);
        System.out.print(" и ");
        this.getLost(leaf,flashlight);
        System.out.println(".");
    }
    private void getLost(Item leaf, Flashlight flashlight) {
        flashlight.location.setLocation(leaf);
        System.out.print("пропал среди " + leaf.name);
    }
    private void flew(Flashlight beam) {
        System.out.print(beam.adjective + " " + beam.name + " метнулся");
    }
    public void tenthAction(Button button) {
        System.out.println(this.louis.name + " " + button.press() + ".");
    }
    public void eleventhAction() {
        System.out.println("Все было в порядке.");
        System.out.println();
    }
    public void twelvethAction(Item knife, Item strips, Item picks, Item tools){
        this.cut(knife, strips, picks);
        System.out.print(" и ");
        this.took(tools);
        System.out.println(".");
    }
    private void took(Item tools) {
        System.out.print("взял " + tools.name);
    }
    private void cut(Item knife, Item strips, Item picks) {
        System.out.print(this.louis.name + " " + knife.name + " отрезал " + strips.adjective + " " + strips.name + " c " + picks.name);
    }
    public void thirteenthAction(Item tree){
        this.come(tree);
        System.out.print(", ");
        this.lookedAround();
        System.out.println(".");
    }
    private void lookedAround() {
        System.out.print(this.louis.name + " внимательно оглядел " + Places.MansonStreet.getPlace());
    }
    private void come(Item tree) {
        System.out.print("Подойдя к " + tree.name);
    }
    public void fourteenthAction(){
        System.out.println(Places.Street.getPlace() + " в этот " + this.louis.findTime(this.louis.times, "час").getTime() + " была совершенно пустой" + ".");
    }
    public void fifteenthAction(Item lightInWindow){
        System.out.println(this.louis.name + " видел один " + lightInWindow.name + " под самой " + Places.roof.getPlace() + ".");
    }
    public void sixteenthAction(Character invalid, Character human){
        System.out.println("Наверное " + invalid.name + " или " + human.name + " " + human.adjective +".");
        System.out.println();
    }
    public void seventeenthAction(){
        System.out.println(this.louis.name + " быстро вышел на " + Places.Streets.getPlace() + ".");
    }
    public void eighteenthAction(Light newlight){
        System.out.println("После темноты " + Places.Mount.getPlace() + " " + newlight.adjective + " " + newlight.name + " пробудило " + this.louis.findByNameSense(this.louis.sense, "ощущение опасности").getFeel() + ".");
    }
    public void nineteenthAction(Item pick, Item shovels, Item flashlight){
        this.stand();
        System.out.print(", ");
        this.held(pick, shovels, (Flashlight) flashlight);
        System.out.println(".");
    }
    private void held(Item pick, Item shovels, Flashlight flashlight) {
        System.out.print("зажав в " + this.louis.findByNameBodyParts(this.louis.bodyParts, "руках").getBodyPart() + " " + pick.name + ", " + shovels.name + " и " + flashlight.name);
    }
    private void stand() {
        System.out.print(this.louis.name + " стоял у " + Places.MountBangor.getPlace());
    }
    public void twentiethAction(Character someone){
        this.see(someone);
        System.out.print(", ");
        this.allGone();
        System.out.println(".");
        System.out.println();
    }
    private void allGone() {
        System.out.print("все пропало");
    }
    private void see(Character someone) {
        System.out.print("Если " + someone.name + " увидит " + this.louis.name + " " + this.louis.findTime(this.louis.times, "сейчас").getTime());
    }
    public void twentyFirstAction(Item sole, Item asphalt){
        this.hurry();
        System.out.print(", ");
        this.cross();
        System.out.print(", ");
        this.keptBeating(sole, asphalt);
        System.out.println(".");
    }
    private void keptBeating(Item sole, Item asphalt) {
        System.out.print("стуча " + sole.name + " об " + asphalt.name);
    }
    private void cross() {
        System.out.print("пересек " + Places.Streets.getPlace());
    }
    private void hurry() {
        System.out.print(this.louis.name + " спеша");
    }
    public void twentySecondAction(Item car){
        this.louis.location.x = 15;
        car.location.x = 65;
        System.out.println(car.adjective + " был от " + this.louis.name + " в " + this.louis.location.getDistance(car) + " " + Measures.yards.getMeasure() + ".");
    }
    public void twentyThirdAction(Item car){
        this.louis.location.x = 15;
        car.location.x = 20;
        System.out.println(this.louis.name + " " + Measures.yard.getMeasure() +   " казались " + this.louis.location.getDistance(car) + " " + Measures.miles.getMeasure() + ".");
    }
    public void twentyFourthAction(Item noise, Item cars, Item sound, Item steps, Item creak, Item window){
        this.go();
        System.out.print(", ");
        this.waiting(noise, cars, sound, steps, creak, window);
        System.out.println(".");
        System.out.println();
    }
    private void waiting(Item noise, Item cars, Item sound, Item steps, Item creak, Item window) {
        System.out.print("ожидая " + noise.name + " " + cars.adjective + " " + cars.name + ", " + sound.name + " " + steps.adjective + " " + steps.name + ", " + creak.name + " " + window.adjective + " " + window.name);
    }
    private void go() {
        System.out.print(this.louis.findByNameSense(this.louis.sense, "Весь в поту").getFeel() + " " + this.louis.name + " подошел");
    }
    public void twentyFifthAction(Item car, Item pick, Item shovels, Item keys){
        this.came(car);
        System.out.print(", ");
        this.putDown(pick, shovels);
        System.out.print(" и ");
        this.reached(keys);
        System.out.println(".");
    }
    private void reached(Item keys) {
        System.out.print("полез искать " + keys.name);
    }
    private void putDown(Item pick, Item shovels) {
        System.out.print(this.louis.name + " положил " + pick.name + " и " + shovels.name);
    }
    private void came(Item car) {
        System.out.print("Подойдя к " + car.name);
    }
    public void twentySixthAction(Item keys, Item pocket){
        System.out.println(keys.name + " не лежали в " + pocket.name + ".");
    }
    public void twentySeventhAction(){
        System.out.println(this.louis.name + " еще сильнее вспотел" + ".");
    }
    public void twentyEighthAction(){
        this.beatsAgain();
        System.out.print(", а");
        this.clench();
        System.out.print(", чтобы");
        this.DontLet();
        System.out.println(".");
        System.out.println();
    }
    private void DontLet() {
        System.out.print("не дать " + this.louis.findByNameSense(this.louis.sense, "панике").getFeel() + " прорваться наружу");
    }
    private void clench() {
        System.out.print(this.louis.findByNameBodyParts(this.louis.bodyParts, "зубы")+ " сжались");
    }
    private void beatsAgain() {
        System.out.print(this.louis.findByNameBodyParts(this.louis.bodyParts, "Сердце").getBodyPart() + " вновь забилось учащенно");
    }
    public void twentyNinth(Item keys){
        this.lost(keys);
        System.out.print(", ");
        this.drop();
        System.out.print(", ");
        this.GoingDown();
        System.out.print(" или ");
        this.climb();
        System.out.println(".");
    }
    private void climb() {
        System.out.print("карабкаясь на " + Places.hill.getPlace());
    }
    private void GoingDown() {
        System.out.print("спускаясь в " + Places.grave.getPlace());
    }
    private void drop() {
        System.out.print("выронил");
    }
    private void lost(Item keys) {
        System.out.print(this.louis.name + " " + keys.name + " потерял");
    }
    public void thirtieth(Item keys, Item grass, Flashlight flashlight){
        this.laid(keys, grass);
        System.out.print(", если ");
        this.canNotFind(flashlight);
        System.out.print(", то как ");
        this.hopeToFind(keys);
        System.out.println();
    }
    private void hopeToFind(Item keys) {
        System.out.print(this.louis.name + " может надеятся отыскать " + keys.name);
    }

    private void canNotFind(Flashlight flashlight) {
        System.out.print(this.louis.name + " " + this.louis.findTime(this.louis.times, "так долго").getTime() + " не мог найти " + flashlight.name);
    }
    private void laid(Item keys, Item grass) {
        System.out.print(keys.name + " лежали в " + grass.name);
    }
    public void thirtyFirstAction(){
        System.out.println("Это конец.");
    }
    public void thirtySecondAction(Item mistake){
        System.out.println("Одна " + mistake.name + " и все кончено.");
    }
}