public class gnc extends gni {
   private static final int a = 3;
   private final bwf b;
   private final bwf D;
   private int E;
   private final gwf F;
   private double G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;

   public gnc(gwf $$0, gjz $$1, bwf $$2, bwf $$3) {
      this($$0, $$1, $$2, $$3, $$2.dy());
   }

   private gnc(gwf $$0, gjz $$1, bwf $$2, bwf $$3, feq $$4) {
      super($$1, $$2.dA(), $$2.dC(), $$2.dG(), $$4.d, $$4.e, $$4.f);
      this.b = this.a($$2);
      this.D = $$3;
      this.F = $$0;
      this.c();
      this.d();
   }

   private bwf a(bwf $$0) {
      return (bwf)(!($$0 instanceof cnh) ? $$0 : ((cnh)$$0).v());
   }

   @Override
   public gnm b() {
      return gnm.d;
   }

   @Override
   public void a(fjj $$0, gqa $$1, fog $$2, float $$3) {
      float $$4 = ((float)this.E + $$3) / 3.0F;
      $$4 *= $$4;
      double $$5 = azm.d((double)$$3, this.J, this.G);
      double $$6 = azm.d((double)$$3, this.K, this.H);
      double $$7 = azm.d((double)$$3, this.L, this.I);
      double $$8 = azm.d((double)$$4, this.b.dA(), $$5);
      double $$9 = azm.d((double)$$4, this.b.dC(), $$6);
      double $$10 = azm.d((double)$$4, this.b.dG(), $$7);
      feq $$11 = $$2.b();
      this.F.a(this.b, $$8 - $$11.a(), $$9 - $$11.b(), $$10 - $$11.c(), $$3, new fjj(), $$1, this.F.a(this.b, $$3));
   }

   @Override
   public void a(fjn $$0, fog $$1, float $$2) {
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
