public class fxh extends fxn {
   private static final int a = 3;
   private final gaf b;
   private final bpv D;
   private final bpv E;
   private int F;
   private final gfg G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public fxh(gfg $$0, gaf $$1, fuh $$2, bpv $$3, bpv $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dp());
   }

   private fxh(gfg $$0, gaf $$1, fuh $$2, bpv $$3, bpv $$4, esa $$5) {
      super($$2, $$3.dr(), $$3.dt(), $$3.dx(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bpv a(bpv $$0) {
      return (bpv)(!($$0 instanceof cgd) ? $$0 : ((cgd)$$0).C());
   }

   @Override
   public fxr b() {
      return fxr.e;
   }

   @Override
   public void a(ewm $$0, fba $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = axk.d((double)$$2, this.K, this.H);
      double $$5 = axk.d((double)$$2, this.L, this.I);
      double $$6 = axk.d((double)$$2, this.M, this.J);
      double $$7 = axk.d((double)$$3, this.D.dr(), $$4);
      double $$8 = axk.d((double)$$3, this.D.dt(), $$5);
      double $$9 = axk.d((double)$$3, this.D.dx(), $$6);
      fzz.a $$10 = this.b.c();
      esa $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dC(), $$2, new ewi(), $$10, this.G.a(this.D, $$2));
      $$10.b();
   }

   @Override
   public void a() {
      this.F++;
      if (this.F == 3) {
         this.k();
      }

      this.d();
      this.c();
   }

   private void c() {
      this.H = this.E.dr();
      this.I = (this.E.dt() + this.E.dv()) / 2.0;
      this.J = this.E.dx();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
