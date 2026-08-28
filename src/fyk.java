public class fyk {
   private final fym a;
   private final fyl b;

   private fyk(fym $$0, fyl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fye a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fyk a(fym $$0, int $$1, int $$2) {
      return new fyk($$0, new fyl($$1, $$2));
   }
}
