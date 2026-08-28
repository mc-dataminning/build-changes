public class gim extends gis {
   private static final int a = 3;
   private final glt b;
   private final bvk D;
   private final bvk E;
   private int F;
   private final gro G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gim(gro $$0, glt $$1, gfk $$2, bvk $$3, bvk $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dz());
   }

   private gim(gro $$0, glt $$1, gfk $$2, bvk $$3, bvk $$4, fby $$5) {
      super($$2, $$3.dB(), $$3.dD(), $$3.dH(), $$5.d, $$5.e, $$5.f);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bvk a(bvk $$0) {
      return (bvk)(!($$0 instanceof cmb) ? $$0 : ((cmb)$$0).z());
   }

   @Override
   public giw b() {
      return giw.d;
   }

   @Override
   public void a(fgw $$0, flp $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = bae.d((double)$$2, this.K, this.H);
      double $$5 = bae.d((double)$$2, this.L, this.I);
      double $$6 = bae.d((double)$$2, this.M, this.J);
      double $$7 = bae.d((double)$$3, this.D.dB(), $$4);
      double $$8 = bae.d((double)$$3, this.D.dD(), $$5);
      double $$9 = bae.d((double)$$3, this.D.dH(), $$6);
      gll.a $$10 = this.b.c();
      fby $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), $$2, new fgs(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dB();
      this.I = (this.E.dD() + this.E.dF()) / 2.0;
      this.J = this.E.dH();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
