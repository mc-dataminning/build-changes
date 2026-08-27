public class fym extends fys {
   private static final int a = 3;
   private final gbk b;
   private final bql D;
   private final bql E;
   private int F;
   private final ggl G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public fym(ggl $$0, gbk $$1, fvm $$2, bql $$3, bql $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dq());
   }

   private fym(ggl $$0, gbk $$1, fvm $$2, bql $$3, bql $$4, etf $$5) {
      super($$2, $$3.ds(), $$3.du(), $$3.dy(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bql a(bql $$0) {
      return (bql)(!($$0 instanceof cgv) ? $$0 : ((cgv)$$0).C());
   }

   @Override
   public fyw b() {
      return fyw.e;
   }

   @Override
   public void a(exr $$0, fcf $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = axw.d((double)$$2, this.K, this.H);
      double $$5 = axw.d((double)$$2, this.L, this.I);
      double $$6 = axw.d((double)$$2, this.M, this.J);
      double $$7 = axw.d((double)$$3, this.D.ds(), $$4);
      double $$8 = axw.d((double)$$3, this.D.du(), $$5);
      double $$9 = axw.d((double)$$3, this.D.dy(), $$6);
      gbe.a $$10 = this.b.c();
      etf $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dD(), $$2, new exn(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.ds();
      this.I = (this.E.du() + this.E.dw()) / 2.0;
      this.J = this.E.dy();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
