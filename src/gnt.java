public class gnt extends gnz {
   private static final int a = 3;
   private final bwi b;
   private final bwi D;
   private int E;
   private final gww F;
   private double G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;

   public gnt(gww $$0, gkq $$1, bwi $$2, bwi $$3) {
      this($$0, $$1, $$2, $$3, $$2.dx());
   }

   private gnt(gww $$0, gkq $$1, bwi $$2, bwi $$3, ffc $$4) {
      super($$1, $$2.dz(), $$2.dB(), $$2.dF(), $$4.d, $$4.e, $$4.f);
      this.b = this.a($$2);
      this.D = $$3;
      this.F = $$0;
      this.c();
      this.d();
   }

   private bwi a(bwi $$0) {
      return (bwi)(!($$0 instanceof cnr) ? $$0 : ((cnr)$$0).v());
   }

   @Override
   public god b() {
      return god.d;
   }

   @Override
   public void a(fkd $$0, gqr $$1, fpb $$2, float $$3) {
      float $$4 = ((float)this.E + $$3) / 3.0F;
      $$4 *= $$4;
      double $$5 = azm.d((double)$$3, this.J, this.G);
      double $$6 = azm.d((double)$$3, this.K, this.H);
      double $$7 = azm.d((double)$$3, this.L, this.I);
      double $$8 = azm.d((double)$$4, this.b.dz(), $$5);
      double $$9 = azm.d((double)$$4, this.b.dB(), $$6);
      double $$10 = azm.d((double)$$4, this.b.dF(), $$7);
      ffc $$11 = $$2.b();
      this.F.a(this.b, $$8 - $$11.a(), $$9 - $$11.b(), $$10 - $$11.c(), $$3, new fkd(), $$1, this.F.a(this.b, $$3));
   }

   @Override
   public void a(fkh $$0, fpb $$1, float $$2) {
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
      this.G = this.D.dz();
      this.H = (this.D.dB() + this.D.dD()) / 2.0;
      this.I = this.D.dF();
   }

   private void d() {
      this.J = this.G;
      this.K = this.H;
      this.L = this.I;
   }
}
