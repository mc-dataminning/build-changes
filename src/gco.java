public class gco extends gcu {
   private static final int a = 3;
   private final gfm b;
   private final brv D;
   private final brv E;
   private int F;
   private final gko G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gco(gko $$0, gfm $$1, fzn $$2, brv $$3, brv $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dx());
   }

   private gco(gko $$0, gfm $$1, fzn $$2, brv $$3, brv $$4, ewu $$5) {
      super($$2, $$3.dz(), $$3.dB(), $$3.dF(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private brv a(brv $$0) {
      return (brv)(!($$0 instanceof cig) ? $$0 : ((cig)$$0).C());
   }

   @Override
   public gcy b() {
      return gcy.e;
   }

   @Override
   public void a(fbg $$0, ffu $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = aym.d((double)$$2, this.K, this.H);
      double $$5 = aym.d((double)$$2, this.L, this.I);
      double $$6 = aym.d((double)$$2, this.M, this.J);
      double $$7 = aym.d((double)$$3, this.D.dz(), $$4);
      double $$8 = aym.d((double)$$3, this.D.dB(), $$5);
      double $$9 = aym.d((double)$$3, this.D.dF(), $$6);
      gfg.a $$10 = this.b.c();
      ewu $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dK(), $$2, new fbc(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dz();
      this.I = (this.E.dB() + this.E.dD()) / 2.0;
      this.J = this.E.dF();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
