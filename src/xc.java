public record xc(xe a, boolean b) {
   public xc a() {
      return this.b ? new xc(this.a, false) : this;
   }

   public xe b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
