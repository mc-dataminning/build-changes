public record xz(yb a, boolean b) {
   public xz a() {
      return this.b ? new xz(this.a, false) : this;
   }

   public yb b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
