public record tn(tp a, boolean b) {
   public tn a() {
      return this.b ? new tn(this.a, false) : this;
   }

   public tp b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
