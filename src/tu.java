public record tu(tw a, boolean b) {
   public tu a() {
      return this.b ? new tu(this.a, false) : this;
   }

   public tw b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
