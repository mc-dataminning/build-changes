public class hrl extends hro {
   private final xc a;
   private fvg b = fvg.a;
   private final gaf c;
   private int C;

   public hrl(gaf $$0, xc $$1, xc $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aS_() {
      this.m.af().i();
      this.b = fvg.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(fun.a(xb.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public xc i() {
      return xc.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aP_() {
      frf.Q().a(this.c);
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
