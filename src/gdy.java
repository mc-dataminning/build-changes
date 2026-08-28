public class gdy extends gee {
   private static final int a = 3;
   private final ghc b;
   private final btj D;
   private final btj E;
   private int F;
   private final gmq G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gdy(gmq $$0, ghc $$1, gax $$2, btj $$3, btj $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dv());
   }

   private gdy(gmq $$0, ghc $$1, gax $$2, btj $$3, btj $$4, eye $$5) {
      super($$2, $$3.dx(), $$3.dz(), $$3.dD(), $$5.d, $$5.e, $$5.f);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private btj a(btj $$0) {
      return (btj)(!($$0 instanceof cjz) ? $$0 : ((cjz)$$0).A());
   }

   @Override
   public gei b() {
      return gei.d;
   }

   @Override
   public void a(fcy $$0, fhk $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = azc.d((double)$$2, this.K, this.H);
      double $$5 = azc.d((double)$$2, this.L, this.I);
      double $$6 = azc.d((double)$$2, this.M, this.J);
      double $$7 = azc.d((double)$$3, this.D.dx(), $$4);
      double $$8 = azc.d((double)$$3, this.D.dz(), $$5);
      double $$9 = azc.d((double)$$3, this.D.dD(), $$6);
      ggv.a $$10 = this.b.c();
      eye $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), $$2, new fcu(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dx();
      this.I = (this.E.dz() + this.E.dB()) / 2.0;
      this.J = this.E.dD();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
