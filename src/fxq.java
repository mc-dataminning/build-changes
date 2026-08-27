public class fxq extends fxw {
   private static final int a = 3;
   private final gao b;
   private final bqa D;
   private final bqa E;
   private int F;
   private final gfp G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public fxq(gfp $$0, gao $$1, fuq $$2, bqa $$3, bqa $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dp());
   }

   private fxq(gfp $$0, gao $$1, fuq $$2, bqa $$3, bqa $$4, esj $$5) {
      super($$2, $$3.dr(), $$3.dt(), $$3.dx(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bqa a(bqa $$0) {
      return (bqa)(!($$0 instanceof cgk) ? $$0 : ((cgk)$$0).C());
   }

   @Override
   public fya b() {
      return fya.e;
   }

   @Override
   public void a(ewv $$0, fbj $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = axm.d((double)$$2, this.K, this.H);
      double $$5 = axm.d((double)$$2, this.L, this.I);
      double $$6 = axm.d((double)$$2, this.M, this.J);
      double $$7 = axm.d((double)$$3, this.D.dr(), $$4);
      double $$8 = axm.d((double)$$3, this.D.dt(), $$5);
      double $$9 = axm.d((double)$$3, this.D.dx(), $$6);
      gai.a $$10 = this.b.c();
      esj $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dC(), $$2, new ewr(), $$10, this.G.a(this.D, $$2));
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
