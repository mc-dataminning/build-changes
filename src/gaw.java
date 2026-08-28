public class gaw extends gbc {
   private static final int a = 3;
   private final gdu b;
   private final bsu D;
   private final bsu E;
   private int F;
   private final giv G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gaw(giv $$0, gdu $$1, fxv $$2, bsu $$3, bsu $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.ds());
   }

   private gaw(giv $$0, gdu $$1, fxv $$2, bsu $$3, bsu $$4, evr $$5) {
      super($$2, $$3.du(), $$3.dw(), $$3.dA(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bsu a(bsu $$0) {
      return (bsu)(!($$0 instanceof cjh) ? $$0 : ((cjh)$$0).C());
   }

   @Override
   public gbg b() {
      return gbg.e;
   }

   @Override
   public void a(fac $$0, feq $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = ayz.d((double)$$2, this.K, this.H);
      double $$5 = ayz.d((double)$$2, this.L, this.I);
      double $$6 = ayz.d((double)$$2, this.M, this.J);
      double $$7 = ayz.d((double)$$3, this.D.du(), $$4);
      double $$8 = ayz.d((double)$$3, this.D.dw(), $$5);
      double $$9 = ayz.d((double)$$3, this.D.dA(), $$6);
      gdo.a $$10 = this.b.c();
      evr $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dF(), $$2, new ezy(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.du();
      this.I = (this.E.dw() + this.E.dy()) / 2.0;
      this.J = this.E.dA();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
