public class gfj extends gfp {
   private static final int a = 3;
   private final gip b;
   private final bue D;
   private final bue E;
   private int F;
   private final goi G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gfj(goi $$0, gip $$1, gci $$2, bue $$3, bue $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dA());
   }

   private gfj(goi $$0, gip $$1, gci $$2, bue $$3, bue $$4, ezn $$5) {
      super($$2, $$3.dC(), $$3.dE(), $$3.dI(), $$5.d, $$5.e, $$5.f);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bue a(bue $$0) {
      return (bue)(!($$0 instanceof ckv) ? $$0 : ((ckv)$$0).A());
   }

   @Override
   public gft b() {
      return gft.d;
   }

   @Override
   public void a(fef $$0, fir $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = azk.d((double)$$2, this.K, this.H);
      double $$5 = azk.d((double)$$2, this.L, this.I);
      double $$6 = azk.d((double)$$2, this.M, this.J);
      double $$7 = azk.d((double)$$3, this.D.dC(), $$4);
      double $$8 = azk.d((double)$$3, this.D.dE(), $$5);
      double $$9 = azk.d((double)$$3, this.D.dI(), $$6);
      gih.a $$10 = this.b.c();
      ezn $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), $$2, new feb(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dC();
      this.I = (this.E.dE() + this.E.dG()) / 2.0;
      this.J = this.E.dI();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
