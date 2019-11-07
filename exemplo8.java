class exemplo8 {
  
  public static void main(String[] args) {
    ITrade newTradeChecker = (Trade t) -> t.getStatus().equals("NEW");
    // 
    ITrade newTradeChecker2 = (t) -> t.getStatus().equals("NEW");
  }
}