public class fwb extends fxi {
   private static final int a = 90;
   private final ww b;
   private fsj c = fsj.a;
   private final Runnable d;
   private final ww s;
   private final boolean u;

   public fwb(Runnable $$0, ww $$1, ww $$2) {
      this($$0, $$1, $$2, wv.k, true);
   }

   public fwb(Runnable $$0, ww $$1, ww $$2, ww $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public ww i() {
      return wv.a(super.i(), this.b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c = fsj.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = azk.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(frq.a(this.s, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aC_() {
      return this.u;
   }
}
