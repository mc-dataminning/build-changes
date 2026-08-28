public class fyj extends fzq {
   private static final int a = 90;
   private final xg b;
   private fur c = fur.a;
   private final Runnable d;
   private final xg s;
   private final boolean u;

   public fyj(Runnable $$0, xg $$1, xg $$2) {
      this($$0, $$1, $$2, xf.k, true);
   }

   public fyj(Runnable $$0, xg $$1, xg $$2, xg $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public xg i() {
      return xf.a(super.i(), this.b);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.c = fur.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = azz.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(fty.a(this.s, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aI_() {
      return this.u;
   }
}
