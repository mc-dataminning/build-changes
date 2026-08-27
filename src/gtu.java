public class gtu extends gty {
   private final wx a;
   private fgs b = fgs.a;
   private final fly c;
   private int B;

   public gtu(fly $$0, wx $$1, wx $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aM_() {
      this.m.ae().i();
      this.b = fgs.a(this.p, this.a, this.n - 50);
      this.B = this.b.a() * 9;
      this.c(ffz.a(ww.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public wx i() {
      return wx.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void d() {
      fdz.Q().a(this.c);
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.B / 2);
   }
}
