public class hqz extends hrc {
   private final xg a;
   private fur b = fur.a;
   private final fzq c;
   private int C;

   public hqz(fzq $$0, xg $$1, xg $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aO_() {
      this.m.af().i();
      this.b = fur.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(fty.a(xf.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public xg i() {
      return xg.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aL_() {
      fqq.Q().a(this.c);
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
