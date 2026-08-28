public class gpg extends gpm {
   private static final int a = 3;
   private final bwv b;
   private final bwv D;
   private int E;
   private final gyi F;
   private double G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;

   public gpg(gyi $$0, gmd $$1, bwv $$2, bwv $$3) {
      this($$0, $$1, $$2, $$3, $$2.dy());
   }

   private gpg(gyi $$0, gmd $$1, bwv $$2, bwv $$3, ffs $$4) {
      super($$1, $$2.dA(), $$2.dC(), $$2.dG(), $$4.d, $$4.e, $$4.f);
      this.b = this.a($$2);
      this.D = $$3;
      this.F = $$0;
      this.c();
      this.d();
   }

   private bwv a(bwv $$0) {
      return (bwv)(!($$0 instanceof coe) ? $$0 : ((coe)$$0).v());
   }

   @Override
   public gpq b() {
      return gpq.d;
   }

   @Override
   public void a(flq $$0, gsc $$1, fqn $$2, float $$3) {
      float $$4 = ((float)this.E + $$3) / 3.0F;
      $$4 *= $$4;
      double $$5 = azq.d((double)$$3, this.J, this.G);
      double $$6 = azq.d((double)$$3, this.K, this.H);
      double $$7 = azq.d((double)$$3, this.L, this.I);
      double $$8 = azq.d((double)$$4, this.b.dA(), $$5);
      double $$9 = azq.d((double)$$4, this.b.dC(), $$6);
      double $$10 = azq.d((double)$$4, this.b.dG(), $$7);
      ffs $$11 = $$2.b();
      this.F.a(this.b, $$8 - $$11.a(), $$9 - $$11.b(), $$10 - $$11.c(), $$3, new flq(), $$1, this.F.a(this.b, $$3));
   }

   @Override
   public void a(flt $$0, fqn $$1, float $$2) {
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
