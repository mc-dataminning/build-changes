public class gjc extends gji {
   private static final int a = 3;
   private final bum b;
   private final bum D;
   private int E;
   private final gsd F;
   private double G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;

   public gjc(gsd $$0, gga $$1, bum $$2, bum $$3) {
      this($$0, $$1, $$2, $$3, $$2.dy());
   }

   private gjc(gsd $$0, gga $$1, bum $$2, bum $$3, fbb $$4) {
      super($$1, $$2.dA(), $$2.dC(), $$2.dG(), $$4.d, $$4.e, $$4.f);
      this.b = this.a($$2);
      this.D = $$3;
      this.F = $$0;
      this.c();
      this.d();
   }

   private bum a(bum $$0) {
      return (bum)(!($$0 instanceof cld) ? $$0 : ((cld)$$0).z());
   }

   @Override
   public gjm b() {
      return gjm.d;
   }

   @Override
   public void a(ffv $$0, glz $$1, fks $$2, float $$3) {
      float $$4 = ((float)this.E + $$3) / 3.0F;
      $$4 *= $$4;
      double $$5 = ayz.d((double)$$3, this.J, this.G);
      double $$6 = ayz.d((double)$$3, this.K, this.H);
      double $$7 = ayz.d((double)$$3, this.L, this.I);
      double $$8 = ayz.d((double)$$4, this.b.dA(), $$5);
      double $$9 = ayz.d((double)$$4, this.b.dC(), $$6);
      double $$10 = ayz.d((double)$$4, this.b.dG(), $$7);
      fbb $$11 = $$2.b();
      this.F.a(this.b, $$8 - $$11.a(), $$9 - $$11.b(), $$10 - $$11.c(), $$3, new ffv(), $$1, this.F.a(this.b, $$3));
   }

   @Override
   public void a(ffz $$0, fks $$1, float $$2) {
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
