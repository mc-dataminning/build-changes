public record xi(xk a, boolean b) {
   public xi a() {
      return this.b ? new xi(this.a, false) : this;
   }

   public xk b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
