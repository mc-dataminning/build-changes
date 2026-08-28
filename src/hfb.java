public class hfb extends hff {
   private final xl a;
   private fmp b = fmp.a;
   private final frp c;
   private int B;

   public hfb(frp $$0, xl $$1, xl $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aS_() {
      this.m.af().i();
      this.b = fmp.a(this.p, this.a, this.n - 50);
      this.B = this.b.a() * 9;
      this.c(flw.a(xk.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public xl i() {
      return xl.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aP_() {
      fjx.Q().a(this.c);
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.B / 2);
   }
}
