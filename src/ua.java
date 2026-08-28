public record ua(int a, boolean b) {
   private static final ua c = new ua(1, true);

   public static ua a() {
      return c;
   }

   public boolean b() {
      return this.a < 1;
   }

   public boolean a(int $$0, int $$1) {
      boolean $$2 = $$0 != $$1;
      boolean $$3 = this.b() || $$0 < this.a;
      return $$3 && (!$$2 || !this.b);
   }

   public boolean c() {
      return this.a != 1;
   }

   public int d() {
      return this.a;
   }

   public boolean e() {
      return this.b;
   }
}
