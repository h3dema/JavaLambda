class Trade {

  String status;
  String issuer;
  double q;
  
  Trade(String issuer, double q) { 
    this.status = "NEW";
    this.issuer = issuer;
    this.q = q;
  }
  
  Trade(String issuer, String status, double q) {
    this(issuer, q);
    this.status = status;
  }
  
  public String getStatus() { return status; }

  public String getIssuer() { return issuer; }

  public double getQuantity() { return q; }
}