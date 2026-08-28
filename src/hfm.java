public class hfm extends hfq {
   private final xj a;
   private fmw b = fmw.a;
   private final frw c;
   private int B;

   public hfm(frw $$0, xj $$1, xj $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aR_() {
      this.m.af().i();
      this.b = fmw.a(this.p, this.a, this.n - 50);
      this.B = this.b.a() * 9;
      this.c(fmd.a(xi.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public xj i() {
      return xj.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aO_() {
      fke.Q().a(this.c);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.B / 2);
   }
}
