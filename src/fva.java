public class fva extends fvg {
   private static final int a = 3;
   private final fxy b;
   private final box D;
   private final box E;
   private int F;
   private final gcz G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public fva(gcz $$0, fxy $$1, fsa $$2, box $$3, box $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dp());
   }

   private fva(gcz $$0, fxy $$1, fsa $$2, box $$3, box $$4, ept $$5) {
      super($$2, $$3.dr(), $$3.dt(), $$3.dx(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private box a(box $$0) {
      return (box)(!($$0 instanceof cfe) ? $$0 : ((cfe)$$0).C());
   }

   @Override
   public fvk b() {
      return fvk.e;
   }

   @Override
   public void a(euf $$0, eyt $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = aww.d((double)$$2, this.K, this.H);
      double $$5 = aww.d((double)$$2, this.L, this.I);
      double $$6 = aww.d((double)$$2, this.M, this.J);
      double $$7 = aww.d((double)$$3, this.D.dr(), $$4);
      double $$8 = aww.d((double)$$3, this.D.dt(), $$5);
      double $$9 = aww.d((double)$$3, this.D.dx(), $$6);
      fxs.a $$10 = this.b.c();
      ept $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dC(), $$2, new eub(), $$10, this.G.a(this.D, $$2));
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
