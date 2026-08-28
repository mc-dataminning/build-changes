public class gbn extends gbt {
   private static final int a = 3;
   private final gel b;
   private final bsh D;
   private final bsh E;
   private int F;
   private final gjm G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gbn(gjm $$0, gel $$1, fyl $$2, bsh $$3, bsh $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.du());
   }

   private gbn(gjm $$0, gel $$1, fyl $$2, bsh $$3, bsh $$4, ewh $$5) {
      super($$2, $$3.dw(), $$3.dy(), $$3.dC(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bsh a(bsh $$0) {
      return (bsh)(!($$0 instanceof civ) ? $$0 : ((civ)$$0).C());
   }

   @Override
   public gbx b() {
      return gbx.e;
   }

   @Override
   public void a(fas $$0, ffg $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = ayg.d((double)$$2, this.K, this.H);
      double $$5 = ayg.d((double)$$2, this.L, this.I);
      double $$6 = ayg.d((double)$$2, this.M, this.J);
      double $$7 = ayg.d((double)$$3, this.D.dw(), $$4);
      double $$8 = ayg.d((double)$$3, this.D.dy(), $$5);
      double $$9 = ayg.d((double)$$3, this.D.dC(), $$6);
      gef.a $$10 = this.b.c();
      ewh $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dH(), $$2, new fao(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dw();
      this.I = (this.E.dy() + this.E.dA()) / 2.0;
      this.J = this.E.dC();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
