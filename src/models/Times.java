package models;

public enum Times {
    fewMinutes("Пару неприятных минут"), hour("час"), rightnow("сейчас"), soLong("так долго");
    final String callTimes;
    Times(String name){
        this.callTimes = name;
    }
    public String getTime(){
        return this.callTimes;
    }

}
