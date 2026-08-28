public class gwm extends gwq {
   private final wz a;
   private fjf b = fjf.a;
   private final fod c;
   private int B;

   public gwm(fod $$0, wz $$1, wz $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aT_() {
      this.l.ae().i();
      this.b = fjf.a(this.o, this.a, this.m - 50);
      this.B = this.b.a() * 9;
      this.c(fim.a(wy.k, $$0 -> this.l.a(this.c)).a(this.m / 2 - 100, this.n / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public wz i() {
      return wz.i().b(this.k).f(": ").b(this.a);
   }

   @Override
   public void d() {
      fgo.Q().a(this.c);
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, this.n / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.m / 2, this.n / 2 - this.B / 2);
   }
}
