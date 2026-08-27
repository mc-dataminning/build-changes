public record to(tq a, boolean b) {
   public to a() {
      return this.b ? new to(this.a, false) : this;
   }

   public tq b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
