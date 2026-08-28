public record xq(xs a, boolean b) {
   public xq a() {
      return this.b ? new xq(this.a, false) : this;
   }

   public xs b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
