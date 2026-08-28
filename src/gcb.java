public class gcb extends gch {
   private static final int a = 3;
   private final gez b;
   private final bsq D;
   private final bsq E;
   private int F;
   private final gkb G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gcb(gkb $$0, gez $$1, fyz $$2, bsq $$3, bsq $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dt());
   }

   private gcb(gkb $$0, gez $$1, fyz $$2, bsq $$3, bsq $$4, eww $$5) {
      super($$2, $$3.dv(), $$3.dx(), $$3.dB(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bsq a(bsq $$0) {
      return (bsq)(!($$0 instanceof cjf) ? $$0 : ((cjf)$$0).C());
   }

   @Override
   public gcl b() {
      return gcl.e;
   }

   @Override
   public void a(fbg $$0, ffs $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = ayn.d((double)$$2, this.K, this.H);
      double $$5 = ayn.d((double)$$2, this.L, this.I);
      double $$6 = ayn.d((double)$$2, this.M, this.J);
      double $$7 = ayn.d((double)$$3, this.D.dv(), $$4);
      double $$8 = ayn.d((double)$$3, this.D.dx(), $$5);
      double $$9 = ayn.d((double)$$3, this.D.dB(), $$6);
      get.a $$10 = this.b.c();
      eww $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dG(), $$2, new fbc(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dv();
      this.I = (this.E.dx() + this.E.dz()) / 2.0;
      this.J = this.E.dB();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
