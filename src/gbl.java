public class gbl extends gbr {
   private static final int a = 3;
   private final gej b;
   private final bsg D;
   private final bsg E;
   private int F;
   private final gjk G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gbl(gjk $$0, gej $$1, fyj $$2, bsg $$3, bsg $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dt());
   }

   private gbl(gjk $$0, gej $$1, fyj $$2, bsg $$3, bsg $$4, ewf $$5) {
      super($$2, $$3.dv(), $$3.dx(), $$3.dB(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bsg a(bsg $$0) {
      return (bsg)(!($$0 instanceof ciu) ? $$0 : ((ciu)$$0).C());
   }

   @Override
   public gbv b() {
      return gbv.e;
   }

   @Override
   public void a(faq $$0, ffe $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = ayg.d((double)$$2, this.K, this.H);
      double $$5 = ayg.d((double)$$2, this.L, this.I);
      double $$6 = ayg.d((double)$$2, this.M, this.J);
      double $$7 = ayg.d((double)$$3, this.D.dv(), $$4);
      double $$8 = ayg.d((double)$$3, this.D.dx(), $$5);
      double $$9 = ayg.d((double)$$3, this.D.dB(), $$6);
      ged.a $$10 = this.b.c();
      ewf $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dG(), $$2, new fam(), $$10, this.G.a(this.D, $$2));
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
