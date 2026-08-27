public record tf(th a, boolean b) {
   public tf a() {
      return this.b ? new tf(this.a, false) : this;
   }

   public th b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
