public class hma extends hmd {
   private final wp a;
   private fqj b = fqj.a;
   private final fvi c;
   private int C;

   public hma(fvi $$0, wp $$1, wp $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aR_() {
      this.m.af().i();
      this.b = fqj.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(fpq.a(wo.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public wp i() {
      return wp.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aO_() {
      fmg.Q().a(this.c);
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
