public class hhp extends hhs {
   private final xk a;
   private fos b = fos.a;
   private final ftr c;
   private int C;

   public hhp(ftr $$0, xk $$1, xk $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aT_() {
      this.m.af().i();
      this.b = fos.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(fny.a(xj.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public xk i() {
      return xk.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aP_() {
      flz.Q().a(this.c);
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
