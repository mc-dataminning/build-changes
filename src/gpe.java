public class gpe extends gpk {
   private static final int a = 3;
   private final bwt b;
   private final bwt D;
   private int E;
   private final gyg F;
   private double G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;

   public gpe(gyg $$0, gmb $$1, bwt $$2, bwt $$3) {
      this($$0, $$1, $$2, $$3, $$2.dy());
   }

   private gpe(gyg $$0, gmb $$1, bwt $$2, bwt $$3, ffq $$4) {
      super($$1, $$2.dA(), $$2.dC(), $$2.dG(), $$4.d, $$4.e, $$4.f);
      this.b = this.a($$2);
      this.D = $$3;
      this.F = $$0;
      this.c();
      this.d();
   }

   private bwt a(bwt $$0) {
      return (bwt)(!($$0 instanceof coc) ? $$0 : ((coc)$$0).v());
   }

   @Override
   public gpo b() {
      return gpo.d;
   }

   @Override
   public void a(flo $$0, gsa $$1, fql $$2, float $$3) {
      float $$4 = ((float)this.E + $$3) / 3.0F;
      $$4 *= $$4;
      double $$5 = azo.d((double)$$3, this.J, this.G);
      double $$6 = azo.d((double)$$3, this.K, this.H);
      double $$7 = azo.d((double)$$3, this.L, this.I);
      double $$8 = azo.d((double)$$4, this.b.dA(), $$5);
      double $$9 = azo.d((double)$$4, this.b.dC(), $$6);
      double $$10 = azo.d((double)$$4, this.b.dG(), $$7);
      ffq $$11 = $$2.b();
      this.F.a(this.b, $$8 - $$11.a(), $$9 - $$11.b(), $$10 - $$11.c(), $$3, new flo(), $$1, this.F.a(this.b, $$3));
   }

   @Override
   public void a(flr $$0, fql $$1, float $$2) {
   }

   @Override
   public void a() {
      this.E++;
      if (this.E == 3) {
         this.k();
      }

      this.d();
      this.c();
   }

   private void c() {
      this.G = this.D.dA();
      this.H = (this.D.dC() + this.D.dE()) / 2.0;
      this.I = this.D.dG();
   }

   private void d() {
      this.J = this.G;
      this.K = this.H;
      this.L = this.I;
   }
}
