public class gux extends gvb {
   private final xl a;
   private fhs b = fhs.a;
   private final fmy c;
   private int B;

   public gux(fmy $$0, xl $$1, xl $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aN_() {
      this.m.ae().i();
      this.b = fhs.a(this.p, this.a, this.n - 50);
      this.B = this.b.a() * 9;
      this.c(fgz.a(xk.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public xl i() {
      return xl.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void d() {
      ffa.Q().a(this.c);
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.B / 2);
   }
}
