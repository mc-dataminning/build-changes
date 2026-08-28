public class gik extends giq {
   private static final int a = 3;
   private final glr b;
   private final bvj D;
   private final bvj E;
   private int F;
   private final grm G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gik(grm $$0, glr $$1, gfi $$2, bvj $$3, bvj $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dy());
   }

   private gik(grm $$0, glr $$1, gfi $$2, bvj $$3, bvj $$4, fbx $$5) {
      super($$2, $$3.dA(), $$3.dC(), $$3.dG(), $$5.d, $$5.e, $$5.f);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bvj a(bvj $$0) {
      return (bvj)(!($$0 instanceof cma) ? $$0 : ((cma)$$0).z());
   }

   @Override
   public giu b() {
      return giu.d;
   }

   @Override
   public void a(fgu $$0, fln $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = bae.d((double)$$2, this.K, this.H);
      double $$5 = bae.d((double)$$2, this.L, this.I);
      double $$6 = bae.d((double)$$2, this.M, this.J);
      double $$7 = bae.d((double)$$3, this.D.dA(), $$4);
      double $$8 = bae.d((double)$$3, this.D.dC(), $$5);
      double $$9 = bae.d((double)$$3, this.D.dG(), $$6);
      glj.a $$10 = this.b.c();
      fbx $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), $$2, new fgq(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dA();
      this.I = (this.E.dC() + this.E.dE()) / 2.0;
      this.J = this.E.dG();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
