public class hrj extends hrm {
   private final xa a;
   private fve b = fve.a;
   private final gad c;
   private int C;

   public hrj(gad $$0, xa $$1, xa $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aS_() {
      this.m.af().i();
      this.b = fve.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(ful.a(wz.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public xa i() {
      return xa.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aP_() {
      frd.Q().a(this.c);
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
