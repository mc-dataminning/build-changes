public class hel extends hep {
   private final xi a;
   private fma b = fma.a;
   private final fra c;
   private int B;

   public hel(fra $$0, xi $$1, xi $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aR_() {
      this.m.af().i();
      this.b = fma.a(this.p, this.a, this.n - 50);
      this.B = this.b.a() * 9;
      this.c(flh.a(xh.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public xi i() {
      return xi.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void d() {
      fji.Q().a(this.c);
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.B / 2);
   }
}
