public record xk(xm a, boolean b) {
   public xk a() {
      return this.b ? new xk(this.a, false) : this;
   }

   public xm b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
