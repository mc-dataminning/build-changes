public class fxg extends fyn {
   private static final int a = 90;
   private final wy b;
   private fto c = fto.a;
   private final Runnable d;
   private final wy s;
   private final boolean u;

   public fxg(Runnable $$0, wy $$1, wy $$2) {
      this($$0, $$1, $$2, wx.k, true);
   }

   public fxg(Runnable $$0, wy $$1, wy $$2, wy $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), this.b);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.c = fto.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = azm.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(fsv.a(this.s, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aD_() {
      return this.u;
   }
}
