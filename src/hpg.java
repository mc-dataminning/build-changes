public class hpg extends hpj {
   private final wy a;
   private ftc b = ftc.a;
   private final fyb c;
   private int C;

   public hpg(fyb $$0, wy $$1, wy $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aO_() {
      this.m.af().i();
      this.b = ftc.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(fsj.a(wx.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public wy i() {
      return wy.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aL_() {
      foz.Q().a(this.c);
   }

   @Override
   public void a(frv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
