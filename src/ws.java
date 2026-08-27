public record ws(wu a, boolean b) {
   public ws a() {
      return this.b ? new ws(this.a, false) : this;
   }

   public wu b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
