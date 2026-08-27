public record xe(xg a, boolean b) {
   public xe a() {
      return this.b ? new xe(this.a, false) : this;
   }

   public xg b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
