public class gch extends gcn {
   private static final int a = 3;
   private final gff b;
   private final bsr D;
   private final bsr E;
   private int F;
   private final gkh G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;
   private double M;

   public gch(gkh $$0, gff $$1, fzf $$2, bsr $$3, bsr $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$3.dr());
   }

   private gch(gkh $$0, gff $$1, fzf $$2, bsr $$3, bsr $$4, exc $$5) {
      super($$2, $$3.dt(), $$3.dv(), $$3.dz(), $$5.c, $$5.d, $$5.e);
      this.b = $$1;
      this.D = this.a($$3);
      this.E = $$4;
      this.G = $$0;
      this.c();
      this.d();
   }

   private bsr a(bsr $$0) {
      return (bsr)(!($$0 instanceof cjh) ? $$0 : ((cjh)$$0).C());
   }

   @Override
   public gcr b() {
      return gcr.e;
   }

   @Override
   public void a(fbm $$0, ffy $$1, float $$2) {
      float $$3 = ((float)this.F + $$2) / 3.0F;
      $$3 *= $$3;
      double $$4 = ayo.d((double)$$2, this.K, this.H);
      double $$5 = ayo.d((double)$$2, this.L, this.I);
      double $$6 = ayo.d((double)$$2, this.M, this.J);
      double $$7 = ayo.d((double)$$3, this.D.dt(), $$4);
      double $$8 = ayo.d((double)$$3, this.D.dv(), $$5);
      double $$9 = ayo.d((double)$$3, this.D.dz(), $$6);
      gez.a $$10 = this.b.c();
      exc $$11 = $$1.b();
      this.G.a(this.D, $$7 - $$11.a(), $$8 - $$11.b(), $$9 - $$11.c(), this.D.dE(), $$2, new fbi(), $$10, this.G.a(this.D, $$2));
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
      this.H = this.E.dt();
      this.I = (this.E.dv() + this.E.dx()) / 2.0;
      this.J = this.E.dz();
   }

   private void d() {
      this.K = this.H;
      this.L = this.I;
      this.M = this.J;
   }
}
