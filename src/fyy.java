public class fyy extends gaf {
   private static final int a = 90;
   private final xc b;
   private fvg c = fvg.a;
   private final Runnable d;
   private final xc s;
   private final boolean u;

   public fyy(Runnable $$0, xc $$1, xc $$2) {
      this($$0, $$1, $$2, xb.k, true);
   }

   public fyy(Runnable $$0, xc $$1, xc $$2, xc $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public xc i() {
      return xb.a(super.i(), this.b);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.c = fvg.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = azq.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(fun.a(this.s, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aH_() {
      return this.u;
   }
}
