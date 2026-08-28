public record xv(xx a, boolean b) {
   public xv a() {
      return this.b ? new xv(this.a, false) : this;
   }

   public xx b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
