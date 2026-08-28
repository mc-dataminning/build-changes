public class gen extends get {
   private static final int a = 3;
   private final ght b;
   private final btr D;
   private final btr E;
   private int F;
   private final gnm G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gen(gnm $$0, ght $$1, gbm $$2, btr $$3, btr $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dv());
   }

   private gen(gnm $$0, ght $$1, gbm $$2, btr $$3, btr $$4, eyw $$5) {
      super($$2, $$3.dx(), $$3.dz(), $$3.dD(), $$5.d, $$5.e, $$5.f);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private btr a(btr $$0) {
      return (btr)(!($$0 instanceof ckh) ? $$0 : ((ckh)$$0).A());
   }

   @Override
   public gex b() {
      return gex.d;
   }

   @Override
   public void a(fdm $$0, fhy $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = azf.d((double)$$2, this.K, this.H);
      double $$5 = azf.d((double)$$2, this.L, this.I);
      double $$6 = azf.d((double)$$2, this.M, this.J);
      double $$7 = azf.d((double)$$3, this.D.dx(), $$4);
      double $$8 = azf.d((double)$$3, this.D.dz(), $$5);
      double $$9 = azf.d((double)$$3, this.D.dD(), $$6);
      ghl.a $$10 = this.b.c();
      eyw $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), $$2, new fdi(), $$10, this.G.a(this.D, $$2));
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
