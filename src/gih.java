public class gih extends gin {
   private static final int a = 3;
   private final bvb b;
   private final bvb D;
   private int E;
   private final grj F;
   private double G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;

   public gih(grj $$0, gff $$1, bvb $$2, bvb $$3) {
      this($$0, $$1, $$2, $$3, $$2.dz());
   }

   private gih(grj $$0, gff $$1, bvb $$2, bvb $$3, fbr $$4) {
      super($$1, $$2.dB(), $$2.dD(), $$2.dH(), $$4.d, $$4.e, $$4.f);
      this.b = this.a($$2);
      this.D = $$3;
      this.F = $$0;
      this.c();
      this.d();
   }

   private bvb a(bvb $$0) {
      return (bvb)(!($$0 instanceof cls) ? $$0 : ((cls)$$0).z());
   }

   @Override
   public gir b() {
      return gir.d;
   }

   @Override
   public void a(fgl $$0, glg $$1, fli $$2, float $$3) {
      float $$4 = ((float)this.E + $$3) / 3.0F;
      $$4 *= $$4;
      double $$5 = azu.d((double)$$3, this.J, this.G);
      double $$6 = azu.d((double)$$3, this.K, this.H);
      double $$7 = azu.d((double)$$3, this.L, this.I);
      double $$8 = azu.d((double)$$4, this.b.dB(), $$5);
      double $$9 = azu.d((double)$$4, this.b.dD(), $$6);
      double $$10 = azu.d((double)$$4, this.b.dH(), $$7);
      fbr $$11 = $$2.b();
      this.F.a(this.b, $$8 - $$11.a(), $$9 - $$11.b(), $$10 - $$11.c(), $$3, new fgl(), $$1, this.F.a(this.b, $$3));
   }

   @Override
   public void a(fgp $$0, fli $$1, float $$2) {
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
      this.G = this.D.dB();
      this.H = (this.D.dD() + this.D.dF()) / 2.0;
      this.I = this.D.dH();
   }

   private void d() {
      this.J = this.G;
      this.K = this.H;
      this.L = this.I;
   }
}
